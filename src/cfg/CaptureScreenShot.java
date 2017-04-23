package cfg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CaptureScreenShot {
	
	public static String CaptureScree(WebDriver driver,String screenshotName){
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source  = ts.getScreenshotAs(OutputType.FILE);
			String Dest = System.getProperty("user.dir")+"\\Report\\Screeshots\\"+screenshotName+".png";
			File destination = new File(Dest);
			org.apache.commons.io.FileUtils.copyFile(source, destination);
			System.out.println("Screeshot taken");
            return Dest;
		}
		catch(Exception e){
			System.out.println("Exception while taking screen shot"+e.getMessage());
			return e.getMessage();
		}
		
	}

}
