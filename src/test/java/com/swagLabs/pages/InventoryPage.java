package com.swagLabs.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	public WebDriver driver;
	
	public InventoryPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-test='inventory-item-name']")
	List<WebElement> allProduct;
	
	@FindBy(id="add-to-cart")
	WebElement addtocartBtn;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
	public int getAllProductCount()
	{
		return allProduct.size();
	}
	
	public void getAllProductDetails()
	{
		for(WebElement i:allProduct)
		{
			System.out.println(i.getText());
		}
	}
	public void addToCart(String pname)
	{
		for(WebElement i:allProduct)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		addtocartBtn.click();
	}
	public CartPage openCartPage()
	{
		cartOption.click();
		return new CartPage(driver);
	}
	
}

