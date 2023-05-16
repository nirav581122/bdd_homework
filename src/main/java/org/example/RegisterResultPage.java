package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    private By _getTextFromElement = By.className("result");
    public void expectedRegisterResultPage(){
        Assert.assertEquals(getTextFromElement(_getTextFromElement), "Your registration completed");

    }
}
