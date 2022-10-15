package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.EditCustomerElements;
import org.example.pageElements.NewCustomerElements;
import org.openqa.selenium.WebDriver;

public class EditCustomerActions {
    private WebDriver driver;
   EditCustomerElements editCustomerElements;

    public EditCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.editCustomerElements = new EditCustomerElements(driver);
    }
    public void editbutton() throws InterruptedException {
        Thread.sleep(5000);
        editCustomerElements.editbutton.click();
    }
    public void customid(){
        editCustomerElements.customerid.sendKeys("29228");
    }
    public void submit(){
        editCustomerElements.submit.click();
    }
    public void editaddress(){
        editCustomerElements.editaddress.sendKeys("maharashtra");
    }
    public void editsubmitbutton(){
        editCustomerElements.submitedit.click();
    }

}
