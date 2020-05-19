package Execution;

import java.io.File;
import java.io.IOException;
import java.nio.file.spi.FileTypeDetector;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnersss extends Startup implements ITestListener {

	private static final OutputType<File> OutputType = null;
	WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Success of test cases and its details are : " + result.getName());
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failure of test cases and its details are : " + result.getName());
		try {
			screenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		/*System.out.println("Skip of test cases and its details are : " + result.getName());
		try {
			screenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failure of test cases and its details are : " + result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	//	System.out.println("Test started at "+phototime());
	//	System.out.println("test Started at "+phototime());
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	//	System.out.println("test Finished at "+phototime());
		//System.out.println("Test ended at"+phototime());	
	

	
	
	}
}
	
	


