package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
    private WebDriver driver;

    private By radioButtonele = By.xpath("//span[text()='Radio Button']");
    private By yesRadioButton = By.xpath("//label[@for='yesRadio']");
    private By impressvieRadioButton = By.xpath("//*[@id='impressiveRadio']");

    public RadioButton(WebDriver driver){
        this.driver = driver;
    }

    public void validateRadioButtonElement() {

        driver.findElement(radioButtonele).click();
    }

    public void validateYesRadioButtonElement(){

        driver.findElement(yesRadioButton).click();
    }

    public void validateImpressiveRadioButtonElement() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        WebElement ele = driver.findElement(impressvieRadioButton);
        exe.executeScript("arguments[0].click();", ele );
        Thread.sleep(5000);
    }
}
