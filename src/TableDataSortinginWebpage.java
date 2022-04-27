import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class TableDataSortinginWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//list the webelements into list
		List<WebElement> elementlist=driver.findElements(By.xpath("//tr/td[1]"));
		//capture text of each webelement into new original list
		List <String> originallist= elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		//create Sortedlist from above step
		List<String> sortedlist= originallist.stream().sorted().collect(Collectors.toList());
	//	Assert.assertTrue(originallist.equals(sortedlist));
		Assert.assertEquals(originallist, sortedlist);
		
		

	}

}
