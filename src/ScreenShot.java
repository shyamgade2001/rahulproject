import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\91992\\Desktop\\Selenium\\Rahul Shetty\\screenshot.png"));

	}

}
