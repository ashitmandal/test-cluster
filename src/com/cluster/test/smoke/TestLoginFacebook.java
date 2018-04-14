package com.cluster.test.smoke;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cluster.generic.utils.CreateDriver;
import com.cluster.test.config.TestConfiguration;

import com.cluster.ui.repo.LoginPageFacebook;

public class TestLoginFacebook extends TestConfiguration
{
	WebDriver driver;
	LoginPageFacebook login;
	
	@BeforeMethod
	public void preCOndition()
	{
		driver = CreateDriver.getDriverInstance();
		login = new LoginPageFacebook(driver);
	}
	@Test
	public void testLoginInvalid()
	{
//		Wait for login page
		login.waitForLoginPageToLoad();
		String actual_title = driver.getTitle();
		String expected_title = "Facebook – log in or sign up";
//		Get title and verify it
		Assert.assertEquals(actual_title, expected_title);
//		Enter Invalid Username
		login.getUsernameTextbox().sendKeys("amankumar");
//		Enter Invalid password
		login.getPasswordTextbox().sendKeys("invailed",Keys.ENTER);
//		Click on Login button
	/*	login.getLoginButton().click();
		//Get error msg and verify
		String actual_error_msg = login.getErrorMsgText().getText();
		String expected_error_msg = "Username or Password is invalid. Please try again.";
		Assert.assertEquals(actual_error_msg, expected_error_msg);
*/
		
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}