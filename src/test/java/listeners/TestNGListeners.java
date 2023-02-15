package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestNGListeners implements ITestListener {
    ExtentTest test;
	ExtentReports extent = extendReports.extendsReports();
	
	@Override
	public void onTestStart(ITestResult result) {
	test = extent.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	test.log(Status.PASS, "Test passed successfuly");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
	test.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
	
		
	}

	@Override
	public void onFinish(ITestContext context) {
	extent.flush(); 
		
	}

}
