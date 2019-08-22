package org.test_assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assign_Redbus {
	WebDriver driver;
	@Test
	public void redBus() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\TestNg_Sample\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	Assert.assertTrue(driver.getCurrentUrl().contains("redbus"));
	driver.manage().window().maximize();
	
	driver.findElement(By.id("signin-block")).click();
	
	driver.findElement(By.id("signInLink")).click();
	
	WebElement fr = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(fr);
	WebElement num = driver.findElement(By.id("mobileNoInp"));
	num.sendKeys("9874563");
//	String a = num.getAttribute("value");
//	System.out.println(a);
	Assert.assertEquals("9874563", num.getAttribute("value"));
	

}
}