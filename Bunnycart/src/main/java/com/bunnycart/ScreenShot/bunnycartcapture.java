package com.bunnycart.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bunnycart.Browser.browser;

public class bunnycartcapture extends browser{
	
	public static String screenShot(String name) throws Exception { 
        String path=null;
		try {

			TakesScreenshot shot = ((TakesScreenshot) driver);

			File source = shot.getScreenshotAs(OutputType.FILE);

		     path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";

			File destination = new File(path);

			FileUtils.copyFile(source, destination);

		} catch (Exception e) {

			System.out.println("Screenshot");

		}
		return path;

	}
		
	        //String path = null;
	       // try {
	            // Capture the screenshot
	           // TakesScreenshot shot = (TakesScreenshot) driver;
	           // File source = shot.getScreenshotAs(OutputType.FILE);
	            
	            // Define the destination path
	           // path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
	           // File destination = new File(path);
	            
	            // Copy the screenshot file to the destination
	           // FileUtils.copyFile(source, destination);

	          //  System.out.println("Screenshot saved at: " + path);
	            
	       // } catch (IOException e) {
	       //     System.out.println("Failed to take screenshot: " + e.getMessage());
	      //  }
	      //  return path;
	   // }
		
		//String path=null;
		//try {
		//	TakesScreenshot shot = ((TakesScreenshot) driver);
			//File source = shot.getScreenshotAs(OutputType.FILE);
			//path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
			//File destination = new File(path);
			//FileUtils.copyFile(source, destination);
			
			//source.renameTo(destination);
			
			//System.out.println("Screenshot taken");
			
			
			
		//} catch (Exception e) {
		//	System.out.println("Screenshot");
		//}
		//return path;
	}


