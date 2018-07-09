package com.CRM2.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DrvEventListener implements WebDriverEventListener{

	public void afterAlertAccept(WebDriver arg0) {
		System.out.println("Accepted the Alert");
		
	}

	public void afterAlertDismiss(WebDriver arg0) {
		System.out.println("Dismissed the Alert");
		
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterClickOn(WebElement el, WebDriver arg1) {
		System.out.println("Clicked on the Element :"+el);
		
	}

	public void afterFindBy(By by, WebElement arg1, WebDriver arg2) {
		System.out.println("Found the Element by :"+by);
		
	}

	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("Navigated back");
		
	}

	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("Navigated forward");
		
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		System.out.println("Refreshed the Page");
		
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Navigated to :"+arg0);
		
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertAccept(WebDriver arg0) {
		System.out.println("Accepting the Alert");
		
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		System.out.println("Dismissing the Alert");
		
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement el, WebDriver arg1) {
		System.out.println("Clicking the Element :"+el);
		
	}

	public void beforeFindBy(By by, WebElement el, WebDriver arg2) {
		System.out.println("Trying to find the Element "+el+"by :"+by);
		
	}

	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("Navigating back");
		
	}

	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("Navigating forward");
		
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		System.out.println("Refreshing the Page");
		
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Navigating to "+arg0);
		
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
