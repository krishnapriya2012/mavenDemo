package org.sample.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public static WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	    //driver=new FirefoxDriver();
		//driver.get("https://demo.actitime.com/login.do");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
    @AfterMethod
    public void PostCondition()
    {
    	
    
    	//driver.close();
    }
}
