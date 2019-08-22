package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {
	WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\TestNg_Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}
	@BeforeMethod
	public void startTime() {
		Date d= new Date();
		System.out.println(d);
		System.out.println("vidya");

	}
	@AfterMethod
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
		System.out.println("sullia");

	}   
	
	@Test
	public void bTest() {
		driver.findElement(By.id("loginbutton")).click();

	}
	@Test
	public void aTest() {
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("Vidya");
		Assert.assertEquals("Vidya", e.getAttribute("value"));
		
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("Hi@1234a");
		Assert.assertEquals("Hi@1234a", p.getAttribute("value"));

	} 
	

}
