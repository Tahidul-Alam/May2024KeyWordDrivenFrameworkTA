package com.facebook_tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook_base.BaseTest;
import com.facebook_pages.LoginPage;
import com.facebook_utilities.TestReader;

public class LoginTest extends BaseTest{
	
	LoginPage lp;
	TestReader tr;
	
	@BeforeMethod (groups= {"smoke","functional","regression"})
	public void openFacebook() {
		openApplication();
		
	}
	
	@Test(groups= {"smoke","functional","regression"})
	public void validLoginTest() {
		lp = new LoginPage(driver);
		tr= new TestReader();
		lp.userName(tr.readuserName());
		lp.password(tr.readpassword());
		lp.loginButton();
	}
	
	@Test (groups= {"functional"})
	public void invalidUsernameTest() {
		lp = new LoginPage(driver);
		tr= new TestReader();
		lp.userName(tr.readuserName());
		lp.password(tr.readpassword());
		lp.loginButton();
	}
	
	@Test (groups= {"regression"})
	public void invalidPasswordTest() {
		lp = new LoginPage(driver);
		tr= new TestReader();
		lp.userName(tr.readuserName());
		lp.password(tr.readpassword());
		lp.loginButton();
	}
	
	@AfterMethod (groups= {"smoke","functional","regression"})
	public void closeFacebook() {
		closeApplication();
		
		
	}
}
