package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println(" test started");
	}

	// on test success method listener
	public void onTestSuccess(ITestResult result) {
		System.out.println("test sucess");

		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test fail ");

		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test skip");

	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(" test fail");

		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("test fail");

		
	}

	public void onStart(ITestContext context) {
		System.out.println(" on start ");

		
	}

	public void onFinish(ITestContext context) {
		System.out.println(" on finish");

	
	}
	
	

}
