package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	public static WebDriver driver= null;
	public static Properties p=null;
    //private static WebDriverWait w = null;
	
	public Utilities() throws Exception {
				if(driver==null) {
			FileInputStream fis = new FileInputStream("User.dir"+"/ExternalSource/Config.properties");
			p = new Properties();
			p.load(fis);		
			System.setProperty(p.getProperty("chromeDriver_Name"),p.getProperty("chromedriver_Path"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(p.getProperty("wait_Small")),TimeUnit.SECONDS);
			//Utilities r = new Utilities();
			//r.setWait(Integer.parseInt(p.getProperty("wait_Small")));			
		}
	}
	
	/*public void setWait(int timePeriod) {
		w = new WebDriverWait(driver,timePeriod);
	}
	
	public WebDriverWait getWait() {
		return w;
	}*/
	public WebDriver getDriver() {
		return driver;
	}
}

