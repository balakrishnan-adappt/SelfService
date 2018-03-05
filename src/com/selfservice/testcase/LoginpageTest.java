package com.selfservice.testcase;

import org.testng.annotations.Test;



public class LoginpageTest extends TestBase{
	
	@Test
	public void loginpage() {
		homepage.waitfor_element().click_on_login().enter_user().enter_pass().click_on_submitbutton();
	}

}
