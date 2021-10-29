package testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Demo implements ITestListener{
	public WebDriver driver;

	public void onTestStart(ITestResult result) {
		Reporter.log("test started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("test success",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("test failure",true);
		
		int status = result.getStatus();
		String name = result.getName();
		
		if(status==2) {
			Photo p=new Photo();
			p.getPhoto(driver, name);
		}
		
	}

	public void onTestSkipped(ITestResult result) {
	Reporter.log("testcaseskipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("success percentage",true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on test failure",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("on start of tc",true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("on finish of tc",true);
	}

}
