package com.amazonbdd.test.qa.helper;


public class Constants {


	public final static String email = "xxxxxxxxxxxxxx"; //need to put
	public final static String password = "xxxxxxxxxxx";
	
	public final static long explicitWait = 100;
	public final static long impliciteWait = 100;
	
//	public static final String LOGIN_PAGE_TITLE = "HubSpot Login";
//	public static final String HOME_PAGE_TITLE = "Reports dashboard";
//	
//	public static final String HOME_PAGE_HEADER = "Sales Dashboard";
//	
	public static final String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public static final String CREATING_WEDDING_REGISTRY_PAGE_TITLE = "Create a Wedding Registry - Amazon Wedding &amp; Bridal Registry";
//	
//	public final static String TESTDATA_SHEET_PATH = "/Users/NaveenKhunteta/Documents/workspace/JanPOMSeries/"
//			+ "src/main/java/com/qa/hubspot/testdata/HubSpotTestData.xlsx";
	
	public static final int SHORT_WAIT = 3000;
	public static final int MEDIUM_WAIT = 6000;
	public static final int LONG_WAIT = 10000;

	
	public static String getEmail() {
		return email;
	}
	public static String getPassword() {
		return password;
	}
	public static long getExplicitwait() {
		return explicitWait;
	}
	public static long getImplicitewait() {
		return impliciteWait;
	}
	
}
