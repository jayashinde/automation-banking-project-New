package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerElements {
    WebDriver driver;


    public NewCustomerElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomerclick;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;


    @FindBy(xpath = "//input[@name='rad1']")
    public WebElement gender;
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement date;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addresses;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement states;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submit;

    //@NC2
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomer;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement names;
    //@NC3
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomerthree;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement namethree;

    //@NC4
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomerfour;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement namefour;

    //@NC5
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomerf;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement namef;

    //@NC6
    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomeradd;
    @FindBy(name= "addr")
    public WebElement customeraddress;

//NC7
  @FindBy(xpath = "//a[@href='addcustomerpage.php']")
  public WebElement addressclick7;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addresses7;

}
