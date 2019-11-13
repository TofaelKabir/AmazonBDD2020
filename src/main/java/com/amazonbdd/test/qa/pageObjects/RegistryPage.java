package com.amazonbdd.test.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonbdd.test.qa.helper.WaitHelper;

public class RegistryPage {

	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//img[@alt='Wedding Registry']")
	public WebElement weddingRegistry;
	
	@FindBy(xpath="//a[normalize-space(text())='Create your registry']")
	public WebElement createYourRegistry;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement signIn;
	
	@FindBy(partialLinkText="awr-logo")
	public WebElement weddingRegistryLogo;
	
	@FindBy(name="firstNamePartner1")
	public WebElement yourFirstName;
	
	@FindBy(name="surnamePartner1")
	public WebElement yourLastName;
	
	@FindBy(xpath="//span[@id='a-autoid-2-announce']")
	public WebElement youAreAGroom;
	
	@FindBy(name="firstNamePartner2")
	public WebElement partnersFirstName;
	
	@FindBy(name="surnamePartner2")
	public WebElement partnersLastName;
	
	@FindBy(xpath="//span[@id='a-autoid-2-announce']")
	public WebElement theyAreABride;
	
	@FindBy(name="emailPartner2")
	public WebElement partnersEmail;
	//need to show Nasir
	@FindBy(xpath="//span[text()='United States']//parent::span//parent::span//parent::span[@id='address-ui-widgets-countryCode']")
	public WebElement countryDropDown;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	public WebElement fullName;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	public WebElement streetAddress1;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	public WebElement streetAddress2;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressStateOrRegion']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	public WebElement zipCode;
	
	@FindBy(xpath="//input[@name='address-ui-widgets-enterAddressPhoneNumber']")
	public WebElement phoneNumber;
	//need to show Nasir
	@FindBy(xpath="//span[contains(text(),'Add address')]//preceding-sibling::input[@class='a-button-input']")
	public WebElement addAddress;
	
	@FindBy(xpath="//input[@id='wr-cm-external-party-permission']")
	public WebElement allowMyGiftsShipped;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressStateOrRegion']")
	public WebElement letMyGuestsKnow;
	
	@FindBy(id="a-autoid-7-announce")
	public WebElement eventMonth;
	
	@FindBy(id="a-autoid-8-announce")
	public WebElement eventDay;
	
	@FindBy(id="a-autoid-9-announce")
	public WebElement eventYear;
	
	@FindBy(name="weddingCity")
	public WebElement eventCity;
	
	@FindBy(id="a-autoid-10-announce")
	public WebElement eventState;
	
	@FindBy(id="a-autoid-11-announce")
	public WebElement eventCountry;
	
	@FindBy(className="a-input-text a-width-large wr-cm-event-guests-number wr-element")
	public WebElement howManyGuest;
	
	@FindBy(name="personalMessage")
	public WebElement leaveNoteForGuest;
	
	@FindBy(xpath="//input[@name='isGroupGiftingEnabled']")
	public WebElement enableGroupGifting;
	
	@FindBy(name="groupGiftingThreshold")//need to fix arrow up and down
	public WebElement groupGiftingThreshhold;
	
	@FindBy(xpath="//input[@name='wr-cr-permission' and @value='SHARED']")
	public WebElement onlyPeopleWithALinkCanSee;
	
	@FindBy(xpath="//input[@id='wm-cr-wedding-status-email']")
	public WebElement wantToReceiveEmails;
	
	@FindBy(xpath="//input[@id='wr-cm-wedding-offer-email']")
	public WebElement wantToReceiveProductOffer;
	
	@FindBy(id="wr-cr-captcha-input-box")
	public WebElement typeCharacters;
	
	@FindBy(linkText="Create my registry")
	public WebElement createMyRegistry;
	
	@FindBy(linkText="No thanks, I don't want to sign up for Prime at this time")
	public WebElement noThanks;
	
	@FindBy(partialLinkText="wedding-logo-en_US")
	public WebElement weddingLogo;
	
	@FindBy(css=".wedding-details-stripe__greeting-header")
	public WebElement greetingHeader; 
	
	@FindBy(xpath ="//a[contains(text(),'Mohammad')]")//change it
	WebElement registryNameLabel;
	
	
	public RegistryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validateWeddingRegistryTitle() {
		return driver.getTitle();
	}
	
	public String validateCreatingWeddingRegistryTitle() {
		return driver.getTitle();
	}
	
	public boolean validateWeddingRegistryLogo() {
		return weddingRegistryLogo.isDisplayed();
	}
	
	public boolean validateWeddingLogo() {
		return weddingRegistryLogo.isDisplayed();
	}
	
	public boolean verifyHomePageHeader(){ //how can we make this 2 method together
		waitHelper.WaitForElement(greetingHeader, 60);
		return greetingHeader.isDisplayed();
	}
	
	public String getHomePageHeaderText(){
		waitHelper.WaitForElement(greetingHeader, 20);
		return greetingHeader.getText();
	}
	
	public boolean verifyCorrectRegistryName() {
    	return registryNameLabel.isDisplayed();
    }
	
//	public String getHomePageTitle(){
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleContains(Constants.HOME_PAGE_TITLE));
//		return driver.getTitle();
//	}
//	
	
//	
//	
	
//	

	
	
	
	
	
	
	
	
	
	
	
}
