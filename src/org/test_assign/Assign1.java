package org.test_assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assign1 {
	WebDriver driver;
	@Parameters({"Email","password"})
	@Test
	public void aTest(String mail, String pass) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\KaVi\\eclipse-workspace\\Maven\\TestNg_Sample\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	/*	
		driver.get("https://www.flipkart.com/account/login");
	//	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.flipkart.com/account/login"));
		Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));
		
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		e.sendKeys("Vidya");
		Assert.assertEquals("Vidya", e.getAttribute("value"));
		
		WebElement p =driver.findElement(By.xpath("//input[@type='password']"));
		p.sendKeys("Vidu");
		Assert.assertEquals("Vidu", p.getAttribute("value"));
		
		*/
		
		
	/*	driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.getCurrentUrl().contains("greens"));
	*/	
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("identifierId"));
		e.sendKeys(mail);
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(5000);
		WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
		pw.sendKeys(pass);
		
		
		
		
	}

}
