package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Invocation {
	WebDriver driver;
	@Test(invocationCount=5)
	public void atest() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\TestNg_Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		    WebElement e = driver.findElement(By.id("email"));
			e.sendKeys("vidya");
			
			WebElement p = driver.findElement(By.id("pass"));
			p.sendKeys("Hi@1234a");
			
			driver.findElement(By.id("loginbutton")).click();
			
			driver.quit();
		

		

	}
	

}
