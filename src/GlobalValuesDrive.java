import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String path="C:\\Users\\91992\\Desktop\\Selenium\\edgedriver_win64\\msedgedrive.exe";
//		System.setProperty("webdriver.edge.driver", path);
//		WebDriver driver=new EdgeDriver();
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\91992\\eclipse-workspace\\Selenium_Rahul_Shetty\\withmaventestng\\src\\Data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("browser", "Edge");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("C:\\Users\\91992\\eclipse-workspace\\Selenium_Rahul_Shetty\\withmaventestng\\src\\Data.properties");
		prop.store(fos, null);
		


	}

}
