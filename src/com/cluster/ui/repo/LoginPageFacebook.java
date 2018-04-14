package com.cluster.ui.repo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageFacebook {

	WebDriver driver;
	public LoginPageFacebook(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getUsernameTextbox()
	{
		WebElement element = driver.findElement(By.id("email"));
		return element;
	}
	public WebElement getPasswordTextbox()
	{
		return driver.findElement(By.id("pass"));
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(By.id("u_0_2"));
	}
	public WebElement getErrorMsgText()
	{
		return driver.findElement(By.
				xpath("//span[text()='Username or Password is invalid. Please try again.']"));
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.
			visibilityOfElementLocated(By.cssSelector("i[class='fb_logo img sp_Ql3TJxfFsAW sx_bf51ef']")));
}
}
