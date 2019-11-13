package com.amazonbdd.test.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class YourAmazonDotComPage {
	
	private WebDriver driver;
	
	public YourAmazonDotComPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
