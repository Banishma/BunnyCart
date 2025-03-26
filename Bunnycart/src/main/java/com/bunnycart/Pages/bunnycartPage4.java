package com.bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.browser;
import com.bunnycart.Locators.bunnycartPage4Object;

public class bunnycartPage4 extends browser {
	
	public static void enterEmail(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering email");
		logger1.log(Status.INFO,"Entering the email into the field variable");
    	try {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email-login']")));
            searchBox.sendKeys(str);
			//bunnycartPage4Object.emailEnter().sendKeys(str);
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
			bunnycartPage4Object.enterPassword().sendKeys(str);
			System.out.println("Entered the Password");
			logger1.log(Status.PASS,"Password entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter password"+e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering password");
		}
          }
	public static void clickSignIn() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking signin button");
		logger1.log(Status.INFO,"Clicking the signin button");
    	try {
			bunnycartPage4Object.signIn().click();
			System.out.println("Clicked the signin");
			logger1.log(Status.PASS,"Clicked the signin button successfully");
		} catch (Exception e) {
          	System.out.println("Failed to click signin button" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clicking signin button");
		}
          }
	public static void searchProduct1(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Searching product1");
		logger1.log(Status.INFO,"Entering the product1 name to search into the field variable");
		
    	try {    		
    		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           // WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
           // searchBox.sendKeys(str);
           // System.out.println("Entered search text: " + str);
           // WebElement product1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='https://www.bunnycart.com/pub/media/catalog/product/d/u/duckweed_1.jpg']")));
          //product1.click();
           // System.out.println("Searching Product1");    		
    		Thread.sleep(2000);
    		bunnycartPage4Object.search().sendKeys(str);
    		Thread.sleep(2000);
    		bunnycartPage4Object.product1().click();
            System.out.println("Searching Product1");
            logger1.log(Status.PASS,"Successfully searched Product1");
		} catch (Exception e) {
          	System.out.println("Failed to search product1 " +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when searching product1");
		}
          }
	public static void searchProduct2(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Searching product2");
		logger1.log(Status.INFO,"Entering the product2 name to search into the field variable");
    	try {
    		Thread.sleep(2000);
    		bunnycartPage4Object.search().sendKeys(str);
    		 System.out.println("Entered search text: " + str);
    		 Thread.sleep(2000);
    		bunnycartPage4Object.product2().click();
    		System.out.println("Clicked on Product2");
    		bunnycartPage4Object.productType().click();
    		
    		System.out.println("Searching product2");
    		logger1.log(Status.PASS,"Successfully searched Product2");
    		
    		
    		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	    //WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
    	   // searchBox.sendKeys(str);
    	   
    	   // WebElement product2 = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//img[@src='https://www.bunnycart.com/pub/media/catalog/product/h/a/hairgrass.jpg']")));
    	   // product2.click();
    	    
    	   // WebElement productType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='1 Bunch']")));
    	   // productType.click();
    	    
    	   // System.out.println("Searching product2 completed.");
    		
    	
		} catch (Exception e) {
          	System.out.println("Failed to search product2 " +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when searching product2");
		}
          }
	public static void searchProduct3(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Searching product3");
		logger1.log(Status.INFO,"Entering the product3 name to search into the field variable");
    	try {
    		
    		
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		//WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search']")));
            //searchBox.sendKeys(str);
           // System.out.println("Searching product3");
    		
    		
    		Thread.sleep(2000);
			bunnycartPage4Object.search().sendKeys(str);
		    System.out.println("Searching product3");
		    logger1.log(Status.PASS,"Successfully searched Product3");
		} catch (Exception e) {
          	System.out.println("Failed to search product3" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when searching product3");
		}
          }
	public static void clickAddToCart() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking Addto cart");
		logger1.log(Status.INFO,"Clicking the Addto cart");
    	try {
    		bunnycartPage4Object.addToCart().click();
			System.out.println("Clicked Addto Cart");
			logger1.log(Status.PASS,"Clicked Addto cart successfully");
    		
    		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           // WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='product-addtocart-button']")));
           //addToCartButton.click();

            //System.out.println("Clicked Add to Cart");
    		
    	
		} catch (Exception e) {
          	System.out.println("Failed to click Addto cart" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clickingAddto cart");
		}
          }

}
