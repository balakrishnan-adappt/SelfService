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
	
	public Loginpage wait_for() throws InterruptedException {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		Thread.sleep(3000);
		return loginpage;
	}
	
	public Loginpage waitfor_element() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		System.out.println("moved to loginpage");
		return loginpage;
	}
	
	public Feedslistpage move_to_feeds() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		Thread.sleep(3000);
		System.out.println("moved to feeds page");
		return feedslistpage;
	}
}
