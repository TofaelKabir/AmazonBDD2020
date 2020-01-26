$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registryPage.feature");
formatter.feature({
  "line": 2,
  "name": "As an User",
  "description": "I want to create weddding Registry with my credentails to Amazon application \nIn order to get access of the Registry wedding application features",
  "id": "as-an-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@WeddingRegistry"
    }
  ]
});
formatter.before({
  "duration": 5067737474,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#This is declarative BDD, not line by line description"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "id": "as-an-user;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on the Amazon page URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I naviagate to Registry for Wedding",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on Create Your Registry  button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I Sign In with my credentails",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I can build the registry of my dreams",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I can see a greeting header by our name",
  "keyword": "And "
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_am_on_the_Amazon_page_URL()"
});
formatter.result({
  "duration": 5490448034,
  "status": "passed"
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_naviagate_to_Registry_for_Wedding()"
});
formatter.result({
  "duration": 2624776673,
  "error_message": "java.lang.AssertionError: Wedding Registry Page Title doesn\u0027t match expected [Amazon Wedding] but found []\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\n\tat org.testng.Assert.assertEquals(Assert.java:116)\n\tat org.testng.Assert.assertEquals(Assert.java:190)\n\tat com.amazonbdd.test.qa.stepdefinitions.RegistryPageStepDefinitions.i_naviagate_to_Registry_for_Wedding(RegistryPageStepDefinitions.java:41)\n\tat ✽.And I naviagate to Registry for Wedding(registryPage.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_click_on_Create_Your_Registry_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_Sign_In_with_my_credentails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_can_build_the_registry_of_my_dreams()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistryPageStepDefinitions.i_can_see_a_greeting_header_by_our_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1453596908,
  "status": "passed"
});
formatter.uri("signinPage.feature");
formatter.feature({
  "line": 2,
  "name": "Sign In",
  "description": "As an User\nI want to Sign In with my credentails to Amazon application \nIn order to get access of the application features",
  "id": "sign-in",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SignIn"
    }
  ]
});
formatter.before({
  "duration": 2445137358,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 7,
      "value": "#This is imperative BDD, line by line description"
    }
  ],
  "line": 9,
  "name": "User navigates to Application URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 10,
  "name": "I am on the Amazon page URL \"https://www.amazon.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I should see the title and logo of the Amazon application",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com",
      "offset": 29
    }
  ],
  "location": "SigninPageStepDefinitions.i_am_on_the_Amazon_page_URL(String)"
});
formatter.result({
  "duration": 4119376563,
  "status": "passed"
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_should_see_the_title_and_logo_of_the_Amazon_application()"
});
formatter.result({
  "duration": 222581538,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Sign in with valid credential",
  "description": "",
  "id": "sign-in;sign-in-with-valid-credential",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I hover over on sign in area",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter email in input field as \"tofael483@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click in continue button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I enter password in input field as \"Nabeeha19\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click in SignIn button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I sould see the title of the SignIn page",
  "keyword": "Then "
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_hover_over_on_sign_in_area()"
});
formatter.result({
  "duration": 4997345862,
  "status": "passed"
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_click_on_signin_button()"
});
formatter.result({
  "duration": 1267957677,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tofael483@gmail.com",
      "offset": 33
    }
  ],
  "location": "SigninPageStepDefinitions.i_enter_email_in_input_field_as(String)"
});
formatter.result({
  "duration": 89859594,
  "error_message": "org.openqa.selenium.JavascriptException: javascript error: document.getElementByClass is not a function\n  (Session info: chrome\u003d79.0.3945.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Mohammads-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:896:29e6:d18c:3e44%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.88, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: /var/folders/cf/591wgxqs2w9...}, goog:chromeOptions: {debuggerAddress: localhost:52493}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1bfebc61839ab82bf61aae4abc8bcd3c\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:489)\n\tat com.amazonbdd.test.qa.stepdefinitions.SigninPageStepDefinitions.i_enter_email_in_input_field_as(SigninPageStepDefinitions.java:79)\n\tat ✽.And I enter email in input field as \"tofael483@gmail.com\"(signinPage.feature:17)\n",
  "status": "failed"
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_click_in_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Nabeeha19",
      "offset": 36
    }
  ],
  "location": "SigninPageStepDefinitions.i_enter_password_in_input_field_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_click_in_SignIn_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SigninPageStepDefinitions.i_sould_see_the_title_of_the_SignIn_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 590825834,
  "status": "passed"
});
});