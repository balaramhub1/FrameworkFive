package com.CRM2.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.CRM2.base.TestBase;

public class TasksPage extends TestBase{

	public TasksPage(WebDriver drv1){
		PageFactory.initElements(drv1, this);
		this.drv=drv1;
	}
	
	
}
