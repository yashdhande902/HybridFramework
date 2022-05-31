package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.PropertiesUtils;

public class BaseClass {

	public static WebDriver driver=null;
public static void initilization() throws Exception{
	
	String browser=PropertiesUtils.readProperty("browser");
	
	if(browser.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "E://Selenium Softwares//Selenium Jar//chromedriver101.exe");
		 
		driver=new ChromeDriver();
		
	}
	if(browser.equals("firefox")){
		
		System.setProperty("webdriver.firefox.driver", "E:/Selenium Softwares/Selenium Jar/geckodriver.exe");
		
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(PropertiesUtils.readProperty("url"));
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
}
