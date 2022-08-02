package com.ProjectKBDD.StepDefinitions;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.WebTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.Map;

public class WebTablePageSteps {

    WebTable webTable = new WebTable(DriverFactory.getDriver());
    @Then("click on WebTable element")
    public void click_on_web_table_element() {
        webTable.validateWebTableElement();
    }

    @Then("click on Add user")
    public void click_on_add_user() {
        webTable.validateAddUserBtn();
    }

    @Then("user enter data into columns")
    public void user_enter_data_into_columns(DataTable userData) throws InterruptedException {
        for(Map<Object, Object> userList : userData.asMaps(String.class, String.class)){

            String fullName = (String) userList.get("FirstName");
            String lastName = (String) userList.get("LastName");
            String email = (String) userList.get("Email");
            String age = (String) userList.get("Age");
            String salary = (String) userList.get("Salary");
            String dept = (String) userList.get("Department");
            webTable.addUser(fullName, lastName, email, age, salary, dept);
        }
    }

    @Then("user enters a valid input {string} in the searchbox")
    public void user_enters_a_valid_input_in_the_searchbox(String searchValue) throws InterruptedException {
        webTable.retrieveUser(searchValue);
    }

    @Then("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        webTable.clickEditBtn();
    }

    @Then("user updates firstname as {string}")
    public void user_updates_firstname_as(String fname) throws InterruptedException {
        webTable.updateUser(fname);
    }

    @Then("user clicks on delete button")
    public void user_clicks_on_delete_button() throws InterruptedException {
        webTable.deleteUser();
        Thread.sleep(3000);
    }
}
