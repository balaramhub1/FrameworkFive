package com.CRM2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM2.base.TestBase;

public class LoginPage extends TestBase{
		
	public LoginPage(WebDriver drv1){
		PageFactory.initElements(drv1, this);
		this.drv=drv1;
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;

	public String loginPageTitle(){
		System.out.println("Driver is : "+drv);
		return drv.getTitle();
	}
	
	public boolean crmLogoDisplayed(){
		return crmLogo.isDisplayed();
	}
	
	public HomePage loginToCRM(String un,String pa){
		userName.sendKeys(un);
		passWord.sendKeys(pa);
		loginBtn.click();
		return new HomePage(drv);
	}
}
