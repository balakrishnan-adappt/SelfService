package com.selfservice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Loginpage extends TestBase{

	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
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
	
	public Loginpage login() {
		loginpage=new Loginpage(driver);
		PageFactory.initElements(driver,Loginpage.class);
		click_on_login().enter_user().enter_pass().click_on_submitbutton();
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
}
