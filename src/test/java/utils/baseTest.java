package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseTest {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	
	
	
	{
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("sampleurl");
		String browserProperties = prop.getProperty("browser");
		String browsermaven = System.getProperty("browser");
		
		String browser = browsermaven!=null ? browsermaven: browserProperties;
		
		if(driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//msedgedriver.exe");
		driver = new EdgeDriver();
			}
			
			if(prop.getProperty("browser")=="chrome")
			{
//				code for chrome
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		}
		return driver;
		
		
	}

}
