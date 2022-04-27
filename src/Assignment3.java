import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(7000));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//*[text()=\" User\"]")).click();
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"okayBtn\"]")));
		driver.findElement(By.xpath("//button[@id=\"okayBtn\"]")).click();
		//WebElement dropDown=driver.findElement(By.cssSelector("select.form-control"));
		//Select drop=new Select(dropDown);
		//drop.deselectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("select.form-control")).click();
		//Thread.sleep(2000);
		WebElement dropDown=driver.findElement(By.cssSelector("select.form-control"));
		Select drop=new Select(dropDown);
		drop.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();//agree to the terms and conditions
		//css selector tagmame#id
		driver.findElement(By.cssSelector("input#signInBtn")).click();//this is sign on button
		
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Add ']")));
		
		List<WebElement> product;
		product=driver.findElements(By.xpath("//button[text()='Add ']"));
		for(int i=0;i<product.size();i++)
		{
			product.get(i).click();
			
		}
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		
		
		
	}

}
