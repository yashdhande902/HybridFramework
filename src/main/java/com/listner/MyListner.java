package com.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utility.DriverUtils;

public class MyListner implements ITestListener {

	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult result) {
	
		try {
			DriverUtils.getScreenshot(result.getName());
		} catch (Exception e) {
 			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		
	}

	public void onTestStart(ITestResult arg0) {
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}

}
