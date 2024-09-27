package com.swagLabs.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swagLabs.baseTest.BaseTest;

public class LoginPageTest extends BaseTest {
  @Test(priority = 1)
  public void validateUrl() {
	 String actUrl=lp.getAppUrl();
	 Assert.assertTrue(actUrl.contains("demo"),"Url is not matched");
	 System.out.println("Url is matched");
  }
  @Test(priority = 2)
  public void validateTitle() {
	 String actTitle=lp.getAppTiltle();
	 Assert.assertTrue(actTitle.contains("Labs"),"Title is not matched");
	 System.out.println("Title is matched");
  }
  @Test(priority = 3)
  public void validateLogin() {
	  lp.doLogin(prop.getData("un"), prop.getData("psw"));
  }
 }

