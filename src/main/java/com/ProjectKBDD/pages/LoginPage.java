package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	//By Locators/Object Repositories
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?111");
	
	//Constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//page actions
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() throws InterruptedException {
		driver.findElement(signInButton).click();
		Thread.sleep(8000);
	}
	
	public AccountsPage doLogin(String un, String pwd) throws InterruptedException {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		Thread.sleep(8000);
		return new AccountsPage(driver);
	}
}
