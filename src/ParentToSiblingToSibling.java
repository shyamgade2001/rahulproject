import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ParentToSiblingToSibling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
		//System.out.println(driver.findElement(By.xpath("//div/button[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div/button[2]/parent::div/button[2]")).getText());


	}

}
