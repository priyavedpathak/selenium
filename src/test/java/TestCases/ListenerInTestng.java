package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ListenerInTestng implements ITestListener {

	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish (ITestContext Result) {
	}
	
	public void onStart(ITestContext Result) {
		System.out.println("Your test case execution started");
	}
	
    public void onTestFailure(ITestResult Result) {
    	System.out.println("The of the test case failed is :" + Result.getName());
	}
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
    	
    }
    
    public void onTestSkipped(ITestResult Result) {
    	System.out.println("The name of the test case skipped is :" + Result.getName());
    }
    
    public void onTestStart(ITestResult Result) {
    	System.out.println(Result.getName()+ "Test case started");
    
    }
    public void onTestSuccess(ITestResult Result) {
    	System.out.println("The name of the testcase passed is :" + Result.getName());
    	
    }
}

