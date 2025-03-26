package com.bunnycart.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bunnycart.Browser.browser;
import com.bunnycart.Pages.bunnycartPage3;
import com.bunnycart.ScreenShot.bunnycartcapture;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class scenario3 extends browser{
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
	   browser.openBrowser();
	}

	@Then("User clicks on sign in")
	public void user_clicks_on_sign_in() throws Exception {
		Thread.sleep(2000);
		bunnycartPage3.clickSignIn();
	}

	@And("User enter the {string} in Email")
	public void user_enter_the_in_email(String string) throws Exception {
		Thread.sleep(2000);
		bunnycartPage3.enterEmail("banishmadurai@gmail.com");
		Thread.sleep(2000);
		 WebDriver driver = new ChromeDriver();
		   
	}

	@And("User enters the invalid {string} in Password")
	public void user_enters_the_invalid_in_password(String string) {
		bunnycartPage3.enterPassword("Bani");
	}

	@And("User click on sign in button")
	public void user_click_on_sign_in_button() {
		bunnycartPage3.clickSignInButton();
	}

	@And("User closes the browser")
	public void user_closes_the_browser() {
	    browser.closeBrowser();
	}

	@And("User enters the valis data {string} in Password")
	public void user_enters_the_valis_data_in_password(String string) {
		bunnycartPage3.enterPassword("Bani2000@");
	}

}
