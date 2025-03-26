package com.bunnycart.Pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.bunnycart.Browser.browser;
import com.bunnycart.Locators.bunnycartPage5Object;
import com.bunnycart.ScreenShot.bunnycartcapture;

public class bunnycartPage5 extends browser{
	public static void enterEmail(String str) {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Entering email");
		logger1.log(Status.INFO,"Entering the email into the field variable");
    	try {
    		
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement emailField = wait.until(ExpectedConditions.visibilityOf(bunnycartPage5Object.emailEnter()));
            emailField.sendKeys(str);

            System.out.println("Entered the email");
            logger1.log(Status.PASS,"Email entered successfully");
    		
			//bunnycartPage5Object.emailEnter().sendKeys(str);
			//System.out.println("Entered the email");
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
			bunnycartPage5Object.enterPassword().sendKeys(str);
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
    		
    		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
           // WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(bunnycartPage5Object.signIn()));
           // signInButton.click();
    		Thread.sleep(2000);
    		bunnycartPage5Object.signIn().click();
			//System.out.println("Clicked the signin button");
            System.out.println("Clicked the Sign In button");
            logger1.log(Status.PASS,"Clicked the signin button successfully");
    		
			
		} catch (Exception e) {
          	System.out.println("Failed to click signin button" +e.getMessage());
          	logger1.log(Status.FAIL,"Error occured when clicking signin button");
		}
          }

public static void clickSignOut() {
	extent.attachReporter(reporter);
	logger1=extent.createTest("Clicking signout button");
	logger1.log(Status.INFO,"Clicking the signout button");
	try {
		logger1.addScreenCaptureFromPath(bunnycartcapture.screenShot("Scenario5"));
		Thread.sleep(2000);
		bunnycartPage5Object.signOut().click();
		System.out.println("Clicked the sign out button");
		logger1.log(Status.PASS,"Clicked the signout button successfully");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'customer-login-link') and contains(text(), 'Sign out')]"))).click();

        //WebElement signOutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class, 'customer-login-link') and contains(text(), 'Sign out')]")));
        //signOutButton.click();
        //System.out.println("Clicked the Sign Out button");
	
	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	logger1.log(Status.FAIL,"Error occured when clicking signout button");
	}
    }

}
