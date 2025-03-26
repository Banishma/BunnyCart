package com.bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bunnycart.Browser.browser;

public class bunnycartPage4Object extends browser {
	public static By email =By.xpath("//input[@id='email-login']");
	public static By pass = By.xpath("//input[@id='pass-login']");
	public static By siginbutton = By.xpath("//button[@id='send2-login']");
	public static By search = By.xpath("//input[@id='search']");                                   
	public static By pro1 = By.xpath("//img[@src='https://www.bunnycart.com/pub/media/catalog/product/d/u/duckweed_1.jpg']");
	public static By proaddtocart = By.xpath("//button[@id='product-addtocart-button']");
	public static By pro2 = By.xpath("//img[@src='https://www.bunnycart.com/pub/media/catalog/product/h/a/hairgrass.jpg']");
	public static By pro2Type = By.xpath("//div[@aria-label='1 Bunch']");
	
	

	public static WebElement emailEnter() {
		return driver.findElement(email);
	}
	public static WebElement enterPassword() {
		return driver.findElement(pass);
	}
	public static WebElement signIn() {
		return driver.findElement(siginbutton);
	}
	public static WebElement search() {
		return driver.findElement(search);
	}
	public static WebElement product1() {
		return driver.findElement(pro1);
	}
	public static WebElement product2() {
		return driver.findElement(pro2);
	}
	public static WebElement productType() {
		return driver.findElement(pro2Type);
	}
	public static WebElement addToCart() {
		return driver.findElement(proaddtocart);
	}
}
