package com.qualitychocar.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarEmpleos {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Search Jobs");
	By registerPageLocator = By.xpath("//im[@src='/wp-content/uploads/2019/07/banner.png']");
	By usernameLocator = By.id("search_keywords");
	//By registerBtnLocator = By.
	//By usernameLocator = By.name("search_location");
	
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resoures/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	@After
	public void tearDown() throws Exception
	{
		driver.quit();
	}
	
	@Test
	public void  Test() throws InterruptedException 
	{
		driver.findElement(usernameLocator).click();
		Thread.sleep(2000);
		if (driver.findElement(registerLinkLocator).isDisplayed())
		{
			driver.findElement(usernameLocator).sendKeys("Automatizador");
		}
		else
		{
			System.out.print("La búsqueda no encontró empleos");
		}
  }
}
