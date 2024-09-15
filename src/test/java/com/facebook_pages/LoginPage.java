package com.facebook_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="email") public WebElement uName;
	
	public WebElement userName(String enterUserName) {
		uName.sendKeys(enterUserName);
		return uName;
		
	}
	
	@FindBy (name="pass") public WebElement pass;
	
	public WebElement password(String enterYourPassword) {
		pass.sendKeys(enterYourPassword);
		return pass;
	}
	
	@FindBy(xpath="//button[starts-with (@id,'u_0_5')]") public WebElement lButton;
	public void loginButton() {
		lButton.click();
	}
	


}
