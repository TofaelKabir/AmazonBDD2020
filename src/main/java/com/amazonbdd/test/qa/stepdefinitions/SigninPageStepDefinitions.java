package com.amazonbdd.test.qa.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.amazonbdd.test.qa.helper.WaitHelper;
import com.amazonbdd.test.qa.pageObjects.HomePage;
import com.amazonbdd.test.qa.pageObjects.SignInPage;
import com.amazonbdd.test.qa.testBase.TestBase;
import com.amazonbdd.test.qa.helper.Constants;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SigninPageStepDefinitions extends TestBase {
	HomePage homePage = new HomePage(driver);
	SignInPage signinPage = new SignInPage(driver);
	WaitHelper waitHelper;
	Actions builder = new Actions(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@Given("^I am on the Amazon page URL \"([^\"]*)\"$")
	public void i_am_on_the_Amazon_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(homePage.amazonLogo, 60);
		throw new PendingException();
	}

	@Then("^I should see the title and logo of the Amazon application$")
	public void i_should_see_the_title_and_logo_of_the_Amazon_application() throws Throwable {
		String title1 = homePage.validateAmazonTitle();
		Assert.assertEquals(title1,
				"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more",
				"Home Page Title doesn't match");
		boolean flag = homePage.validateAmazonLogo();
		Assert.assertTrue(flag);
		throw new PendingException();
	}

	@When("^I hover over on sign in area$")
	public void i_hover_over_on_sign_in_area() throws Throwable {

		WebElement helloSignInAccountAndLists = driver.findElement(By.cssSelector("#nav-link-accountList")); // how can
																												// i get
																												// frm
																												// homepage
		Thread.sleep(2000);
		builder.moveToElement(helloSignInAccountAndLists).build().perform();
		Thread.sleep(2000);
		System.out.println(helloSignInAccountAndLists.getText());
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='nav-al-container']//div//a"));
		int totalCount = list.size();
		System.out.println(totalCount);
		for (int i = 0; i < totalCount; i++) {
			System.out.println(list.get(i).getText());
			throw new PendingException();
		}
	}

	@When("^I click on signin button$")
	public void i_click_on_signin_button() throws Throwable {
		waitHelper.WaitForElement(homePage.signIn, 60);
		WebElement signIn = driver.findElement(By.xpath("//span[@class='nav-action-inner']")); // Why i CAN'T AVOID IT?
		js.executeScript("arguments[0].click();", signIn);
		throw new PendingException();
	}

	@When("^I enter email in input field as \"([^\"]*)\"$")
	public void i_enter_email_in_input_field_as(String arg1) throws Throwable {

		js.executeScript(
				"document.getElementByClass('a-input-text a-span12 auth-autofocus auth-required-field').value = 'arg1';");
		throw new PendingException();
	}

	@When("^I click in continue button$")
	public void i_click_in_continue_button() throws Throwable {
		WebElement cont = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		cont.click();
		throw new PendingException();
	}

	@When("^I enter password in input field as \"([^\"]*)\"$")
	public void i_enter_password_in_input_field_as(String arg1) throws Throwable {
		js.executeScript("document.getElementByXpath('//input[@id='ap_password']').value = 'arg1';");
		throw new PendingException();
	}

	@When("^I click in SignIn button$")
	public void i_click_in_SignIn_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		throw new PendingException();
	}

	@Then("^I sould see the title of the SignIn page$")
	public void i_sould_see_the_title_of_the_SignIn_page() throws Throwable {
		String title2 = signinPage.validateSignInPageTitle();
		Assert.assertEquals(title2, "Your Amazon.com");
		throw new PendingException();
	}

}
