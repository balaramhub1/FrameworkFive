package com.CRM2.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM2.base.TestBase;
import com.CRM2.pompages.ContactsPage;
import com.CRM2.pompages.HomePage;
import com.CRM2.pompages.LoginPage;
import com.CRM2.util.TestUtil;

public class HomePageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	@BeforeMethod
	public void setUp(){
		initTest();
		loginPage = new LoginPage(drv);
		testUtil = new TestUtil(drv);
		homePage=loginPage.loginToCRM(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void homePageeTitleTest(){
		Assert.assertEquals(homePage.homePageTitle(), "CRMPRO");
		
	}
	
	@Test(priority=2)
	public void userNameDisplayedTest(){
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.userNameDisplayed());
	}
	
	@Test(priority=3)
	public void contactsLinkTest(){
		testUtil.switchToFrame();
		contactsPage=homePage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown(){
		drv.close();
	}
	

}
