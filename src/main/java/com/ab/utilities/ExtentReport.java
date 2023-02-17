package com.ab.utilities;

import com.ab.BaseTest_team.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	 
	
	public static ExtentReports getExtentReport() {
		
		String erPath=System.getProperty("user.dir")+"\\TestOutPut\\Index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(erPath);
		reporter.config().setDocumentTitle("NOP Commerce Test Report");
		reporter.config().setReportName("NOP Test");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Tester", "Team-L");
		return extent;
		
		
	}

}
