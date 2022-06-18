package com.cydeo.step_definitions;

import com.cydeo.pages.CalculatorPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Calculator_StepDefinitions {

    @Given("User is on calculator page")
    public void user_is_on_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("calculator.url"));
    }

    @When("User clicks {string} on calculator")
    public void user_clicks_on_calculator(String button) {
        new CalculatorPage().button(button).click();
    }

    @Then("Result {string} should be displayed")
    public void result_should_be_displayed(String expectedResult) {
        String actualResult = new CalculatorPage().output.getText().trim();
        Assert.assertEquals("Wrong Calculation",expectedResult,actualResult);
    }

    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
        System.out.println("User is on the percentage page");
        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
    }
    @Then("User should see following calculation results")
    public void user_should_see_following_calculation_results(Map<Integer,Integer> valuesMap) {
        System.out.println("valuesMap = " + valuesMap);
    }


}
