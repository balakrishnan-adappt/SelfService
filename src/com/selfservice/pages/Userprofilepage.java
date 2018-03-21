package com.selfservice.pages;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Userprofilepage extends TestBase {

	public Userprofilepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public Userprofilepage click_update() {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		update_profile.click();
		return userprofilepage;
	}
	
	public Userprofilepage update_profilephoto() throws IOException, InterruptedException {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		click_photoicon.click();
		Runtime.getRuntime().exec("E:\\FileUpload.exe");
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		System.out.println("totla buttons = " +upload_button.size());
		WebElement b=upload_button.get(1);
		Actions action = new Actions(driver);
		action.moveToElement(b).click().perform();
		return userprofilepage;
	}
	
	public Userprofilepage profile_wait() throws InterruptedException  {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		Thread.sleep(5000);
		return userprofilepage;
}
	public String generateRandomString(int length) {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		return RandomStringUtils.randomAlphabetic(length);
	}
	
	public Userprofilepage update_firstname() {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		String first_name=firstname.getAttribute("value");
		System.out.println("firstname before update is  "+first_name);
		firstname.clear();
		firstname.sendKeys(generateRandomString(8));
		return userprofilepage;
	}
	
	public Userprofilepage update_lastname() {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		String last_name=lastname.getAttribute("value");
		System.out.println("lastname before update is   "+last_name);
		lastname.clear();
		lastname.sendKeys(generateRandomString(9));
		return userprofilepage;
	}
	
	public Userprofilepage profile_submit() {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		profile_submit.click();
		return userprofilepage;
	}
	
	public Userprofilepage profile_update() throws IOException, InterruptedException {
		userprofilepage=new Userprofilepage(driver);
		PageFactory.initElements(driver, Userprofilepage.class);
		click_update().profile_wait().update_profilephoto().profile_wait().update_firstname().update_lastname();
		String user_name=username.getAttribute("value");
		System.out.println("username is  "+ user_name );
		String email_id=email.getAttribute("value");
		System.out.println("email id is  "+email_id);
		profile_submit().profile_wait();
		String first_name1=firstname1.getAttribute("value");
		System.out.println("firstname after update is  "+first_name1);
		String last_name1=lastname1.getAttribute("value");
		System.out.println("lastname after update is   "+last_name1);
		return userprofilepage;
	}
}