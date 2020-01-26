package com.amazonbdd.test.qa.stepdefinitions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.amazonbdd.test.qa.helper.Constants;
import com.amazonbdd.test.qa.helper.WaitHelper;
import com.amazonbdd.test.qa.pageObjects.HomePage;
import com.amazonbdd.test.qa.pageObjects.RegistryPage;
import com.amazonbdd.test.qa.testBase.TestBase;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistryPageStepDefinitions extends TestBase {
	HomePage homePage = new HomePage(driver);
	RegistryPage registryPage = new RegistryPage(driver);
	WaitHelper waitHelper;
	
	@Given("^I am on the Amazon page URL$")
	public void i_am_on_the_Amazon_page_URL() throws Throwable {
		driver.get("https://www.amazon.com");
		waitHelper = new WaitHelper(driver);
		waitHelper.WaitForElement(homePage.registry, 60);
	    //throw new PendingException();
	}

	@Given("^I naviagate to Registry for Wedding$")
	public void i_naviagate_to_Registry_for_Wedding() throws Throwable {
	    homePage.registry.click();
	    registryPage.weddingRegistry.click();
	    String weddingRegistryPageTitle = registryPage.validateWeddingRegistryTitle();//is this title coming after click?
	    System.out.println("Wedding Registry Page title ::"+ weddingRegistryPageTitle);
		Assert.assertEquals(weddingRegistryPageTitle, Constants.WEDDING_REGISTRY_PAGE_TITLE, "Wedding Registry Page Title doesn't match");
	   // throw new PendingException();
	}

	@When("^I click on Create Your Registry  button$")
	public void i_click_on_Create_Your_Registry_button() throws Throwable {
	    registryPage.createYourRegistry.click();
	    //throw new PendingException();
	}

	@When("^I Sign In with my credentails$")
	public void i_Sign_In_with_my_credentails() throws Throwable {
//		driver.findElement((By) registryPage.email).sendKeys("tofael483@gmail.com"); //is it  Nasir bhai?
//		driver.findElement((By) registryPage.password).sendKeys("Nabeeha19");
		registryPage.enterEmail("tofael483@gmail.com"); //is it  Nasir bhai?
		registryPage.enterPassword("Nabeeha19");
		registryPage.signIn.click();
		String cwrpt = registryPage.validateCreatingWeddingRegistryTitle();
		System.out.println("Creating Wedding Registry Page title ::"+ cwrpt);
		//Assert.assertEquals(cwrpt, Constants.CREATING_WEDDING_REGISTRY_PAGE_TITLE, "Craeting Wedding Registry Page Title doesn't match");
		//boolean logoOfWeddingRegistry = registryPage.validateWeddingRegistryLogo();
		//Assert.assertTrue(logoOfWeddingRegistry);
		
		//How to use header
		//header: "Let's build the registry of your dreams!"
	    //throw new PendingException();
	}

	@Then("^I can build the registry of my dreams$")
	public void i_can_build_the_registry_of_my_dreams() throws Throwable {
		registryPage.yourFirstName.sendKeys("Mohammad"); //this one or next one is right? or both?
		driver.findElement((By)registryPage.yourLastName).sendKeys("Sharkar");
		driver.findElement((By) registryPage.youAreAGroom).isSelected();
		driver.findElement((By) registryPage.partnersFirstName).sendKeys("Nishat");
		driver.findElement((By) registryPage.partnersLastName).sendKeys("Sultana");
		driver.findElement((By) registryPage.theyAreABride).isSelected();
		driver.findElement((By) registryPage.partnersEmail).sendKeys("nishatdu@yahoo.com");
		Select dropdown = new Select(registryPage.countryDropDown);
        dropdown.selectByVisibleText("United States");
        registryPage.fullName.sendKeys("Mohammad Tofael Kabir Sharkar");
        registryPage.streetAddress1.sendKeys("625W 57th St");
        registryPage.streetAddress2.sendKeys("Apt 29xx");
        registryPage.city.sendKeys("New York");
        registryPage.state.sendKeys("NY");
        registryPage.city.sendKeys("New York");
        registryPage.zipCode.sendKeys("10019");
        registryPage.phoneNumber.sendKeys("3476537214");
        registryPage.addAddress.click();
        registryPage.allowMyGiftsShipped.isSelected();
        registryPage.letMyGuestsKnow.isSelected();
        Select monthDropdown = new Select(registryPage.eventMonth);
        monthDropdown.selectByVisibleText("December");
        Select dayDropdown = new Select(registryPage.eventDay);
        dayDropdown.selectByVisibleText("26");
        Select yearDropdown = new Select(registryPage.eventYear);
        yearDropdown.selectByVisibleText("2020");
        driver.findElement((By) registryPage.eventCity).sendKeys("New York");
        Select stateDropdown = new Select(registryPage.eventState);
        stateDropdown.selectByVisibleText("NY");
        Select countryDropdown = new Select(registryPage.eventCountry);
        countryDropdown.selectByVisibleText("United States");
        registryPage.howManyGuest.sendKeys("300");
        registryPage.leaveNoteForGuest.sendKeys("Thanks for your Good Wishes!");
        registryPage.enableGroupGifting.isSelected();
        registryPage.groupGiftingThreshhold.sendKeys("300");
        registryPage.onlyPeopleWithALinkCanSee.isEnabled();
        registryPage.wantToReceiveEmails.isSelected();
        registryPage.wantToReceiveProductOffer.isSelected();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String captcha;   
        System.out.println("Please Enter the CAPTCHA Code:: ");
        captcha = br.readLine();
        System.out.println("Entered  CAPTCHA Code is:: "+captcha);
        registryPage.typeCharacters.sendKeys(captcha);
        registryPage.createMyRegistry.click();
        registryPage.noThanks.click();
       // throw new PendingException();
	}

	@Then("^I can see a greeting header by our name$")
	public void i_can_see_a_greeting_header_by_our_name() throws Throwable {
		//boolean logoOfWedding = registryPage.validateWeddingLogo();
		//Assert.assertTrue(logoOfWedding);
		//how to use that header
	   // throw new PendingException();
	}

}
