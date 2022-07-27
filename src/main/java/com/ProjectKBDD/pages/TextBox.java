package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBox {

	private WebDriver driver;
	private By textBoxelement = By.xpath("//span[text()='Text Box']");
	private By fullName = By.id("userName");
	private By emailId = By.id("userEmail");
	private By currAddress = By.id("currentAddress");
	private By permaAddress = By.id("permanentAddress");
	private By submitBtn = By.id("submit");
	
	public TextBox(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateTextBoxElement() {
		driver.findElement(textBoxelement).click();
	}
	
	public void submitData(String fullname, String email, String currentAddress, String permAddress) throws InterruptedException {
		driver.findElement(fullName).sendKeys(fullname);
		driver.findElement(emailId).sendKeys(email);
		driver.findElement(currAddress).sendKeys(currentAddress);
		driver.findElement(permaAddress).sendKeys(permAddress);
		driver.findElement(submitBtn).click();
		driver.findElements(By.tagName("input")).forEach(WebElement::clear);
		driver.findElements(By.tagName("textarea")).forEach(WebElement::clear);
//		driver.findElement(fullName).clear();
//		driver.findElement(emailId).clear();
//		driver.findElement(currAddress).clear();
//		driver.findElement(permaAddress).clear();
		Thread.sleep(5000);
	}
	
}
