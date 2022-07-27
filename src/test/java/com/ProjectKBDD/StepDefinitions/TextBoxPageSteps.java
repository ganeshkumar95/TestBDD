package com.ProjectKBDD.StepDefinitions;

import java.util.Map;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.TextBox;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TextBoxPageSteps {
	
	private TextBox textBox = new TextBox(DriverFactory.getDriver());
	@Given("user is on Demo QA Elements page")
	public void user_is_on_demo_qa_elements_page() {
		DriverFactory.getDriver().get("https://demoqa.com/elements");
	}
	
	@Then("click on TextBox element")
	public void click_on_text_box_element() {
		textBox.validateTextBoxElement();
	}
	
	@Then("user enters data into columns")
	public void user_enters_data_into_columns(DataTable userData) throws InterruptedException {
		for(Map<Object, Object> userList : userData.asMaps(String.class, String.class)){
			
			String fname = (String) userList.get("Fullname");
			String emailId = (String) userList.get("Email");
			String currAddr = (String) userList.get("CurrentAddress");
			String permAddr = (String) userList.get("PermanentAddress");
			textBox.submitData(fname, emailId, currAddr, permAddr);
	    }
	}

}
