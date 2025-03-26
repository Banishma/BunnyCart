package com.bunnycart.Pages;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.browser;
import com.bunnycart.Locators.bunnycartPage3Object;
import com.bunnycart.ScreenShot.bunnycartcapture;

public class bunnycartPage3 extends browser {
	public static void clickSignIn() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Clicking Signin link");
		logger1.log(Status.INFO,"Clicking the SignIn link");

    	try {
    		
			bunnycartPage3Object.signIn().click();
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
			bunnycartPage3Object.emailEnter().sendKeys(data);
			System.out.println("Entered the Email");
			logger1.log(Status.PASS,"Email entered successfully");
			logger1.addScreenCaptureFromPath(bunnycartcapture.screenShot("Scenario3"));
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
			bunnycartPage3Object.enterPassword().sendKeys(str);
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
			bunnycartPage3Object.signInButton().click();
			System.out.println("Clicked the signin");
			logger1.log(Status.PASS,"Clicked the signin button successfully");
		} catch (Exception e) {
          	System.out.println("Failed to click signin button" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clicking signin button");
		}
          }

}
