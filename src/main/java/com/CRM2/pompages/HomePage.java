package com.CRM2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM2.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage(WebDriver drv1){
		PageFactory.initElements(drv1, this);
		this.drv=drv1;
	}
	
	
	@FindBy(xpath="//td[contains(text(),'User: naveen kala')]")
	//@CacheLookup
	WebElement userNameLabel;
	//userNameLabel is enclosed in a Frame, hence it cannot be accessed directly
	// by xpath, first we need to switch to the frame and then access the userNameLabel

	@FindBy(xpath="*//ul/li[4]/a[contains(text(),'Contacts')]")
	//@CacheLookup
	WebElement contactsLink;
	
	@FindBy(xpath="*//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	
	public String homePageTitle(){
		return drv.getTitle();
	}

	public boolean userNameDisplayed(){
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactsPage(drv);
	}
	
	public DealsPage clickOnDealsLink(){
		dealsLink.click();
		return new DealsPage(drv);
	}
	
	public TasksPage clickOnTasksLink(){
		tasksLink.click();
		return new TasksPage(drv);
	}
	
	public void clickOnNewContactsLink(){
		Actions act=new Actions(drv);
		act.moveToElement(contactsLink).build().perform();
		newContactsLink.click();
		
	}
}
