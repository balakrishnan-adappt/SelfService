package com.selfservice.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.selfservice.testcase.TestBase;

public class Userspage extends TestBase{
	
	public Userspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	Random rad=new Random();
	int r=rad.nextInt(100);
	
	public Userspage click_usersmenu() {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		button_usersmenu.click();
		return userspage;
	}

	public Userspage click_adduser() {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		String user=user_count.getText();
		System.out.println("Total users before adding= "+user);
		button_adduser.click();
		return userspage;
	}
	
	public Userspage enter_username() {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		text_username.sendKeys("username"+r);
		return userspage;
	}
	
	public Userspage enter_useremail() {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		text_email.sendKeys("username"+r+"@yopmail.com");
		return userspage;
	}
	
	public Userspage userspage_wait() throws InterruptedException {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		Thread.sleep(3000);
		return userspage;
	}
	
	public Userspage enter_password() throws InterruptedException {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		text_password.sendKeys("12345678");
		text_confrmPass.sendKeys("12345678");
		return userspage;
	}
	
	public Userspage select_userrorle() throws InterruptedException {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		Select dropdown=new Select(userrole_dropdown);
		dropdown.selectByIndex(2);
		return userspage;
	}
	
	public Userspage click_usercreate() {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		System.out.println("New user has been created");
		button_createuser.click();
		return userspage;
	}
	
	public Userspage add_users() throws InterruptedException {
		userspage=new Userspage(driver);
		PageFactory.initElements(driver, Userspage.class);
		click_usersmenu().userspage_wait().click_adduser().enter_username().enter_useremail().enter_password().userspage_wait()
		.select_userrorle().userspage_wait().click_usercreate();
		Thread.sleep(3000);
		String user1=user_count.getText();
		System.out.println("Total users after adding new user= "+user1);
		return userspage;
	}
}
