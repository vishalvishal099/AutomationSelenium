package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverHelper {
	static WebDriver driver;

	public static WebDriver StartBrowser(String bName, String URL) {
		if (bName.equalsIgnoreCase("Firefox")) {
             driver= new FirefoxDriver();
		}
		else if(bName.equalsIgnoreCase("CHROME")){
			System.setProperty("webdriver.chrome.driver","D:\\eclipse\\DataBaseConnctivity\\Driver\\New\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
	}
        
}
