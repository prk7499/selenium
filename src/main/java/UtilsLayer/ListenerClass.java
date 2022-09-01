package UtilsLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerClass extends ExtentReportSetup implements ITestListener{

	
	protected static ExtentTest extentTest;

	public void onStart(ITestContext context) {
	   System.out.println("Suite is Started");
	   extent=ExtentReportSetup.extentReportMethod();
		
	}
	public void onTestStart(ITestResult result) {
	  ExtentTest extentTest=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
	
		extentTest.log(Status.FAIL, result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
	
		extentTest.log(Status.SKIP, result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}


	public void onFinish(ITestContext context) {
		System.out.println("Suite is Ended");
		extent.flush();
		
	}

}
