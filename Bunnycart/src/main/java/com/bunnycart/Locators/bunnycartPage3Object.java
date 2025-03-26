package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.browser;

public class bunnycartPage3Object extends browser {
	public static By login = By.xpath("//a[@class='customer-login-link']");
	public static By email =By.xpath("//input[@id='email-login']");
	public static By pass = By.xpath("//input[@id='pass-login']");
	public static By siginbutton = By.xpath("//button[@id='send2-login']");
	
	public static WebElement signIn() {
		return driver.findElement(login);
	}
	public static WebElement emailEnter() {
		return driver.findElement(email);
	}
	public static WebElement enterPassword() {
		return driver.findElement(pass);
	}
	public static WebElement signInButton() {
		return driver.findElement(siginbutton);
	}
}
