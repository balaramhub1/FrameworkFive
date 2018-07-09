package com.CRM2.util;

import org.openqa.selenium.WebDriver;

import com.CRM2.base.TestBase;

public class TestUtil extends TestBase{

	public TestUtil(WebDriver dr){
		this.drv=dr;
	}
	
	public void switchToFrame(){
		
		drv.switchTo().frame("mainpanel");
	}
	
}
