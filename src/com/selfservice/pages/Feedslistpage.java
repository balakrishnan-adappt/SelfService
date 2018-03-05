package com.selfservice.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Feedslistpage extends TestBase {

	public Feedslistpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, Feedslistpage.class);
	}
	
	public Feedslistpage select_alertperfeed() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		boolean feed=select_firstfeed.isSelected();
		if(feed==true) {
			System.out.println("feed is already subscribed");
		}else {
		System.out.println("feed is not subscribed");
		select_firstfeed.click();
		Thread.sleep(3000);
		firstfeed_bell_icon.click();
		alert_per_item.click();
		System.out.println("Alert per item type has been selected");
		}
		return feedslistpage;
	}
	
	public Feedslistpage feed_wait() throws InterruptedException {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		Thread.sleep(3000);
		return feedslistpage;
	}
	
	}

