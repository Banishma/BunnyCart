package com.bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.browser;
import com.bunnycart.Locators.bunnycartPage1Object;
import com.bunnycart.ScreenShot.bunnycartcapture;

public class bunnycartPage1 extends browser{
	
	public static void clicCreatAccount() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking creat account link");
		logger1.log(Status.INFO,"Clicking the creat Account link");
		
    	try {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement createAccountBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='customer-register-link']")));
    		createAccountBtn.click();
			bunnycartPage1Object.creatAccount();
			System.out.println("clicked the creat account link");
			logger1.log(Status.PASS,"Successfully clicked the creat account link");
			 logger1.addScreenCaptureFromPath(bunnycartcapture.screenShot("Scenario1"));
		} catch (Exception e) {
			System.out.println("Failed to click creat account link" +e.getMessage());
			logger1.log(Status.FAIL,"Error occured in clicking the creat account link");
		}
    }
	public static void enterFirstName(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering Firstname");
		logger1.log(Status.INFO,"Entering the Firstname into the field variable");
	    	try {
				bunnycartPage1Object.firstName().sendKeys(data);
				System.out.println("Entered the Firstname");
				logger1.log(Status.PASS,"Firstname entered successfully");
			} catch (Exception e) {
	          	System.out.println("Failed ti enter FirstName" + e.getMessage());
	          	logger1.log(Status.FAIL,"Error occured in entering Firstname");
			}
	          }
	public static void enterLastName(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering Lastname");
		logger1.log(Status.INFO,"Entering the Lastname into the field variable");
    	try {
			bunnycartPage1Object.lastName().sendKeys(data);
			System.out.println("Entered the Firstname");
			logger1.log(Status.PASS,"Lastname entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter Lastname" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering Lastname");
		}
          }
	public static void enterEmail(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering email");
		logger1.log(Status.INFO,"Entering the email into the field variable");
    	try {
			bunnycartPage1Object.email().sendKeys(data);
			System.out.println("Entered the Email");
			logger1.log(Status.PASS,"Email entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter email" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering email");
		}
          }
	public static void enterPassword(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering password");
		logger1.log(Status.INFO,"Entering the password into the field variable");
    	try {
			bunnycartPage1Object.password().sendKeys(data);
			System.out.println("Entered the Password");
			logger1.log(Status.PASS,"Password entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter password" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering password");
		}
          }
	public static void enterConfirmPassword(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering confirmpassword");
		logger1.log(Status.INFO,"Entering the confirmpassword into the field variable");
    	try {
			bunnycartPage1Object.confirmPassword().sendKeys(data);
			System.out.println("Entered the ConfirmPassword");
			logger1.log(Status.PASS,"confirmPassword entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter confirmpassword" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering confirmpassword");
		}
          }
	public static void enterWhatsAppNumber(String data) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering whatsapp number");
		logger1.log(Status.INFO,"Entering the whatsapp number into the field variable");
    	try {
			bunnycartPage1Object.whatsAppNumber().sendKeys(data);
			System.out.println("Entered the Whatsapp number");
			logger1.log(Status.PASS,"whatsapp number entered successfully");
		} catch (Exception e) {
          	System.out.println("Failed to enter whatsapp number"+e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in entering confirmpassword");
		}
          }
	public static void clickCreatAccountButton() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking creat account button");
		logger1.log(Status.INFO,"Clicking the creat Account button");
    	try {
			bunnycartPage1Object.ceretButton().click();
			System.out.println("clicked the creataccount button");
			logger1.log(Status.PASS,"Successfully clicked the creat account button");
		} catch (Exception e) {
          	System.out.println("Failed to click creat account link"+e.getMessage());
          	logger1.log(Status.FAIL,"Error occured in clicking the creat account button");
		}
          }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void successMessage() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Successfull message");
		logger1.log(Status.INFO,"Successdully registered");
    	try {
			System.out.println("Successfully registered to bunnycart");
			logger1.log(Status.INFO,"Successfully registered");
		} catch (Exception e) {
          	System.out.println(e.getMessage());
          	logger1.log(Status.FAIL,"Message not displayed");
		}
          }
	public static void errorMessage() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("	Error message");
		logger1.log(Status.INFO,"Failed to register");
    	try {
			System.out.println("Failed to registered");
			logger1.log(Status.INFO,"failed to registered");
		} catch (Exception e) {
          	System.out.println(e.getMessage());
          	logger1.log(Status.FAIL,"Message not displayed");
		}
          }

}
