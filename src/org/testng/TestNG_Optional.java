package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Optional {
	WebDriver driver;
	@Parameters({"Username","password"})
	@Test
	public void aTest(@Optional("Meera")String user, String pass) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\TestNg_Sample\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	    WebElement e = driver.findElement(By.id("email"));
		e.sendKeys(user);
		
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys(pass);
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.quit();
	}

}
