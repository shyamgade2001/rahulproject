import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class feb28_Dynamic_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[text()=\"flight status\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"From\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"International\"]")).click();
		driver.findElement(By.xpath("//*[text()=\", United Arab Emirates\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"India\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"Mumbai\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()=\"Search Flights\" and @dir=\"auto\"]")).click();

		

	}

}
