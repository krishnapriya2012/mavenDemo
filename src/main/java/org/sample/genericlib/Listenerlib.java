package org.sample.genericlib;

import java.io.File;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public  class Listenerlib  implements ITestListener {
	

 public void onTestStart(ITestResult result)
   {
	
	   Reporter.log("test started"+result.getTestName()+" started",true);
   }
 
 
 public void onTestSuccess(ITestResult result)
 {
	 Reporter.log("test success "+result.getTestName(),true);
	 
 }
 
 public void onTestFailure(ITestResult result)
 {
	 System.out.println("failed in ontestfailure method");
	 TakesScreenshot t=(TakesScreenshot)BaseTest.driver;
	 File src=t.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./screenshots/"+result.getMethod().getMethodName()+".png");
	/* try {
		FileUtils.copyFile(src,dest);
	} catch (IOException e) {
		
		e.printStackTrace();
	}*/
	 Reporter.log("test failed "+result.getTestName(),true);
 }


public void onTestSkipped(ITestResult result) {
	
	
}


public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
}


public void onStart(ITestContext context) {
	
	
}


public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}

}
