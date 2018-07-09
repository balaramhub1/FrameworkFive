package com.CRM2.loginpage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM2.base.TestBase;
import com.CRM2.pompages.HomePage;
import com.CRM2.pompages.LoginPage;

public class LoginPageTest extends TestBase{

HomePage homePage;
LoginPage loginPage;

@BeforeMethod
public void setUp(){
	initTest();
	loginPage=new LoginPage(drv);
}

@Test(priority=1)
public void loginPageTitleTest(){
	Assert.assertEquals(loginPage.loginPageTitle(), "Free CRM software in the cloud powers sales and customer service");
}

@Test(priority=2)
public void crmLogoTest(){
	Assert.assertTrue(loginPage.crmLogoDisplayed());
}

@Test(priority=3)
public void loginTest(){
	homePage=loginPage.loginToCRM(prop.getProperty("username"), prop.getProperty("password"));
}

@AfterMethod
public void tearDown(){
	drv.close();
}

}
