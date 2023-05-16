package org.example;

import org.openqa.selenium.By;

public class LogIn extends Utils{
    private By _logInTag = By.className("ico-login");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _logInButton = By.xpath("//button[contains(text(),'Log in')]");
LoadProp loadProp =new LoadProp();
    public void clickOnLogInButton() {
        //click on log In button
        clickOnElement(_logInTag);
        //Enter Email id
        typeText(_email,loadProp.getProperty("emailwithouttimestamp"));
        //Enter Password
        typeText(_password, loadProp.getProperty("password"));
        //click on Log in Button
        clickOnElement(_logInButton);
    }

}
