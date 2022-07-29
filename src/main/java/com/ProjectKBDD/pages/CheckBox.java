package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {

	private WebDriver driver;
	private By checkBoxElement = By.xpath("//span[text()='Check Box']");
	private By expandOpenIcon = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button");
	private By homeCheckBox = By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]");
	private By expandOpenSubIcon = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button");	
	private By expandOpenSubIcon2 = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/button");
	private By documents = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/label/span[1]");
	
	public CheckBox(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateCheckBoxElement() {
		driver.findElement(checkBoxElement).click();
	}
	
	public void validateCheckBoxop() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(expandOpenIcon).click();
		driver.findElement(homeCheckBox).click();
		driver.findElement(expandOpenSubIcon).click();
		driver.findElement(expandOpenSubIcon2).click();
		driver.findElement(documents).click();
	}
}
