package org.testng;

import org.testng.annotations.Test;

public class TestNG_Assert {
	@Test
	public void test3() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		System.out.println("Test 3");

	}
	@Test
	public void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("Test 1");

	}
	@Test
	public void test4() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("Test 4");
	}
	@Test
	public void test2() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		System.out.println("Test 2");
	}
}
