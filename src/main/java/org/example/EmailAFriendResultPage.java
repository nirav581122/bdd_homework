package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendResultPage extends Utils{
    private By _actualMassageOnEmailAFriend = By.className("result");
    LoadProp loadProp =new LoadProp();
    public void expectedEmailAFriendWithRegistration() {
        Assert.assertEquals(getTextFromElement(_actualMassageOnEmailAFriend), loadProp.getProperty("expectedemailfriendmassge"));
          }
}
