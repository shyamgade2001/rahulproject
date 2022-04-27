import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class latest_DroDown_Looping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("(//*[string()=\"1 Adult\"])[2]")).click();
		Thread.sleep(2000);
		/*
		int i=1;
		while(i<5)
		{
			driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]/*")).click();
		i++;
		System.out.println(driver.findElement(By.xpath("(//*[@dir=\"auto\" and @class=\"css-76zvg2 r-homxoj r-adyw6z r-q4m81j\"])[1]")).getText());
		}
	    */
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//*[@data-testid=\"Adult-testID-plus-one-cta\"]/*")).click();
			System.out.println(driver.findElement(By.xpath("(//*[@dir=\"auto\" and @class=\"css-76zvg2 r-homxoj r-adyw6z r-q4m81j\"])[1]")).getText());

		}
		
		}
		

	}


