package com.ab.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

		
	
	public void enterPassword(String password)
	{
		password_txtbx.sendKeys(password);
	}
	public void clickOnLoginButton1()
	{
		login_btn1.click();
	}
	

	
}
