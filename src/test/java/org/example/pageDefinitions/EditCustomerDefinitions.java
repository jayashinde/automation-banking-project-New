package org.example.pageDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.EditCustomerActions;
import org.example.pageActions.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class EditCustomerDefinitions {

  private   WebDriver driver;
   EditCustomerActions editCustomerActions;

    public EditCustomerDefinitions(CommonSteps commonSteps, EditCustomerActions editCustomerActions) {
        this.driver =commonSteps.getDriver();
        this.editCustomerActions = editCustomerActions;
    }
    @When("click on edit customer And enter customer id")
    public void click_on_edit_customer_and_enter_customer_id() throws InterruptedException {
        editCustomerActions.editbutton();
        editCustomerActions.customid();
    }

    @When("click on submit button")
    public void click_on_submit_button() {
   editCustomerActions.submit();
   editCustomerActions.editaddress();
   editCustomerActions.editsubmitbutton();
   driver.switchTo().alert().accept();
    }

    @Then("customer edit successful")
    public void customer_edit_successful() {
        System.out.println("customer edit successful");
    }

}
