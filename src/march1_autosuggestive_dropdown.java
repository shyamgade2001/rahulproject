import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class march1_autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		
		driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Type to Select\"]")).sendKeys("ind");
		Thread.sleep(2000);
		
		List<WebElement> options=driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
		
		for(WebElement option:options)
		{
			if (option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
		}
		
		

	}

}
