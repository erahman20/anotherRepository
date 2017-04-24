package com.Hotel.boot.qa.newAutomation.Bobby;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {
	
	private By locator;
	private By passingKey;
	
	
	
	public By getPassingKey() {
		return passingKey;
	}
	public void setPassingKey(By passingKey) {
		this.passingKey = passingKey;
	}
	
	
	public By getLocator() {
		return locator;
	}
	public void setLocator(By locator) {
		this.locator = locator;
	}
	
	public void clickingThis(By locator) {
		clickThis(locator);
		
	}
	
	public void passThis(By locator, String keysToSend) {
		enterThis(locator, keysToSend);
	}
	public void texts(By locator, String actual) {
		verifyingText(locator, actual);
	}

}
