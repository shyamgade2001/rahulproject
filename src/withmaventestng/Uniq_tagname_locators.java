package withmaventestng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Uniq_tagname_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String password1= getPassword(driver);
		String name="Avnish";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("password1");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		//Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
		
		//driver.close();
		
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=driver.findElement(By.cssSelector("form p")).getText();
		String passarray[]=passwordtext.split("'");
		
		String pass=passarray[1].split("'")[0];
		return pass;
	}
		
		
	

}
