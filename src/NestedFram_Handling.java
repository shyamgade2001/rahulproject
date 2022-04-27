import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFram_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[text()='Nested Frames']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name=\"frame-top\"]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@name=\"frame-middle\"]")));
		
		System.out.println(driver.findElement(By.xpath("//*[text()='MIDDLE']")).getText());
		

	}

}
