 package com.swagLabs.baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.swagLabs.pages.CartPage;
import com.swagLabs.pages.CheckoutPage;
import com.swagLabs.pages.InventoryPage;
import com.swagLabs.pages.LoginPage;
import com.swagLabs.pages.OverviewPage;
import com.swagLabs.utility.PropertiesReader;

public class BaseTest {
	public WebDriver driver;
	public LoginPage lp;
	public InventoryPage ip;
	public CartPage cp;
	public PropertiesReader prop;
	public CheckoutPage ch;
	public OverviewPage op;
	@BeforeTest
	public void setUp()
	{
		prop=new PropertiesReader();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new LoginPage(driver);
		ip=new InventoryPage(driver);
		cp=new CartPage(driver);
		ch=new CheckoutPage(driver);
		op=new OverviewPage(driver);
	}
	public void addwait() throws InterruptedException
	{
		Thread.sleep(1500);
	}

}
