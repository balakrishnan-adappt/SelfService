package com.selfservice.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Homepage extends TestBase {

	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Homepage scroll_page_down() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Moved page down");
		return homepage;
	}
	
	public Homepage scroll_page_up() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(2000);
		System.out.println("Moved page up");
		return homepage;
	}

	public Homepage scroll_pages() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		scroll_page_down().scroll_page_up();
		return homepage;
	}
	
	public Loginpage go_tologin() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		return loginpage;
	}
	
	
}
