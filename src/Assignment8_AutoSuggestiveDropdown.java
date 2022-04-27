import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment8_AutoSuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[id=\"autocomplete\"]")).sendKeys("ind");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[id=\"autocomplete\"]")));
		
		driver.findElement(By.cssSelector("input[id=\"autocomplete\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[id=\"autocomplete\"]")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.cssSelector("input[id=\"autocomplete\"]")).getAttribute("value");


	}

}
