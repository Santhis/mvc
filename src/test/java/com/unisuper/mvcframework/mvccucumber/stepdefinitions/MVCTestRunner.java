package com.unisuper.mvcframework.mvccucumber.stepdefinitions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format={"html:report/mvcTest.html"},
		tags={"@todo"},
		dryRun=false,
		features="resources/features")
public class MVCTestRunner {

}
