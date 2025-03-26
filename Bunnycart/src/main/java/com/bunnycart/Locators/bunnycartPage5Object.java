package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.browser;

public class bunnycartPage5Object extends browser {
	public static By email =By.xpath("//input[@id='email-login']");
	public static By pass = By.xpath("//input[@id='pass-login']");
	public static By siginbutton = By.xpath("//button[@id='send2-login']");
	public static By signout = By.xpath("//a[contains(@class, 'customer-login-link') and contains(text(), 'Sign out')]");
	
	
	public static WebElement emailEnter() {
		return driver.findElement(email);
	}
	public static WebElement enterPassword() {
		return driver.findElement(pass);
	}
	public static WebElement signIn() {
		return driver.findElement(siginbutton);
	}
	public static WebElement signOut() {
		return driver.findElement(signout);
	}

}
