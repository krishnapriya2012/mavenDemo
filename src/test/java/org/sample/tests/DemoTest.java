package org.sample.tests;

import org.sample.genericlib.BaseTest;

import org.sample.pages.EnterTimeTrackPage;
import org.sample.pages.LoginPage;
import org.sample.pages.TaskListPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class DemoTest extends BaseTest {

		@Test
	public void testA() throws InterruptedException
	{
		//Reporter.log("failed",true);
		System.out.println("hii helloooo");
		//Assert.fail();
		/*LoginPage lp=new LoginPage(driver);
		TaskListPage tp = new TaskListPage(driver);
		EnterTimeTrackPage et= new EnterTimeTrackPage(driver);
		lp.verifythetitle(driver, driver.getTitle());
		lp.enterUser();
		lp.enterPwd();
		lp.clickLogin();
	    Thread.sleep(3000);
	    et.verifyTitle(driver, driver.getTitle());
	    Thread.sleep(3000);
	    et.clickTask();
	    Thread.sleep(3000);
	    et.verifyTitle(driver, driver.getTitle());
	    Thread.sleep(3000);
	    tp.getAllTables("Training");	*/	
	}
	}













