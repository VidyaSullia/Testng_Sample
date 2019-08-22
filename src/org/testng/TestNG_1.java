package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_1 {
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch");

	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close");

	}
	@BeforeMethod
	public void startTime() {
		System.out.println("Start");

	}
	@AfterMethod
	public void endTime() {
		System.out.println("End");

	}
	@Test
	public void test2() {
		System.out.println("Test 2");

	}
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	

}
