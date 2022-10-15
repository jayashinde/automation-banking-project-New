package org.example.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerElements {
    WebDriver driver;
    public EditCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath ="//a[@href='EditCustomer.php']")
    public WebElement editbutton;
    @FindBy(name ="cusid")
    public WebElement customerid;
    @FindBy(name = "AccSubmit")
    public WebElement submit;
    @FindBy(name = "addr")
    public WebElement editaddress;
    @FindBy(name = "sub")
    public WebElement submitedit;






}
