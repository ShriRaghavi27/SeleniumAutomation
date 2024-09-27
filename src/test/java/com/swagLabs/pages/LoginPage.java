package com.swagLabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();	
	}
	
	public String getAppTiltle()
	{
		return driver.getTitle();	
	}
	
	public  InventoryPage doLogin(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		return new InventoryPage(driver);
	}

}
