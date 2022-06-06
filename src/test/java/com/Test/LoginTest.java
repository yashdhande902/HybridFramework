package com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LoginPage;
import com.utility.PropertiesUtils;


public class LoginTest extends BaseClass{  
	public LoginPage lp=null;
	

	@BeforeSuite 
	public void setUp() throws Exception{
		initilization();
		reportInit();
		lp=new LoginPage(driver);
	}
	@Test(priority=1)
	public void logintest()throws Exception{
		
		String uname=PropertiesUtils.readProperty("username");
		String pass=PropertiesUtils.readProperty("password");
		lp.loginToApplication(uname, pass);
		
	AssertJUnit.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	
	}
	@Test(priority=2)
	public void failTest(){
		
		Assert.assertEquals(driver.getTitle(), "test");
	}
	@Test(priority=3)
	public void skipTest(){
		throw new SkipException("skipping a testcase");
	}
	
}
