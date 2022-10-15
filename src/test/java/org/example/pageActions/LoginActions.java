package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.LoginElements;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginActions {
    private WebDriver driver;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }
    public void userid(String user) throws InterruptedException {
        loginElements.user.sendKeys(user);
        Thread.sleep(1000);
    }
    public void pass(String p){
        loginElements.passwoord.sendKeys(p);
    }
    public void click(){
        loginElements.login.click();
    }
    public void userid(){
        loginElements.userid.sendKeys("mngr446207");
    }
    public void passord(){
        loginElements.pass.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();

        String userexpected="Password must not be blank";
        String useractual=driver.findElement(By.id("message18")).getText();
        Assert.assertEquals(userexpected,useractual);

    }
    public void submit(){
        loginElements.log.click();
    }

    public void userId(){
        loginElements.userId.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
    }
    public void passords(){
        loginElements.password.sendKeys("UpujUbe");


        String userexp="User-ID must not be blank";
        String useractual=driver.findElement(By.id("message23")).getText();
        Assert.assertEquals(userexp,useractual);

    }

    public void submited(){
        loginElements.logbutton.click();
    }

//both blank

    public void useId(){
        loginElements.Id.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();

        String userexp="User-ID must not be blank";
        String useractual=driver.findElement(By.id("message23")).getText();
        Assert.assertEquals(userexp,useractual);

    }
    public void passor(){
        loginElements.pas.sendKeys("");
        Actions action=new Actions(driver);
        action.sendKeys(Keys.TAB).perform();


        String userexp="Password must not be blank";
        String useractual=driver.findElement(By.id("message18")).getText();
        Assert.assertEquals(userexp,useractual);

    }

    public void sub(){
        loginElements.logbutton.click();
    }








}
