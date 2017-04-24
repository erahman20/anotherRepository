package com.Hotel.boot.qa.newAutomation.Bobby;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class firstTest extends WebDriverFactory {

	
	@Test
	
	public void newTest() {
		
		LandingPage newTest = new LandingPage();
		
		
		newTest.passThis(By.xpath(".//*[@id='qf-0q-destination']"), "Los");
		
		
		
		List<WebElement>listOfLinks =getDriver().findElements(By.xpath(".//tbody[@class='autosuggest-city']/tr/td/div[2]"));
		for (WebElement element : listOfLinks) {
			if(element.getText().equals("Los Angeles, California, United States of America")) {
				element.click();
				break;
			}
		}
		
		newTest.clickingThis(By.xpath(".//*[@id='qf-0q-localised-check-in']"));	
		newTest.clickingThis(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[4]/td[6]/a"));
		newTest.clickingThis(By.xpath(".//*[@id='qf-0q-localised-check-out']"));
		newTest.clickingThis(By.xpath("html/body/div[7]/div[1]/div[2]/table/tbody/tr[5]/td[6]/a"));
		newTest.clickingThis(By.xpath(".//*[@id='main-content']/main/div/div/div[1]/div/div[1]/div[1]/div/div/form/div[5]/button"));
		newTest.texts(By.xpath(".//*[@id='search']/div[1]/div/h1"), "Los Angeles, California, USA");
		
		
	
	
	}
	
}
