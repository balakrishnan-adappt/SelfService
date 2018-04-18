package com.selfservice.testcase;

import org.testng.annotations.Test;



public class LoginpageTest extends TestBase{
	
	@Test
	public void loginpage() throws InterruptedException {
		homepage.go_tologin().click_on_login().userrole().wait_login().click_on_submitbutton();
	}

}
