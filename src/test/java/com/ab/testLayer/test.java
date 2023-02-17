package com.ab.testLayer;

import org.testng.annotations.Test;

import com.ab.BaseTest_team.BaseTest;

public class test extends BaseTest {
	
	@Test
	public void Test1() throws InterruptedException{
	    
		login_obj.dashBoard();

		System.out.println("Hello");
	}

}
