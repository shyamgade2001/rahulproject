import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//*[@name=\"name\"and @type=\"text\"])[1]")).sendKeys("Avnish");
		driver.findElement(By.name("email")).sendKeys("avnishgade@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("gadefamily");
		driver.findElement(By.className("form-check-input")).click();
		WebElement dropDown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select Drop=new Select(dropDown);
		Drop.selectByIndex(0);
		System.out.println(Drop.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[id=\"inlineRadio1\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("24");
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("10");
		driver.findElement(By.xpath("//input[@name=\"bday\"]")).sendKeys("2016");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());




	}

}
