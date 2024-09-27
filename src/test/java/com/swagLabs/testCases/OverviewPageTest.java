package com.swagLabs.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swagLabs.baseTest.BaseTest;

public class OverviewPageTest extends BaseTest{
	@BeforeClass
	public void pageSetUp() throws InterruptedException
	{
		ip=lp.doLogin(prop.getData("un"), prop.getData("psw"));
		addwait();
		ip.addToCart(prop.getData("pname1"));
		addwait();
		ip.openCartPage();
		addwait();
		cp.clickCheckout();
		ch.doContinue(prop.getData("fn"), prop.getData("ln"), prop.getData("zc"));
	}
  @Test(priority = 1)
  public void validateSummary() {
	  op.getSummart();
  }
  @Test(priority = 2)
  public void validateCompleteOrder() {
	  op.doFinish();
  }
}
