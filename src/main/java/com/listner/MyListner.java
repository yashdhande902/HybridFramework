package com.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base.BaseClass;
import com.aventstack.extentreports.Status;
import com.utility.DriverUtils;

public class MyListner extends BaseClass implements ITestListener {

	public void onFinish(ITestContext result) {
		log.info("test suit is successfully executed");
		report.flush();
	}

	public void onStart(ITestContext result) {
		log.info("test suit ready for execution");
	

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailure(ITestResult result) {
		String path=DriverUtils.getScreenshot(result.getName());
		test.log(Status.FAIL, " Testcase failed with name " + result.getName());
		test.addScreenCaptureFromPath(path);

	}

	public void onTestSkipped(ITestResult result) {
		String path=DriverUtils.getScreenshot(result.getName());
		test.log(Status.SKIP, " Testcase skiiped with name " + result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestStart(ITestResult result) {

		test = report.createTest(result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Testcase passed with name " + result.getName());
		
	}

}
