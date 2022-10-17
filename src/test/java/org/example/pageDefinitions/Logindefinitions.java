package org.example.pageDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Logindefinitions {
    WebDriver driver;
    LoginActions loginActions;

    public Logindefinitions(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;
    }


    @When("enter {string} And {string} And click on login")
    public void enterAndAndClickOnLogin(String userid, String userpass) throws InterruptedException {
        loginActions.userid(userid);
        loginActions.pass(userpass);
        loginActions.click();


    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        System.out.println("login should be successful");
    }
//Sc02
    @When("enter userid And do not enter password And click on login")
    public void enterUseridAndDoNotEnterPasswordAndClickOnLogin() {
        loginActions.userid();
        loginActions.passord();
        loginActions.submit();
    }

    @Then("error message should be displayed")
    public void erroMessageShouldBeDisplayed() {
        System.out.println("erro message should be displayed");
    }
//sc03
    @When("do not userid And enter password And click on login")
    public void enterDoNotUseridAndEnterPasswordAndClickOnLogin() {
        loginActions.userId();
        loginActions.passords();
        loginActions.submited();


    }

    @Then("error message should be display")
    public void erroMessage() {
        System.out.println("erro message should be displayed");
    }
//sc04
    @When("do not userid And do not enter password And click on login")
    public void doNotUseridAndDoNotEnterPasswordAndClickOnLogin() {
        loginActions.useId();
        loginActions.passor();
        loginActions.sub();

    }

    @Then("error message should be show")
    public void errorMessageShouldBeShow() {
        System.out.println("error message should be show");
    }

//    @When("I enter {string} in username field")
//    public void i_enter_in_username_field(String string) {
//
//
//    }
//
//    @Then("I should get {string}")
//    public void i_should_get(String string) {
//
//
//    }

}