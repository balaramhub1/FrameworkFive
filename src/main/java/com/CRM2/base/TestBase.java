package com.CRM2.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.CRM2.util.DrvEventListener;


public class TestBase {
	
	public WebDriver drv;
	public Properties prop;
	public DrvEventListener eventListener;
	public EventFiringWebDriver e_drv;
	
	public Logger log=Logger.getLogger(TestBase.class.getName());
	
	public void initTest(){
		readProp();
		
		String log4jPropPath="log4j.properties";
		PropertyConfigurator.configure(log4jPropPath);
		
		getBrowser(prop.getProperty("browser"));
		
		e_drv=new EventFiringWebDriver(drv);
		eventListener = new DrvEventListener();
		
		e_drv.register(eventListener);
		drv=e_drv;
		
		getUrl(prop.getProperty("url"));
	}
	
	public void readProp(){
		try{
			prop=new Properties();
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/CRM2/config/config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void getBrowser(String browser){
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			drv=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
			drv=new FirefoxDriver();
		}
	}
	
	public void getUrl(String url){
		drv.get(url);
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drv.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		drv.manage().window().maximize();
	}

}
