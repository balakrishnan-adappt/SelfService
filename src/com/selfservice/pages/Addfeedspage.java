package com.selfservice.pages;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.selfservice.testcase.TestBase;

public class Addfeedspage extends TestBase{
	
	public Addfeedspage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Addfeedspage click_addfeeds() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		click_addfeedsmenu.click();
		System.out.println("Add feeds menu is opened");
		return addfeedspage;
	}
	
	public Addfeedspage feed_count() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		System.out.println("feed count before adding new feed = "+feed_count.getText());
		return addfeedspage;
	}
	
	public Addfeedspage click_addfeed_button() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		addfeed_button.click();
		System.out.println("Add feeds button is clicked");
		return addfeedspage;
	}
	
	public Addfeedspage enter_feedtitle() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		Date d = new Date(System.currentTimeMillis());
		feed_title.sendKeys("Feed "+d);
		System.out.println("feed title is entered");
		return addfeedspage;
	}
	
	public Addfeedspage enter_feedURL() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		feed_url.sendKeys("https://lorem-rss.herokuapp.com/feed?unit=minute");
		System.out.println("feed URL is enetered");
		return addfeedspage;
	}
	
	public Addfeedspage upload_feedimage() throws IOException, InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		upload_feedimage.click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E:\\Feedimage_upload.exe");
		driver.switchTo().activeElement();
		System.out.println("feed image has been uploaded");
		return addfeedspage;
		
	}
	
	public Addfeedspage addfeedspage_wait() throws InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		Thread.sleep(5000);
		return addfeedspage;
	}
	
	public Addfeedspage align_image() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		center_feedimage.click();
		return addfeedspage;
	}
	
	public Addfeedspage create_feed() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		create_feed.click();
		System.out.println("New Feed has been created");
		return addfeedspage;
	}
	
	public Addfeedspage feed_count1() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		System.out.println("feed count after adding new feed = "+feed_count.getText());
		return addfeedspage;
	}
	
	public Addfeedspage add_feeds() throws InterruptedException, IOException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		addfeedspage_wait().feed_count().click_addfeed_button().enter_feedtitle().enter_feedURL().upload_feedimage().addfeedspage_wait().align_image()
		.create_feed().addfeedspage_wait().feed_count1();
		return addfeedspage;
	}
	
	public Addfeedspage click_feededit() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		System.out.println("total feeds = "+edit_feedicon.size());
		if(edit_feedicon.size()>0) {
			WebElement edit=edit_feedicon.get(0);
			Actions action=new Actions(driver);
			action.moveToElement(edit).click().perform();
			System.out.println("Edit icon is clicked");
		}else {
			System.out.println("There is no feeds to edit");
		}
		return addfeedspage;
	}
	
	public Addfeedspage edit_feedname() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		Date date= new Date(System.currentTimeMillis());
		feed_title.clear();
		feed_title.sendKeys("Edited Feed "+date);
		System.out.println("feed name is changed");
		return addfeedspage;
	}
	
	public Addfeedspage update_feed() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		update_feed.click();
		System.out.println("feed has been updated");
		return addfeedspage;
	}
	
	public Addfeedspage edit_feeds() throws InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		addfeedspage_wait().click_feededit().addfeedspage_wait().edit_feedname().update_feed();
		return addfeedspage;
	}
	
	public Addfeedspage click_feeddelete() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		System.out.println("total feeds = "+delete_feedicon.size());
		if(delete_feedicon.size()>0) {
			WebElement delete=delete_feedicon.get(1);
			Actions action=new Actions(driver);
			action.moveToElement(delete).click().perform();
			System.out.println("delete icon is clicked");
		}else {
			System.out.println("There is no feeds to delete");
		}
		return addfeedspage;
	}
	
	public Addfeedspage delete_popup() throws InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		String parent_window=driver.getWindowHandle();
        String sub_window=null;
        Set<String> handles=driver.getWindowHandles();
        Iterator<String> iterator=handles.iterator();
        while(iterator.hasNext()) {
        	sub_window=iterator.next();
        }
        driver.switchTo().window(sub_window);
        delete_OK.click();
        Thread.sleep(3000);
        System.out.println("feed has been deleted");
        return addfeedspage;
	}
	
	public Addfeedspage feed_count2() {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		System.out.println("feed count after deleting feed = "+feed_count.getText());
		return addfeedspage;
	}
	
	public Addfeedspage delete_feeds() throws InterruptedException {
		addfeedspage=new Addfeedspage(driver);
		PageFactory.initElements(driver, Addfeedspage.class);
		click_feeddelete().addfeedspage_wait().delete_popup().addfeedspage_wait().feed_count2();
		return addfeedspage;
	}
	
	public Feedslistpage go_tofeeds() {
		feedslistpage=new Feedslistpage(driver);
		PageFactory.initElements(driver, Feedslistpage.class);
		return feedslistpage;
	}
}
