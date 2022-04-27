import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSL_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions options=new EdgeOptions();
		
		options.setAcceptInsecureCerts(true);
				
		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver=new EdgeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle()); 

	}

}
