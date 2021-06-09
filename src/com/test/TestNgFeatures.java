package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void loginTest()
	{
		System.out.println("login Test");
		int i = 3/0;
	}

	@Test(dependsOnMethods="loginTest")
	public void homePageTest()
	{
		System.out.println("Home page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest()
	{
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void regPageTest()
	{
		System.out.println("Reg Page Test");
	}
}
