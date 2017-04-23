package cfg;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reporting {
	static ExtentReports report;
	ExtentTest logger; 
	
	public static ExtentReports reportMethod() {
	 return report=new ExtentReports(System.getProperty("user.dir")+"\\Report\\LearnAutomation.html");
}
}