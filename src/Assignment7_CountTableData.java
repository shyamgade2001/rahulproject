import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment7_CountTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table= driver.findElement(By.cssSelector("table[id=\"product\"][name=\"courses\"]"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); 
		
		List<WebElement> tablerow= table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		
		for(int i=0;i<tablerow.size();i++)
		{
			System.out.println(tablerow.get(i).getText()); 
		}
		
		
	}

}
