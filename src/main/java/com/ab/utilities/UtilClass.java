package com.ab.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ab.BaseTest_team.BaseTest;

public class UtilClass extends BaseTest {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	public static String takeScreenShot(String testcaseName) {

		String sspath = System.getProperty("user.dir") + "\\screenshots\\" + testcaseName + ".png";
             System.out.println(sspath);
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			File des = new File(sspath);
			FileHandler.copy(src, des);
		} catch (IOException e) {
			System.out.println("File path is not correct");
			e.printStackTrace();
		}
		return sspath;
	}
	
	public void waitTillVisible(int duration) {
			
	}
	
	public void scrollByMethod()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,250)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
