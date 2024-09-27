package com.swagLabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first-name")
	WebElement fname;
	@FindBy(id="last-name")
	WebElement lname;
	@FindBy(name="postalCode")
	WebElement zcode;
	@FindBy(id="continue")
	WebElement conbtn;
	
	public OverviewPage doContinue(String fn,String ln,String zc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zcode.sendKeys(zc);
		conbtn.click();
		return new OverviewPage(driver);
	}

}
