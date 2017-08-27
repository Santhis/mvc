package com.unisuper.mvcframework.mvccucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AngularToDoPageElements {

	WebDriver driver = null;



	@FindBy(id= "new-todo")
	private WebElement newtodo;
	
	@FindBy(id="clear-completed")
	private WebElement clearcompleted;

	 //@FindBy(xpath = "//label[contains(.,'text')]/preceding-sibling::input")
	@FindBy(xpath ="(.//*[@id='todo-list']//label)[last()]")
	 private WebElement itemlabel;
	  
	 @FindBy(id= "toggle-all")
	 private WebElement toggleall;
	 
	 @FindBy(css="input.toggle.ng-valid")
	 private WebElement chckdone;
	 
	 @FindBy(id ="todo-count")
	 private WebElement itemcount;

	public AngularToDoPageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//super();
	}
	
	public WebElement getitemcountlabel()
	{
		return itemcount;
	}
	
	public WebElement getnewtodotextbox()
	{
		return newtodo;
	}
	
	public WebElement getcheckdone()
	{
		return chckdone;
	}
	
	public WebElement gettoggleall()
	{
		return toggleall;
	}
	public WebElement getitemlabelname()
	{
		try{
			if (itemlabel.isDisplayed())
			return itemlabel;
		}catch (NoSuchElementException e){
			System.out.println("No such element");
		}
		return itemlabel ;
	}
	
	public WebElement getClearcompleted() {
		return clearcompleted;
	}
}
