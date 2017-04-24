package com.Hotel.boot.qa.newAutomation.Bobby;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory {

	private static WebDriver driver = null;
	
	private static final String Hotel = "https://www.hotels.com";
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public void newWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C://Users//bobby//Desktop//jarLibrary//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Hotel);

		
	}
	
	
	@AfterClass
	public void afterTest() {
		
		if(driver != null);
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
	
}
