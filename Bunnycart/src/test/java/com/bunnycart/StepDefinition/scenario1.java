package com.bunnycart.StepDefinition;

import com.bunnycart.Browser.browser;
import com.bunnycart.Pages.bunnycartPage1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class scenario1 {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	   browser.openBrowser();
	}

	@And("User navigates to the {string} webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	
	   browser.navigateToUrl("https://www.bunnycart.com/aquatic-plants/duckweed");
	}

	@Then("User clicks on creat account")
	public void user_clicks_on_creat_account() {
	    bunnycartPage1.clicCreatAccount();
	}

	@And("User enters {string} in First name")
	public void user_enters_in_first_name(String string) {
	   bunnycartPage1.enterFirstName("Banishma");
	}

	@And("User enters {string} in Last name")
	public void user_enters_in_last_name(String string) {
		bunnycartPage1.enterLastName("D V");
	}

	@And("User enters {string} in Email")
	public void user_enters_in_email(String string) {
		bunnycartPage1.enterEmail("banishmadurai@gmail.com");
	}

	@And("User enters {string} in Password")
	public void user_enters_in_password(String string) {
		bunnycartPage1.enterPassword("Bani2000@");
	}

	@And("User enters invaliddata in Confirm Password {string}")
	public void user_enters_invaliddata_in_confirm_password(String string) {
		bunnycartPage1.enterConfirmPassword(" ");
	}

	@And("User enters {string} in WhatsApp Number")
	public void user_enters_in_whats_app_number(String string) {
		bunnycartPage1.enterWhatsAppNumber("9150802602");
	}

	@And("User click on the creat button")
	public void user_click_on_the_creat_button() {
		bunnycartPage1.clickCreatAccountButton();
	}

	@And("User verify an error message")
	public void user_verify_an_error_message() {
	    bunnycartPage1.errorMessage();
	}

	@And("user close the browser")
	public void user_close_the_browser() {
	    browser.closeBrowser();
	}

	@And("User enters validata in Confirm Password '")
	public void user_enters_validata_in_confirm_password() {
		bunnycartPage1.enterConfirmPassword("Bani2000@");
	}

	@And("User verify an successfully registered message")
	public void user_verify_an_successfully_registered_message() {
	   bunnycartPage1.successMessage();
	}

	@And("User enters validata in Confirm Password 'Bani2000@")
	public void user_enters_validata_in_confirm_password_bani2000() {
	
	}

}
