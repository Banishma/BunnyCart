package com.bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.browser;
import com.bunnycart.Locators.bunnycartPage2Object;

public class bunnycartPage2 extends browser{
	public static void clickSignIn() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking Signin link");
		logger1.log(Status.INFO,"Clicking the SignIn link");
		
    	try {
			bunnycartPage2Object.signIn().click();
			System.out.println("clicked the signin link");
			logger1.log(Status.PASS,"Successfully clicked the Signin link");
		} catch (Exception e) {
          	System.out.println("Failed to click signin link" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in clicking the signin link");
		}
          }
	public static void enterEmail(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering email");
		logger1.log(Status.INFO,"Entering the email into the field variable");
    	try {
			bunnycartPage2Object.emailEnter().sendKeys(data);
			System.out.println("Entered the Email");
			logger1.log(Status.PASS,"Email entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter email" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering email");

		}
          }
	public static void enterPassword(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering password");
		logger1.log(Status.INFO,"Entering the password into the field variable");
    	try {
			bunnycartPage2Object.enterPassword().sendKeys(str);
			System.out.println("Entered the Password");
			logger1.log(Status.PASS,"Password entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter password"+e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering password");
		}
          }
	public static void clickSignInButton() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking signin button");
		logger1.log(Status.INFO,"Clicking the signin button");
    	try {
			bunnycartPage2Object.signInButton().click();
			System.out.println("clicked the signin button");
			logger1.log(Status.PASS,"Clicked the signin button successfully");
		} catch (Exception e) {
          	System.out.println("Failed to click signin button" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clicking signin button");
		}
          }
	public static void enterSearchProduct(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering product name");
		logger1.log(Status.INFO,"Entering the product to search into the field variable");
    	try { 		
    		 // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
          //  WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//input[@id='search']")));
          //  searchBox.sendKeys(str);
              //WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='action search']")));
              //searchIcon.click();
    		  //Thread.sleep(2000);
   		    bunnycartPage2Object.search().sendKeys(str);
   		 System.out.println("searched the product1");
			bunnycartPage2Object.searchsymbol().click();
			logger1.log(Status.PASS,"Product name entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter product name" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when entering product name");
		}
          }
	public static void clickProduct() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking product");
		logger1.log(Status.INFO,"Clicking the product");
    	try {
    		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		//WebElement product = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input")));
    		//product.click();
           // Thread.sleep(2000);
			bunnycartPage2Object.product().click();
			System.out.println("searched the product2");
			logger1.log(Status.PASS,"Clicked the product successfully");
		} catch (Exception e) {
          	System.out.println("Failed to click product" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clicking product");
		}
          }
	public static void clickAddToCart() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking Addto cart");
		logger1.log(Status.INFO,"Clicking the Addto cart");
    	try {   		
    		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    //  WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(bunnycartPage2Object.addToCart()));
    	    // addToCartButton.click();
    		Thread.sleep(2000);
			bunnycartPage2Object.addToCart().click();
			System.out.println("searched the product3");
			logger1.log(Status.PASS,"Clicked Addto cart successfully");
		} catch (Exception e) {
          	System.out.println("Failed to click Addto cart" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clickingAddto cart");
		}
          }
}
