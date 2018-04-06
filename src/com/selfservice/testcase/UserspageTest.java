package com.selfservice.testcase;

import org.testng.annotations.Test;

public class UserspageTest extends TestBase {

	@Test
	public void verify_userspage() throws InterruptedException {
		homepage.go_tologin().login().go_to_userspage().add_users();
	}
}
