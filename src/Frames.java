import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//*[text()='Free Access to InterviewQues/ResumeAssistance/Material']")).click();
		
		Set <String> windows=driver.getWindowHandles();//(parent,child)
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='mentor@rahulshettyacademy.com']")));
		//driver.findElement(By.xpath("//*[text()='JOIN NOW']")).click();
		//String abc=driver.findElement(By.xpath("//*[text()='mentor@rahulshettyacademy.com']")).getText();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='mentor@rahulshettyacademy.com']")));		
		String abc=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parent);

		driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys(abc);
		

	}

}
