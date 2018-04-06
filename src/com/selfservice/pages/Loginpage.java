package com.selfservice.pages;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Loginpage extends TestBase{

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Loginpage ExtractJSLogs() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
        }
        return loginpage;
	}
	public Loginpage click_on_login() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver,Loginpage.class);
		click_login.click();
		System.out.println("loginpage is opened");
		return loginpage;
	}
	
	public Loginpage enter_user() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver,Loginpage.class);
		username_textfield.sendKeys("superadmin@yopmail.com");
		System.out.println("username has entered");
		return loginpage;
	}
	
	public Loginpage enter_pass() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		password_textfield.sendKeys("12345678");
		System.out.println("password has entered");
		return loginpage;
	}
	
	public Loginpage click_on_submitbutton() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver,Loginpage.class);
		submit_button.click();
		System.out.println("login successful");
		return loginpage;
	}
	
	public Loginpage wait_login() throws InterruptedException {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver, Loginpage.class);
		Thread.sleep(3000);
		return loginpage;
	}
	
	public Loginpage login() throws InterruptedException {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver,Loginpage.class);
		click_on_login().enter_user().enter_pass().wait_login().click_on_submitbutton();
//		ExtractJSLogs();
		return loginpage;
	}

	public Homepage go_tohome() throws InterruptedException {
		homepage=new Homepage(driver);
		PageFactory.initElements(driver, Homepage.class);
		return homepage;
	}
	
	public Feedslistpage go_tofeeds() {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		return feedslistpage;
	}
	
	public Userprofilepage go_toprofile() throws InterruptedException {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		Thread.sleep(6000);
		return userprofilepage;
	}
	
	public Addfeedspage go_to_addfeeds() throws InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		Thread.sleep(3000);
		return addfeedspage;
	}
	
	public Categorypage go_to_category() throws InterruptedException {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		Thread.sleep(2000);
		return categorypage;
	}
	
	public Userspage go_to_userspage() throws InterruptedException {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		Thread.sleep(3000);
		return userspage;
	}
}
