package com.swagLabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
	WebDriver driver;
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="checkout_summary_container")
	WebElement summary;
	@FindBy(name="finish")
	WebElement fbtn;
	@FindBy(tagName="h2")
	WebElement text;
	
	public void getSummart()
	{
		System.out.println(summary.getText());
	}
	public void doFinish()
	{
		fbtn.click();
		System.out.println(text.getText());
	}
}
