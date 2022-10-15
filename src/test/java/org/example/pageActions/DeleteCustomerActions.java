package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.DeleteCustomerElements;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerActions {
    private WebDriver driver;
    DeleteCustomerElements deleteCustomerElements;

    public DeleteCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.deleteCustomerElements = new DeleteCustomerElements(driver);
    }
   public void delete(){
        deleteCustomerElements.deletebutton.click();
   }
    public void userd() throws InterruptedException {
        Thread.sleep(5000);
        deleteCustomerElements.userId.sendKeys("29228");
    }
}
