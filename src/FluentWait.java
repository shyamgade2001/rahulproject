import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);

		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id=\"start\"] button")).click();
		//Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(25)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
	//	WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//			public WebElement apply(WebDriver driver) {
//				if(driver.findElement(By.cssSelector("div[id=\"finish\"] h4")).isDisplayed())
//				{
//					return driver.findElement(By.cssSelector("div[id=\"finish\"] h4"));
//				}
//				else
//				{
//					return null;
//				}
//			//}
//			
//		});
			System.out.println(driver.findElement(By.cssSelector("div[id=\"finish\"] h4")).getText());	
	}

}
