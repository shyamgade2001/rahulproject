import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		driver.findElement(By.xpath("//body[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[5]/a")).click()
		;
		driver.findElement(By.cssSelector("input[id=\"checkBoxOption2\"]")).click();
		String abc=driver.findElement(By.cssSelector("label[for=\"benz\"]")).getText();
		System.out.println(abc);
		
		WebElement dropdown=driver.findElement(By.cssSelector("select#dropdown-class-example"));
		
		Select drop=new Select(dropdown);
		drop.selectByVisibleText(abc);
		driver.findElement(By.cssSelector("input#name")).sendKeys(abc);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String pqr=driver.switchTo().alert().getText(); 
		driver.switchTo().alert().accept();
		if (pqr.contains(abc))
		{
			System.out.println("Test execution Success");
		}
		else
		{
			System.out.println("Test execution Fail");

		}

	}

}
