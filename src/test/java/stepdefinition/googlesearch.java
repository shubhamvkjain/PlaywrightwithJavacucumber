package stepdefinition;

import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class googlesearch {
	
	  private Playwright playwright;
	    private Browser browser;
	    private Page page;
	
	
		@Given("User enters valid username")
	        public void user_enters_valid_username() {
			playwright = Playwright.create();
	        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        page = browser.newPage();
	        page.navigate("https://www.saucedemo.com/v1/");
	        page.locator("#user-name").fill("standard_user");
	
	    // Write code here that turns the phrase above into concrete actions
	}

	@And("password")
	public void password() {
	    // Write code here that turns the phrase above into concrete actions
		 page.locator("#password").fill("secret_sauce");
	}

	@And("click on login button")
	public void click_on_login_button() {
		 page.locator("#login-button").click();
	   
	}

	@Then("Logged in successfully")
	public void logged_in_successfully() {
	    System.out.println("logged in successfully");
	 
	}



}
