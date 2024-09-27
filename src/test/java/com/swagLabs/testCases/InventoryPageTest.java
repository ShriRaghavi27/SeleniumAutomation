package com.swagLabs.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.swagLabs.baseTest.BaseTest;

public class InventoryPageTest extends BaseTest{
	@BeforeClass
	public void pagesetUp()
	{
		lp.doLogin(prop.getData("un"),prop.getData("psw"));
	}
  @Test(priority = 1)
  public void validateProductCount() 
  {
	  int count=ip.getAllProductCount();
	  Assert.assertEquals(count,6,"Product count is not matched");
	  System.out.println("Product count is matched & Total product count is "+count);
  }
  
  @Test(priority = 2)
  public void validateProductDeatils() 
  {
	  ip.getAllProductDetails();
  }
  
  @Test(priority = 3)
  public void validateaddToCart() 
  {
	  ip.addToCart(prop.getData("pname1"));
  }
  
  @Test(priority = 4)
  public void validateCartPageInit()
  {
	  ip.openCartPage();
  }
  
}
