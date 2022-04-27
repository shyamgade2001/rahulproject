import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
