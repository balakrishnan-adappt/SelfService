package com.selfservice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Addfeedspage extends TestBase{
	
	public Addfeedspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
