package com.unisuper.mvcframework.mvccucumber.stepdefinitions;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.unisuper.mvcframework.mvccucumber.pages.AngularToDoPage;
import org.apache.log4j.Logger;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("deprecation")
public class ToDoSteps {
	
	WebDriver driver = null;
	private DriverInstance objdriverinst;
	AngularToDoPage objangularpage =null;
	private final Logger logger = Logger.getLogger(ToDoSteps.class);
	/**
	 * 
	 */
	public ToDoSteps(DriverInstance objdriverinstance) {
		this.objdriverinst =objdriverinstance;
		 driver = objdriverinst.getDriver();
		objangularpage = new AngularToDoPage(driver);	
	}
	//AngularToDoPage objangularpage  ;
	String actualdata;
	String item;
	


	@When("^the user creates a new item \"([^\"]*)\"  in ToDo$")
	public void usercreatesnewitem(String newitem) throws Throwable {
		this.item = newitem;
		objangularpage.enterdata(newitem);
		logger.info("Entered new item");
	}

	@Then("^he should be able to view it\\.$")
	public void usershouldbeabletoview() throws Throwable {
		actualdata =objangularpage.getitemdata();
		System.out.println("actualdata"+actualdata);
		System.out.println("newitem"+item);
		Assert.assertEquals("Strings matched", item, actualdata);
	}

/*	@When("^the user edits an existing item \"([^\"]*)\" to \"([^\"]*)\"$")
	public void usereditsanexistingitem(String existingvalue, String newvalue) throws Throwable {
		objangularpage.editdata(existingvalue,newvalue);
	}

	@Then("^the user should be able to view the edited item$")
	public void the_user_should_be_able_to_view_the_edited_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}*/

	@When("^the user tries to complete the item \"([^\"]*)\"$")
	public void usercompleteitem(String arg1) throws Throwable {
		objangularpage=objangularpage.completedone();
	}


	@Then("^the user should not be able to view the item$")
	public void theusershouldnotbeabletoviewtheitem() throws Throwable {
		objangularpage=objangularpage.getitemnumberfromtodo();
		Assert.assertEquals("0", objangularpage.getItemnumber().substring(0,1));
	}
	@Given("^user has a completed item \"([^\"]*)\"$")
	public void user_has_a_completed_item(String existingitem) throws Throwable {
		this.item = existingitem;
		actualdata =objangularpage.getitemdata();
		System.out.println("actualdata"+actualdata);
		System.out.println("existingitem"+existingitem);
		Assert.assertEquals("Strings matched", existingitem, actualdata);
	}
	
	@When("^the user tries to toggle the item$")
	public void usertriestotoggletheitem() throws Throwable {
		objangularpage=objangularpage.completedone();
	}

	@Then("^the user should  be able to view the item$")
	public void the_user_should_be_able_to_view_the_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^the user toggles the menu selection$")
	public void the_user_toggles_the_menu_selection() throws Throwable {
		objangularpage=objangularpage.completemenutoggle();
	}

	@Then("^all the created items should set complete$")
	public void all_the_created_items_should_set_complete() throws Throwable {
		objangularpage=objangularpage.getitemnumberfromtodo();
		Assert.assertEquals("0", objangularpage.getItemnumber().substring(0,1));
	}

	@When("^the user filters the selection$")
	public void the_user_filters_the_selection() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	}

	@When("^the user close an item$")
	public void the_user_close_an_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^the user selects clear completed$")
	public void the_user_selects_clear_completed() throws Throwable {
		objangularpage=objangularpage.clickclearcomplete();
	}
	@Then("^the user should see an empty panel$")
	public void the_user_should_see_an_empty_panel() throws Throwable {
		Assert.assertEquals("", objangularpage.getnewtodopane().getTodotext());
	}
	/*	@AfterClass()
	public void teardown()
	{
		if(driver!=null)
		{
		driver.close();
		driver.quit();
		}
	}*/
}
