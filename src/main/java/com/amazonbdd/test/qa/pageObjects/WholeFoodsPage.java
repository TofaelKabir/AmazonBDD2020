package com.amazonbdd.test.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WholeFoodsPage {

	private WebDriver driver;
	
	public WholeFoodsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
