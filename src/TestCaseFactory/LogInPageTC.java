package TestCaseFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import cfg.CaptureScreenShot;
import cfg.Reporting;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.google.common.reflect.ImmutableTypeToInstanceMap;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageFactory.LoginPageObj;
import Utility.driverHelper;

//@Listeners(Listerners.TestNGListerner.class)
public class LogInPageTC {
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void urlSetUp(){
		driver = driverHelper.StartBrowser("Chrome","https://accounts.google.com/");
	}
	

	@Test
	public void VerifyUserLogin() {
		report = new ExtentReports(System.getProperty("user.dir")+"\\Report\\LearnAutomation.html");
		
		logger = report.startTest("VerifyUserLogin");
		
		logger.log(LogStatus.INFO, "Browser Started");
		
		 
		
		logger.log(LogStatus.INFO, "Application Running up ");
		
		logger.log(LogStatus.PASS, "Title Verified");
		
		LoginPageObj loginPg = PageFactory.initElements(driver,LoginPageObj.class);
		
		loginPg.login_wordpress("Vishal", "Pass");
		
		logger.log(LogStatus.PASS, "Gmail Verified");
		
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("Singh"));
		
		logger.log(LogStatus.PASS, "Title Verified");

	}
	@Test
	public void asdad(){
		logger = report.startTest("asdad");
		logger.log(LogStatus.INFO, "Browser Started");
		driver.get("https://www.healthfusion.com/");
		System.out.println("https://www.healthfusion.com/");
		logger.log(LogStatus.INFO, "Application Running up ");
		String title2=driver.getTitle();
		System.out.println(title2);
		Assert.assertTrue(title2.contains(title2));
		logger.log(LogStatus.PASS, "Title Verified");
		
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {

			String screenshot_path = CaptureScreenShot.CaptureScree(driver,result.getName());
			
			String image = logger.addScreenCapture(screenshot_path);
			
			logger.log(LogStatus.FAIL, "Title verification", image);

		}
		
	}
         @AfterTest
        	 public void BeforeTest(){
        	report.endTest(logger);
     		report.flush();

     		driver.get("D://eclipse//DataBaseConnctivity//Report//LearnAutomation.html");
         }
}
