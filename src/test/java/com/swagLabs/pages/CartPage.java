package com.swagLabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Remove']")
	WebElement rbtn;
	
	@FindBy(id="continue-shopping")
	WebElement cbtn;
	
	@FindBy(id="checkout")
	WebElement checkbtn;
	
	public void doRemove()
	{
		rbtn.click();
	}
	public InventoryPage doContinueShopping()
	{
		cbtn.click();
		return new InventoryPage(driver);
	}
	public CheckoutPage clickCheckout()
	{
		checkbtn.click();
		return new CheckoutPage(driver);
	}
}
