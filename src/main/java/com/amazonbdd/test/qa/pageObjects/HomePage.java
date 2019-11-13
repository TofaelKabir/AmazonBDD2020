package com.amazonbdd.test.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import com.amazonbdd.test.qa.helper.Constants;
import com.amazonbdd.test.qa.helper.WaitHelper;



public class HomePage {

	private WebDriver driver;

	WaitHelper waitHelper;

	@FindBy(xpath = "//a[@tabindex='5' and @class='nav-a']") //most of the people use it
	public WebElement header;
	
	@FindBy(how = How.CLASS_NAME, using ="hm-icon nav-sprite") //this is another way to write
    public static WebElement hamburger;

	@FindBy(css = ".nav-sprite nav-logo-base")
	public WebElement amazonLogo;

	@FindBy(css = ".nav-search-dropdown searchSelect")
	public WebElement searchDropdown;

	@FindBy(name = "field-keywords")
	public WebElement searchTextBox;

	@FindBy(id = "nav-search-submit-text")
	public WebElement searchSubmit;

	@FindBy(css = "#nav-packard-glow-loc-icon")
	public WebElement deliveryIcon;

	@FindBy(linkText = "Today's Deals")
	public WebElement todaysDeals;

	@FindBy(partialLinkText = "Your Amazon.c")
	public WebElement yourAmazonDotCom;

	@FindBy(xpath = "//a[contains(text(),'Gift Cards')]")
	public WebElement giftCards;
	// have to work on it
	@FindBy(xpath = "//a[text()='Help' and @class='nav-a']")
	public WebElement help;

	@FindBy(xpath = "//a[@class='nav-a' and text()='Whole Foods']")
	public WebElement wholeFoods;
	// have to work on registry
	@FindBy(xpath = "//a[@tabindex='52']")
	public WebElement registry;
	// have to work on sell
	@FindBy(xpath = "//a[@class = 'nav-a' and text()='Sell' and @tabindex ='53']")
	public WebElement sell;

	@FindBy(className = "icp-nav-link-inner")
	public WebElement language;

	@FindBy(css = "#nav-link-accountList")
	public WebElement helloSignInAccountAndLists;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	public WebElement signIn;

	@FindBy(xpath = "//span[contains(text(),'Orders') and @class='nav-line-2']")
	public WebElement orders;

	@FindBy(id = "nav-link-prime")
	public WebElement tryPrime;

	@FindBy(xpath = "//a[@class='nav-a nav-a-2']")
	public WebElement cart;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public String validateAmazonTitle() {
		return driver.getTitle();
	}

	public boolean validateAmazonLogo() {
		return amazonLogo.isDisplayed();
	}

	public TodaysDealsPage navigateToTodaysDeals() {
		todaysDeals.click();
		return new TodaysDealsPage(driver);
	}

	public YourAmazonDotComPage navigateToYourAmazonDotCom() {
		yourAmazonDotCom.click();
		return new YourAmazonDotComPage(driver);
	}

	public RegistryPage navigateToRegistry() {
		registry.click();
		return new RegistryPage(driver);
	}
	public WholeFoodsPage navigateToWholeFoods() {
		wholeFoods.click();
		return new WholeFoodsPage(driver);
	}
	public SellPage navigateToSell() {
		sell.click();
		return new SellPage(driver);
	}
	
	

//	public void verifyUserNameTest(){
//		testUtil.switchToFrame();
//		AssertJUnit.assertTrue(signInPage.verifyCorrectUserName());
//	}
	
//	public ContactsPage navigateToContactsPage(){
//	WebDriverWait wait = new WebDriverWait(driver, 20);
//	wait.until(ExpectedConditions.visibilityOf(contactsTab));
//	contactsTab.click();
//	TestUtil.shortWait();
//	contactsLink.click();
//	
//	return new ContactsPage(driver);
//	
//}	
	
	
	
    
//	public static final String HOME_PAGE_TITLE = "StarWars.com | The Official Star Wars Website";
//
//    public String getHomePageTitle(){
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.titleContains(HomePage.HOME_PAGE_TITLE));
//        return driver.getTitle();
//    }
//    public VideoPage navigateToVideoPage(){
//        WebDriverWait wait = new WebDriverWait(driver, 20);
//        wait.until(ExpectedConditions.visibilityOf(videoTab));
//        videoTab.click();
//        return new VideoPage();
//        
//        
        
//	public void navigateToContacts() {
//		contactsLink.click();
//	}
//
//	public void navigateToOpportunities() {
//		opportunitiesLInk.click();
//	}
//
//	public WebElement getAdministrator() {
//		waitHelper.WaitForElement(administrator, Constants.getExplicitwait());
//		return administrator;
//	}

}
