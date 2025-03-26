package com.bunnycart.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName) {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\target\\extentreport\\" + reportName + ".html");
        }
	
	public static void openBrowser() throws Exception {
		if (extent == null) { 
	        init("TestReport");
	    }
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");
		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			logger1.log(Status.PASS, "Chrome Browser opened Successfully");}
			else if (choice.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			logger1.log(Status.PASS, "Edge Browser opened Successfully");}
		}
		catch (Exception e) {
			System.out.println("Failed to openBrowser" + e.getMessage());
			logger1.log(Status.FAIL, "Failed, Browser did not open");
		}
		extent.flush();
	}
	
	public static void navigateToUrl(String url) throws Exception {
		
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Navigating URL");
		logger1.log(Status.INFO, "The URL will be Navigated");
	    try {
	        driver.get(url); 
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        logger1.log(Status.PASS, "The URL has been navigated Successfully");
	    } catch (Exception e) {
	        System.out.println("Failed to open URL: " + e.getMessage());
	        logger1.log(Status.FAIL, "The URL is not navigated.");
	    }
	    extent.flush();
	}
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Closing the Browser");
		logger1.log(Status.INFO, "The Browser will be closed");
		try {
			driver.quit();
			logger1.log(Status.PASS, "The Browser has been closed Successfully");
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL, "The Browser is not Closed.");
		}
		extent.flush();
	}

	
	
	
	
	
}
