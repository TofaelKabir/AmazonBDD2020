package com.amazonbdd.test.qa.testBase;

import com.amazonbdd.test.qa.pageObjects.HomePage;
import com.amazonbdd.test.qa.pageObjects.SignInPage;

public interface AllObjects {

	static SignInPage loginPage = new SignInPage(TestBase.driver);
	static HomePage homePage = new HomePage(TestBase.driver);
}
