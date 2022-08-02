package com.ProjectKBDD.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTable {

    private WebDriver driver;
    private By webTableElement = By.xpath("//span[text()='Web Tables']");
    private By addUserBtn = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    private By dept = By.id("department");
    private By submitBtn = By.id("submit");
    private By searchInput = By.id("searchBox");
    private By editUser = By.id("edit-record-1");
    private By deleteUser = By.id("delete-record-1");

    public WebTable(WebDriver driver){
        this.driver = driver;
    }

    public void validateWebTableElement(){
        driver.findElement(webTableElement).click();
    }

    public void validateAddUserBtn(){
        driver.findElement(addUserBtn).click();
    }

    public void addUser(String fname, String lname, String emailid, String Age, String sal, String depart) throws InterruptedException {
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(email).sendKeys(emailid);
        driver.findElement(age).sendKeys(Age);
        driver.findElement(salary).sendKeys(sal);
        driver.findElement(dept).sendKeys(depart);
        driver.findElement(submitBtn).click();
        Thread.sleep(3000);
    }

    public void retrieveUser(String searchString) throws InterruptedException {
        driver.findElement(searchInput).sendKeys(searchString);
        Thread.sleep(3000);
    }

    public void clickEditBtn(){
        driver.findElement(editUser).click();
    }

    public void updateUser(String fname) throws InterruptedException {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(submitBtn).click();
        Thread.sleep(4000);
    }

    public void deleteUser() throws InterruptedException {
        driver.findElement(deleteUser).click();
        Thread.sleep(3000);
    }
}
