package com.bunnycart.StepDefinition;

import com.bunnycart.Pages.bunnycartPage5;

import io.cucumber.java.en.And;

public class scenario5 {
	@And("User enter the {string} Email field")
	public void user_enter_the_email_field(String string) {
	   bunnycartPage5.enterEmail("banishmadurai@gmail.com");
	}

	@And("User enters the {string} Password field")
	public void user_enters_the_password_field(String string) {
		 bunnycartPage5.enterPassword("Bani2000@");
	}

	@And("User click on Sign in button to login")
	public void user_click_on_sign_in_button_to_login() {
		 bunnycartPage5.clickSignIn();
	}

	@And("User click on Sign out button")
	public void user_click_on_sign_out_button() throws Exception {
		Thread.sleep(2000);
		 bunnycartPage5.clickSignOut();
	}


}
