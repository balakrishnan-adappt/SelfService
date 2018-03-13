package com.selfservice.testcase;

import org.testng.annotations.Test;



public class LoginpageTest extends TestBase{
	
	@Test
	public void loginpage() throws InterruptedException {
		homepage.scroll_pages().go_tologin().login();
	}

}
