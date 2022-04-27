import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Handling_Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
//		System.setProperty("webdriver.edge.driver", path);
//		WebDriver driver= new EdgeDriver();
//		
//		driver.get("https://jqueryui.com/droppable/");
//		Actions a=new Actions(driver); 
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
//
//		WebElement source= driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
//		WebElement target= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
//
//		a.dragAndDrop(source, target).build().perform();
		
		//Frame handling using indexing
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("https:jqueryui.com/droppable");
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement target= driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		a.dragAndDrop(source, target).build().perform();
		
		
		

	}

}
