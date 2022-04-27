import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		WebElement move=driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		move.click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String Parents= it.next();
		String Child= it.next();
		driver.switchTo().window(Child);
		
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());
		driver.switchTo().window(Parents);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());


	}

}
