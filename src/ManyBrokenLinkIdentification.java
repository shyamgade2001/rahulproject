import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import net.jodah.failsafe.internal.util.Assert;

public class ManyBrokenLinkIdentification {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links= driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responce= conn.getResponseCode();
			System.out.println(responce);
			if(responce>400)
			{
				System.out.println("The link with Text"+link.getText()+"is broken with code"+responce);
			}
		}
		
	}

}
