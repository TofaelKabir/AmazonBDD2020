package com.amazonbdd.test.qa.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finding {

	
		public static void main(String[]args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://amazon.com");
			
			
			//search for product and click on search button
			
			//ArrayList <Integer> ar = new ArrayList();
			String finalOutput = "";
		
			
			int maxPageSize = Integer.parseInt(driver.findElement(By.xpath("//ul[@class='a-pagination']/child::li[last()-1]")).getText());
			
		for(int i=0; i<maxPageSize; i++) {
			List <WebElement> ls = driver.findElements(By.xpath("//span[contains(@class,'SEARCH_RESULTS')]/descendant::span[@class='a-size-base']"));
		    List <WebElement> names = driver.findElements(By.xpath(""));
		    int biggestNumber = 0;
		    int iteration = 0;
		for (int j=1; j<ls.size(); j++) {
			int previousReview = Integer.parseInt(ls.get(j-1).getText());
 			int NextReview = Integer.parseInt(ls.get(j).getText());
 			
			//ar.add(highestReview);
			if (NextReview>previousReview) {
				biggestNumber = NextReview;
			}else {
				biggestNumber = previousReview;
			}
			//biggestNumber=(highestReview>previousReview)?highestReview:previousReview;//ternary //from 39-43
			while(j==ls.size()-1) {
				finalOutput=names.get(j).getText()+" has review count: "+biggestNumber;
				
				
			}
		}
		
		
		}
		
		
		

	}

}
