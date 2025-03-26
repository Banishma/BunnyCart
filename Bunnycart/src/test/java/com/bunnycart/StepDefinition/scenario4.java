package com.bunnycart.StepDefinition;

import com.bunnycart.Pages.bunnycartPage4;
import com.bunnycart.ScreenShot.bunnycartcapture;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scenario4 {
	@And("User enter the {string} in Email field")
	public void user_enter_the_in_email_field(String string) {
	    bunnycartPage4.enterEmail("banishmadurai@gmail.com");
	}
	@And("User enters the {string} in Password field")
	public void user_enters_the_in_password_field(String string) throws Exception {
		Thread.sleep(2000);
	   bunnycartPage4.enterPassword("Bani2000@");
	}
	@And("User click the Sign in button to login")
	public void user_click_the_sign_in_button_to_login() {
	   bunnycartPage4.clickSignIn();
	  
	}

	@Then("User search for product1")
	public void user_search_for_product1() throws Exception {
		Thread.sleep(2000);
	   bunnycartPage4.searchProduct1("Duckweed");
	   Thread.sleep(2000);
	}
	
	
	@And("User add product1 to cart")
	public void user_add_product1_to_cart() throws Exception {
		Thread.sleep(2000);
	    bunnycartPage4.clickAddToCart();
	}

	@And("User add product2 to cart")
	public void user_add_product2_to_cart() throws Exception {
		
		 bunnycartPage4.clickAddToCart();
	}

	@And("User add product3 to cart")
	public void user_add_product3_to_cart() throws Exception {
		
		 bunnycartPage4.clickAddToCart();
	}
	

	@Then("User search for product2")
	public void user_search_for_product2() throws InterruptedException {
		
		bunnycartPage4.searchProduct2("Hairgrass");
	}

	@Then("User search for product3")
	public void user_search_for_product3() throws Exception {
		
		bunnycartPage4.searchProduct3("Guppy grass");
	}

}
