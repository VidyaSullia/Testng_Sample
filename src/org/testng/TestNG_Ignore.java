package org.testng;

import org.testng.annotations.Test;

public class TestNG_Ignore {
	@Test
	public void cTest() {
		System.out.println("C");

	}
	@Test(enabled=false)  // To ignore the test case
	public void bTest() {
		System.out.println("B");

	}
	@Test
	public void aTest() {
		System.out.println("A");

	}

}
