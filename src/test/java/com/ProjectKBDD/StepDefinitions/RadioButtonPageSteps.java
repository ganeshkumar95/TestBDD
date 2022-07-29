package com.ProjectKBDD.StepDefinitions;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.RadioButton;
import io.cucumber.java.en.Then;

public class RadioButtonPageSteps {

    private RadioButton radioButton = new RadioButton(DriverFactory.getDriver());
    @Then("click on RadioButton element")
    public void click_on_RadioButton_element() {
        radioButton.validateRadioButtonElement();
    }

    @Then("click on Yes Radio Button")
    public void click_on_yes_radio_button() {
        radioButton.validateYesRadioButtonElement();
    }

    @Then("click on Impressive Radio Button")
    public void click_on_impressive_radio_button() throws InterruptedException {
        radioButton.validateImpressiveRadioButtonElement();
    }

}
