import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.v95.emulation.model.DisabledImageType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenNewWindows_Selenium4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set <String> handler= driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parent= it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/#/index");
		//String abc=driver.findElement(By.xpath("//*[text()='Core java for Automation Testers + Interview Programs']")).getText(); 
		String course=driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p\"]")).get(3).getText();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("(//input[@name=\"name\" and @type=\"text\"])[1]")).sendKeys(course);

	}

}
