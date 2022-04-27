import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);

		WebDriver driver = new EdgeDriver();

		String[] itemNeeded = {"Brocolli", "Beetroot", "Cucumber" };
		WebDriverWait wait=new WebDriverWait(driver, 5);

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(4000);
		addItems(driver, itemNeeded);
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		//System.out.println(driver.findElement(By.xpath("//*[text()='Code applied ..!']")).getText());
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemNeeded) {

		int j = 0;
		List<WebElement> product;
		product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {
			String[] name = product.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemNeededlist = Arrays.asList(itemNeeded);

			if (itemNeededlist.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

				if (j == itemNeeded.length) {
					break;
				}
			}

		}
	}
}
