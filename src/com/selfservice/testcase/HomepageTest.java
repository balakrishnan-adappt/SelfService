package com.selfservice.testcase;

import org.testng.annotations.Test;

public class HomepageTest extends TestBase{

	@Test
	public void homepage() throws InterruptedException {
		homepage.scroll_pages();
		System.out.println("homepage is scrolled");
		Thread.sleep(3000);
	}
}

