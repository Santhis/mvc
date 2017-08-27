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

@SuppressWarnings("deprecation")
public class DriverInstance {
	   private static WebDriver driver = null;
	  
	   
	@Before("@todo")
	public void setup()
	{
		ResourceBundle config = ResourceBundle.getBundle("configfile");
		String browser = config.getString("browser");
		String url = "http://todomvc.com";
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			 if(driver==null)
			  driver = new ChromeDriver();
			 driver.get(url);
			
		}else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/geckodriver.exe");
			 if(driver==null)
			  driver = new ChromeDriver();
			 
			
		}
	
		
	}
	public WebDriver getDriver() {
	      return driver;
	   }
	
	@Given("^the user is on mvc angular page$")
	public void userisonmvcangular() throws Throwable {
	
		driver.findElement(By.linkText("AngularJS")).click();
		Assert.assertEquals("AngularJS • TodoMVC", driver.getTitle());
		
	}

}
