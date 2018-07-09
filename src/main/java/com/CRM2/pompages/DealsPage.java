package com.CRM2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CRM2.base.TestBase;

public class DealsPage extends TestBase{

	public DealsPage(WebDriver drv1){
		PageFactory.initElements(drv1, this);
		this.drv=drv1;
	}
	
	
}
