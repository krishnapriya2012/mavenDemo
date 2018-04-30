package org.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.genericlib.BaseTest;

public class TaskListPage
{
   @FindBy(xpath="//table[@class='taskRowsTable']//div[@class='title ellipsis']")
   private List<WebElement> allTasks;
   
   @FindBy(xpath="//div[.='Accounting']/../../..//div[@class='img']")
   private WebElement checkboxClick;
   
   @FindBy(xpath="(//div[@class='deleteButton'])[1]")
   private WebElement deleteBtn;
   
   public TaskListPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void getAllTables(String taskname) 
   {
	   for(WebElement tbl:allTasks)
	   {
		   JavascriptExecutor JS = (JavascriptExecutor)BaseTest.driver;
		   JS.executeScript("arguments[0].scrollIntoView()",tbl);
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println("In for loop: "+tbl.getText());
		   if (tbl.getText().equalsIgnoreCase(taskname))
		   {
			   System.out.println("Inside the if condition");
			   String str = "//div[.='"+tbl.getText()+"']/../../..//div[@class='img']";
			   WebElement ele = BaseTest.driver.findElement(By.xpath(str));
			   ele.click();
			   deleteBtn.click();
			   
			   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   }
	   }
	  
	   
   }
   

}
