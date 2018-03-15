package com.selfservice.pages;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Feedslistpage extends TestBase  {

	public Feedslistpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Feedslistpage select_feed() {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		System.out.println("total number of alerts = " +dynamic_feeds.size());
		WebElement f= dynamic_feeds.get(5);
		Actions action = new Actions(driver);
		action.moveToElement(f).click().perform();
		System.out.println("element found");
		return feedslistpage;
	}
	
	public Feedslistpage click_bell_icon() {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		List<WebElement> bell=driver.findElements(bell_icon);
		bell.size();
		System.out.println("total subscribed alerts = " + bell.size());
		WebElement b=bell.get(0);
		Actions bellaction = new Actions(driver);
		bellaction.moveToElement(b).click().perform();
		System.out.println("bell icon clicked");
		return feedslistpage;
	}
	
	public Feedslistpage select_alertperitem() {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		List<WebElement> alert_per_item=driver.findElements(select_alertperitem);
		System.out.println("Total alert per feeds = " + alert_per_item.size());
		WebElement alert1=alert_per_item.get(2);
		Actions alert1_click=new Actions(driver);
		alert1_click.moveToElement(alert1).click().perform();
		System.out.println("alert per item is selected");
		return feedslistpage;
	}
	
	public Feedslistpage Alert_per_item() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		select_feed().feed_wait().click_bell_icon().select_alertperitem();
		return feedslistpage;
	}
	
	public Feedslistpage selectfeed() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);

	List<WebElement> title= driver.findElements(By.xpath("//div[starts-with(@id,'5a')]"));
	title.size();
	System.out.println("total number of alerts = " +title.size());
	WebElement f= title.get(5);
	String feed_title= f.getText();
	System.out.println("feed title is  "+feed_title);
	Actions action = new Actions(driver);
	action.moveToElement(f).click().perform();
	System.out.println("element found");
	Thread.sleep(8000);
	List<WebElement> bell=driver.findElements(By.xpath("//img[starts-with(@id,'5a')]"));
	bell.size();
	Thread.sleep(3000);
	System.out.println("total subscribed alerts = " + bell.size());
	WebElement b=bell.get(0);
	Actions bellaction = new Actions(driver);
	bellaction.moveToElement(b).click().perform();
	System.out.println("bell icon clicked");
	
	List<WebElement> alert_per_item=driver.findElements(By.xpath("//input[@value='Alert per item']"));
	System.out.println("Total alert per feeds = " + alert_per_item.size());
	WebElement alert1=alert_per_item.get(2);
	Actions alert1_click=new Actions(driver);
	alert1_click.moveToElement(alert1).click().perform();
	System.out.println("alert per item is selected");
	return feedslistpage;
}
	
	public Feedslistpage feed_wait() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		Thread.sleep(5000);
		return feedslistpage;
	}
	
	}

