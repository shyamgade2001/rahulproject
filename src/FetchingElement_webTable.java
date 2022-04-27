import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class FetchingElement_webTable {

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
		
		
		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		price = rows.stream().filter(s -> s.getText().contains("Strawberry"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

		if(price.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(price.size()<1);



		}



		private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		return pricevalue;

	}

}
