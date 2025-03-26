package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.browser;

public class bunnycartPage2Object extends browser {
	public static By login = By.xpath("//a[@class='customer-login-link']");
	public static By email =By.xpath("//input[@id='email-login']");
	public static By pass = By.xpath("//input[@id='pass-login']");
	public static By siginbutton = By.xpath("//button[@id='send2-login']");
	public static By search = By.xpath("//input[@id='search']");
	public static By searchsymbol =By.xpath("//button[@class='action search']");
	public static By pro1 = By.xpath("//img[@src='https://www.bunnycart.com/pub/media/catalog/product/d/u/duckweed_1.jpg']");
	public static By proaddtocart = By.xpath("//button[@id='product-addtocart-button']");
	//public static By product =By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input");
	//public static By cart =By.xpath("//button[@title='Add to Cart']");
	
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
	public static WebElement search() {
		return driver.findElement(search);
	}
	public static WebElement searchsymbol() {
		return driver.findElement(searchsymbol);
	}
	public static WebElement product() {
		return driver.findElement(pro1);
	}
	public static WebElement addToCart() {
		return driver.findElement( proaddtocart);
	}


}
