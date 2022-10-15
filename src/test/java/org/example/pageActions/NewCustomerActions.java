package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.NewCustomerElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NewCustomerActions {
    private WebDriver driver;
    NewCustomerElements newCustomerElements;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newCustomerElements = new NewCustomerElements(driver);
    }
    public void newcutomer(){
        newCustomerElements.newcustomerclick.click();
    }
   public void name(String name) throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.name.sendKeys(name);
   }
    public void gender(){
        newCustomerElements.gender.click();
    }

    public void date(String dateofbday){
        newCustomerElements.date.sendKeys(dateofbday);
    }
    public void address(String address){
        newCustomerElements.addresses.sendKeys(address);
    }
    public void city(String custcity){
        newCustomerElements.city.sendKeys(custcity);
    }
    public void sate(String state){
        newCustomerElements.states.sendKeys(state);
    }
    public void pin(String pincode){
        newCustomerElements.pin.sendKeys(pincode);
    }

    public void mobileno(String mobileno){
        newCustomerElements.telephone.sendKeys(mobileno);
    }
    public void mail(String email){
        newCustomerElements.email.sendKeys(email);
    }
    public void submit(){
        newCustomerElements.submit.click();
    }

//NC02
      public void newcutomertwo(){
    newCustomerElements.newcustomer.click();

    }
    public void nametwo() throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.names.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();

        String messageE="Customer name must not be blank";
        String  messageA=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(messageE,messageA);

    }
    //NC03
    public void newcutomerthree(){
        newCustomerElements.newcustomerthree.click();

    }
    public void namethree() throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.namethree.sendKeys("123556");


        String messageE="Numbers are not allowed";
        String  messageA=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(messageE,messageA);

    }
    //NC04
    public void newcutomerfour(){
        newCustomerElements.newcustomerfour.click();

    }
    public void namefour() throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.namefour.sendKeys("@#$");


        String messageE="Special characters are not allowed";
        String  messageA=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(messageE,messageA);

    }
    //NC05
    public void newcutomerf(){
        newCustomerElements.newcustomerf.click();

    }
    public void namef() throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.namef.sendKeys(" jaya");


        String messageE="First character can not have space";
        String  messageA=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(messageE,messageA);

    }
    //NC6

    public void newcutomeraddress(){

        newCustomerElements.newcustomeradd.click();

    }
    public void custaddress() throws InterruptedException {
        Thread.sleep(5000);
        newCustomerElements.customeraddress.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();

       String messageE="Address Field must not be blank";
        String  messageA=driver.findElement(By.id("message3")).getText();
        Assert.assertEquals(messageE,messageA);

    }
    public void click(){
        newCustomerElements.addressclick7.click();
    }
  public void addressclick7(String address) throws InterruptedException {

        Thread.sleep(5000);
        newCustomerElements.addresses7.sendKeys(address);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).perform();
  }
    public void addressadd7(String expected) throws InterruptedException {
       String actual= driver.findElement(By.id("message3")).getText();
       Assert.assertEquals(expected,actual);
    }


}
