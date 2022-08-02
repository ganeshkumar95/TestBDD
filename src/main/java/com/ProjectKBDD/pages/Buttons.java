package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

    private WebDriver driver;

    private Actions act;

    private By buttonElement = By.xpath("//span[text()='Buttons']");
    private By doubleClickBtn = By.id("doubleClickBtn");
    private By rightClickBtn = By.id("rightClickBtn");
    private By normalClickBtn = By.xpath("(//button[@type='button'])[4]");

    public Buttons(WebDriver driver){
        this.driver = driver;
        act = new Actions(driver);
    }


    public void validateButtonElement(){
        driver.findElement(buttonElement).click();
    }

    public void validateDoubleClick() throws InterruptedException {
        act.doubleClick(driver.findElement(doubleClickBtn)).perform();
        Thread.sleep(2000);
    }

    public void validateRightClick() throws InterruptedException {
        act.contextClick(driver.findElement(rightClickBtn)).perform();
        Thread.sleep(2000);
    }

    public void validateBtnClick() throws InterruptedException {
        driver.findElement(normalClickBtn).click();
        Thread.sleep(2000);
    }

}
