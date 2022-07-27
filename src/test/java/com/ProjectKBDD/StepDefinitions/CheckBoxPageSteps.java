package com.ProjectKBDD.StepDefinitions;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.CheckBox;

import io.cucumber.java.en.Then;

public class CheckBoxPageSteps {

	private CheckBox checkBox = new CheckBox(DriverFactory.getDriver());
	
	@Then("click on CheckBox element")
	public void click_on_check_box_element() {
	    checkBox.validateCheckBoxElement();
	}

	@Then("click on different checkbox heirarchy")
	public void click_on_different_checkbox_heirarchy() throws InterruptedException {
	    checkBox.validateCheckBoxop();
	}
}
