package com.ab.BaseTest_team;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.ab.pageLayer.LoginPage;
import com.ab.pageLayer.Product_StoreDemoPage;
import com.ab.pageLayer.RegisterPage;

public class BaseTest {
	public LoginPage login_obj ;
	public static WebDriver driver;
	public Properties prop;
	public RegisterPage register_obj;
	public Product_StoreDemoPage pro_sdpObj;
	public Logger logger;
	
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("DalalStreet Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		logger.info("Framework Execution started");
	}
	
	@AfterTest
	public void end()
	{
		logger.info("Framework execution stopped");
	}

	public WebDriver initialiseBrowser() {

		String configPath = System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties";
        System.out.println(configPath);
		File path = new File(configPath);
		String browserName = null;
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			prop.load(fis);
			browserName = prop.getProperty("browser");
		}

		catch (IOException e) {
			
			e.printStackTrace();
		}

		 
		

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		login_obj = new LoginPage(driver);
		register_obj = new RegisterPage(driver);
		pro_sdpObj= new Product_StoreDemoPage(driver);
		
		logger.info("Browser Initialised");

		return driver;

	}

	@BeforeMethod
	public void launchApplication() {
		driver =initialiseBrowser();
		

	}

	@AfterMethod
	public void tearDown() {

//		driver.quit();

	}

}
