package com.ab.testLayer;

import org.testng.annotations.Test;

import com.ab.BaseTest_team.BaseTest;
import com.ab.pageLayer.LoginPage;
import com.ab.utilities.UtilClass;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void VerifyLoginCredentials() throws InterruptedException
	{
		System.out.println("This is Login page test class by Archana");
		LoginPage login_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass();
		login_obj.clickOnLoginButton();
		Thread.sleep(2000);
		util_obj.scrollByMethod();
		login_obj.enterEmailID("archujadhav23@gmail.com");
		login_obj.enterPassword("archu@1992");
		login_obj.clickOnLoginButton1();
		
       
	}
}
