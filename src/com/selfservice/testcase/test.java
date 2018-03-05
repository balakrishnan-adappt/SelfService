package com.selfservice.testcase;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test extends TestBase{

	
	@Test
	public void main_function() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(@href,'/login')]")).click();
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("bhuvanesh");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345678");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		boolean feed=driver.findElement(By.xpath("//div[@id='5a33c824537e6db1119c951a']")).isSelected();
		if(feed==true) {
			System.out.println("feed is subscribed");
		}else {
		System.out.println("feed is not subscribed");
		driver.findElement(By.xpath("//div[@id='5a33c824537e6db1119c951a']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='5a33c824537e6db1119c951a']")).click();
		
		driver.findElement(By.xpath("//input[@id='3']")).click();
		System.out.println("Alert per item type has been selected");
		List<WebElement> alert_type =driver.findElements(By.xpath("//ul[@class='email_alert_type']"));
		for(int i=0;i<alert_type.size();i++){
		    System.out.println(alert_type.get(i).getText());
		    }
		
		}
	}
}