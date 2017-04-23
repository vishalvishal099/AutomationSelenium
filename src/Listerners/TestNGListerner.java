package Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Start--> Test case name :" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Success--> Test case name :" + result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failure--> Test case name :" + result.getName());		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Success--> Test case name :" + result.getName());		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case Skipped--> Test case name :" + result.getName());		
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case OnStart--> Test case name :" + context.getName());		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case onFinish--> Test case name :" + context.getName());		
		
	}
	

}
