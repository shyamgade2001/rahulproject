import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Advanced_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
			
		driver.findElement(By.cssSelector("input[id=\"travel_date\"]")).click();
		
		
		while(!driver.findElement(By.cssSelector("[class=\"datepicker-days\"] [class=\"datepicker-switch\"]")).getText().contains("May"))

		{
			driver.findElement(By.cssSelector("div[class=\"datepicker-days\"] th[class=\"next\"]")).click();
		}
		
		
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count =driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("2"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
