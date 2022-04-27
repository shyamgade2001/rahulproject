import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;



public class Searchbox_Func_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("input[id=\"search-field\"]")).sendKeys("Rice");
		// 1 Result
		List<WebElement> element= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>FiltredList= element.stream().filter(ele->ele.getText().contains("Rice")).collect(Collectors.toList());
		// 1 Result
		Assert.assertEquals(element.size(),FiltredList.size());
		
	}

}
