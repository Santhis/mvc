package com.unisuper.mvcframework.mvccucumber.stepdefinitions;

//import java.util.ResourceBundle;

import java.util.ResourceBundle;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class DriverInstance {
	   private static WebDriver driver = null;
	  
	   
	@Before("@todo")
	public void setup()
	{
		ResourceBundle config = ResourceBundle.getBundle("configfile");
		String browser = config.getString("browser");
		//String browser = "chrome";
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://scripts//jarfiles//chromedriver.exe");
			 if(driver==null)
			  driver = new ChromeDriver();
			 driver.get("http://todomvc.com");
			
		}else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C://scripts//jarfiles//chromedriver.exe");
			 if(driver==null)
			  driver = new ChromeDriver();
			 
			
		}
		
		 
		 
		
	}
	public WebDriver getDriver() {
	      return driver;
	   }
	@SuppressWarnings("deprecation")
	@Given("^the user is on mvc angular page$")
	public void userisonmvcangular() throws Throwable {
	
		driver.findElement(By.linkText("AngularJS")).click();
		Assert.assertEquals("AngularJS • TodoMVC", driver.getTitle());
		
	}

}
