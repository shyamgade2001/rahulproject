
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement move=driver.findElement(By.cssSelector("a[id=\"nav-link-accountList\"]"));

		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]"))).doubleClick().keyDown(Keys.SHIFT).sendKeys("Avnish").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();

	
	}

}
