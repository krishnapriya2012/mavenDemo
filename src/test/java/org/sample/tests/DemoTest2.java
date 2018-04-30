package org.sample.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	 public void testD()
	 {
		Reporter.log("before test 2",true);
	 }
	
	@Test
	public void testA()
	{
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");*/
		Reporter.log("hii in another class",true);
	}
	
	@Test
	public void testa()
	{
		Reporter.log("in testB",true);
	}

}
