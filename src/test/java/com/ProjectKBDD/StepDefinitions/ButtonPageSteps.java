package com.ProjectKBDD.StepDefinitions;

import com.ProjectKBDD.factory.DriverFactory;
import com.ProjectKBDD.pages.Buttons;
import io.cucumber.java.en.Then;

public class ButtonPageSteps {

    Buttons btn = new Buttons(DriverFactory.getDriver());

    @Then("click on Button element")
    public void click_on_button_element() {
        btn.validateButtonElement();
    }

    @Then("double click on Double Click Me Button")
    public void double_click_on_double_click_me_button() throws InterruptedException {
        btn.validateDoubleClick();
    }

    @Then("right click on Right Click Me Button")
    public void right_click_on_right_click_me_button() throws InterruptedException {
        btn.validateRightClick();
    }

    @Then("click on Click me button")
    public void click_on_click_me_button() throws InterruptedException {
        btn.validateBtnClick();
    }

}
