import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String url= driver.findElement(By.cssSelector("a[href*='soap']")).getAttribute("href");
		String url1= driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");

		HttpURLConnection conn=(HttpURLConnection) new URL(url1).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responce= conn.getResponseCode();
		System.out.println(responce);

	}

}

