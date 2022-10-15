package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerElements {
    WebDriver driver;

    @FindBy(xpath = "//a[@href=\"deleteAccountInput.php\"]")
  public  WebElement deletebutton;
    @FindBy(name= "cusid")
  public WebElement userId;




    public DeleteCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
