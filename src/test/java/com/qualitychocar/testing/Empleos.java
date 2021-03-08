package com.qualitychocar.testing;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empleos {
	
	private	WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chromel.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void testEmpleos()
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.clear();
		
		searchbox.sendKeys("choucairtesting");
		
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("choucairtesting", driver.getTitle());	
	}
	@After
	public void tearDown() 
	{
		driver.quit();
	}
}
