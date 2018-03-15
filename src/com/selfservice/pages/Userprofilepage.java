package com.selfservice.pages;

import java.io.IOException;
import java.util.List;

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
}