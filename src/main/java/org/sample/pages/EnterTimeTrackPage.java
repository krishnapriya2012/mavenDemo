package org.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.genericlib.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	@FindBy(xpath="//div[.='TASKS']")
	private WebElement task;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickTask()
	{
		task.click();
	}

}
