package com.unisuper.mvcframework.mvccucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AngularToDoPage extends BasePage{
	
	WebDriver driver = null;
	WebDriverWait wait = null;
	AngularToDoPageElements objangularpageelement =null;
	String itemname;
	String itemnumber;
	String todotext;
	Actions action;
	//COnstructor with driver
	public AngularToDoPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		objangularpageelement =new AngularToDoPageElements(driver);
		action = new Actions(driver);
		
	}

	public AngularToDoPage enterdata(String value) 
	{
		//driver.findElement(By.id("new-todo")).sendKeys(value);
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getnewtodotextbox()));
		objangularpageelement.getnewtodotextbox().sendKeys(value);
		objangularpageelement.getnewtodotextbox().sendKeys(Keys.RETURN);
		return this;
		
	}
	
	public AngularToDoPage getnewtodopane() 
	{
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getnewtodotextbox()));
		todotext = objangularpageelement.getnewtodotextbox().getText();
		
		return this;
	
	}
	public String getTodotext() {
		return todotext;
	}



	public String getitemdata() 
	{
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getitemlabelname()));
		itemname = objangularpageelement.getitemlabelname().getText();
		return itemname;
	}
	
	public AngularToDoPage completedone()
	{
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getcheckdone()));
		objangularpageelement.getcheckdone().click();
		return this;
	}
	public AngularToDoPage editdata(String originalvalue,String editedvalue)
	{
		try{
			action.moveToElement(objangularpageelement.getitemlabelname()).doubleClick().build().perform();
		//objangularpageelement.getitemlabelname().click();
		//objangularpageelement.getitemlabelname().click();
		objangularpageelement.getitemlabelname().sendKeys(editedvalue);
		return this;
		}catch (NoSuchElementException e){
			System.out.println("In exception");
			if (driver.findElement(By.tagName("body")).getText().contains(originalvalue))
			{
				
			}
				
		}
		return this;
	}

	public AngularToDoPage getitemnumberfromtodo() {
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getitemcountlabel()));
		itemnumber = objangularpageelement.getitemcountlabel().getText();
		return this;
	}

	public String getItemnumber() {
		//System.out.println("itemnumber"+itemnumber);
		return itemnumber;
	}

	public AngularToDoPage completemenutoggle()
	{
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.gettoggleall()));
		objangularpageelement.gettoggleall().click();
		return this;
	}
	
	public AngularToDoPage clickclearcomplete()
	{
		wait.until(ExpectedConditions.visibilityOf(objangularpageelement.getClearcompleted()));
		objangularpageelement.getClearcompleted().click();
		return this;
	}

}
