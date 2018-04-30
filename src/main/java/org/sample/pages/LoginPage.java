package org.sample.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.genericlib.BasePage;

public class LoginPage extends BasePage{
	@FindBy(id="username")
	
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement paswrd;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifythetitle(WebDriver driver,String etitle)
	{
		verifyTitle(driver,etitle);
	}
	
	public void enterUser()
	{
		user.sendKeys("admin");
	}
	public void enterPwd()
	{
		paswrd.sendKeys("manager");
	}
	public void clickLogin()
	{
		loginbtn.click();
	}
}
