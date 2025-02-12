package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.page.HomePage;
import com.qa.page.Loginpage;

import com.qa.base.TestBase;

public class logintestcases extends TestBase {
	
	Loginpage loginPage;
	HomePage homePage;
	
	public logintestcases(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		loginPage = new Loginpage();
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		boolean SignIn = loginPage.Sigin();
		Assert.assertEquals(SignIn,true);
	}

	@Test(priority=2,enabled=true)
	public void loginPageTitleTest() throws Throwable{
		
		boolean flag = loginPage.SigninClick();
		Thread.sleep(5000);
		Assert.assertTrue(flag);
		homePage = loginPage.loginLINK();
		boolean flag1 = homePage.isDisplayed();
		Assert.assertTrue(flag1);
		}
		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
