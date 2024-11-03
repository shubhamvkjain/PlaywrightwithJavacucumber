package com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class testrunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	  features = "Features"//folder name
	  ,glue={"stepDefinition"} //package name for step def
	  )	
	
	public class TestRunner {}
}

