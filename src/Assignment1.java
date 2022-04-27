import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

		
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertFalse(driver.findElement(By.name("checkBoxOption1")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size()); 
		



	}

}
