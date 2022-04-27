import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Link_Count_onthePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.xpath("//body[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[5]/a")).click()
		;
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement FooterDriver=driver.findElement(By.cssSelector("div[id=\"gf-BIG\"]"));
		
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		WebElement childfooter=FooterDriver.findElement(By.cssSelector("div[id=\"gf-BIG\"] table tbody tr td ul"));
		System.out.println(childfooter.findElements(By.tagName("a")).size());
		
		int ab=childfooter.findElements(By.tagName("a")).size();
		for(int i=0;i<ab;i++)
		{
			String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
			childfooter.findElements(By.tagName("a")).get(i).sendKeys(click);
		}
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		 while(it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle()); 
		 }
		

	}

}
