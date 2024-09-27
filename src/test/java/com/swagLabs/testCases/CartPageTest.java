package com.swagLabs.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swagLabs.baseTest.BaseTest;

public class CartPageTest extends BaseTest{
	@BeforeClass
	public void pageSetUp() throws InterruptedException
	{
		ip=lp.doLogin(prop.getData("un"), prop.getData("psw"));
		addwait();
		ip.addToCart(prop.getData("pname1"));
		addwait();
		ip.openCartPage();
		addwait();
	}
	@Test(priority = 1)
	public void validateRemove()
	{
		cp.doRemove();
	}
	@Test(priority = 2)
	public void validateContinueShopping() throws InterruptedException
	{
		ip=cp.doContinueShopping();
		addwait();
		ip.addToCart(prop.getData("pname2"));
		addwait();
		ip.openCartPage();
		addwait();
	}
	@Test(priority = 3)
	public void navigateToCheckoutPage()
	{
		cp.clickCheckout();
	}
	
}
