package com.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LoginPage;
import com.utility.PropertiesUtils;

public class LoginTest extends BaseClass{

	public LoginPage lp=null;
	
	@BeforeSuite 
	public void setUp() throws Exception{
		initilization();
		lp=new LoginPage(driver);
	}
	@Test
	public void logintest()throws Exception{
		
		String uname=PropertiesUtils.readProperty("username");
		String pass=PropertiesUtils.readProperty("password");
		lp.loginToApplication(uname, pass);
		
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	
	}
	
}
