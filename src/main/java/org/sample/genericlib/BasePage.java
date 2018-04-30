package org.sample.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public void verifyTitle(WebDriver driver,String etitle)
	{
		try{
			
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("matching title",true);
			
			
		}
		catch(Exception e)
		{
			Reporter.log("not matching title",true);
			Assert.fail();
		}
		
	}

}
