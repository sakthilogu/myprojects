package authenticate;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener{
	
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase finished");
	}
	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("test running");
	}
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase failed");
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase partial success");
	}
	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase skipped");
	}
	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase execution started");
	}
	
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("testcase successfully completed");
	}
	
}
