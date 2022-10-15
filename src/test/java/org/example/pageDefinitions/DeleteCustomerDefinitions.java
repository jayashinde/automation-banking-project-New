package org.example.pageDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.DeleteCustomerActions;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerDefinitions {
    private WebDriver driver;
    DeleteCustomerActions deleteCustomerActions;

    public DeleteCustomerDefinitions(CommonSteps commonSteps, DeleteCustomerActions deleteCustomerActions) {
        this.driver =commonSteps.getDriver();
        this.deleteCustomerActions = deleteCustomerActions;
    }


    @When("click on delete customer And enter customer id")
    public void click_on_delete_customer_and_enter_customer_id() throws InterruptedException {
        deleteCustomerActions.delete();
       deleteCustomerActions.userd();

    }
    @Then("customer delete successful")
    public void customer_delete_successful() {
        System.out.println("customer delete successful");
    }
}
