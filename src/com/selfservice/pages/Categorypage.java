package com.selfservice.pages;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.selfservice.testcase.TestBase;

public class Categorypage extends TestBase{
	
	public Categorypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public Categorypage click_categorymenu() {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		button_categorymenu.click();
		System.out.println("category menu is selected");
		return categorypage;
	}
	
	public Categorypage click_addcategory() {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		String cat_count=category_count.getText();
		System.out.println("Total categories before adding = "+ cat_count);
		button_addcategory.click();
		System.out.println("Add category button is clicked");
		return categorypage;
	}
	
	public Categorypage enter_categoryname() {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		Date date=new Date(System.currentTimeMillis());
		category_name.sendKeys("category "+ date);
		System.out.println("Category name is entered");
		return categorypage;
	}
	
	public Categorypage click_createcategory() {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		button_categorycreate.click();
		System.out.println("New category is created");
		return categorypage;
	}
	
	public Categorypage add_category() throws InterruptedException {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		click_categorymenu().category_wait().click_addcategory().enter_categoryname().category_wait().click_createcategory();
		Thread.sleep(3000);
		String cat_count1=category_count.getText();
		System.out.println("Total categories after adding = "+ cat_count1 );
		return categorypage;
	}
	
	public Categorypage edit_category() throws InterruptedException {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		if(button_categoryedit.size()>0) {
//			System.out.println("total categories= "+button_categoryedit.size());
			WebElement edit_icon=button_categoryedit.get(1);
			Actions action=new Actions(driver);
			action.moveToElement(edit_icon).click().perform();
			System.out.println("Edit icon is clicked");
			Date date= new Date(System.currentTimeMillis());
			category_name.clear();
			category_name.sendKeys("EditCat "+ date);
			button_categoryupdate.click();
			System.out.println("Category name is changed");
			Thread.sleep(3000);
			}else {
				System.out.println("There is no category");
			}
		return categorypage;
		}
	
	public Categorypage category_wait() throws InterruptedException {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		Thread.sleep(3000);
		return categorypage;
	}
	
	public Categorypage delete_category() throws InterruptedException {
		categorypage=new Categorypage(driver);
		PageFactory.initElements(driver, Categorypage.class);
		if(button_categorydelete.size()>0) {
			System.out.println("total categories before deleting = "+button_categorydelete.size());
			WebElement delete_icon=button_categorydelete.get(1);
			Actions action=new Actions(driver);
			action.moveToElement(delete_icon).click().perform();
			System.out.println("delete icon is clicked");
			String parent_window=driver.getWindowHandle();
	        String sub_window=null;
	        Set<String> handles=driver.getWindowHandles();
	        Iterator<String> iterator=handles.iterator();
	        while(iterator.hasNext()) {
	        	sub_window=iterator.next();
	        }
	        driver.switchTo().window(sub_window);
	        delete_category_ok.click();
	        System.out.println("category has been deleted");
	        Thread.sleep(3000);
	        driver.switchTo().window(parent_window);
	        System.out.println("Total categories after deleting= "+button_categorydelete.size());
		}else {
			System.out.println("There is no category to delete");
		}
		return categorypage;
		}
	
}
