package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {
    private By _friendEmail = By.className("friend-email");
    private By _yourEmail = By.className("your-email");
    private By _personalMassage = By.id("PersonalMessage");
    private By _sendButton = By.name("send-email");
    LoadProp loadProp = new LoadProp();
    public void productEmailAFriendPageWithoutTimeStamp() {
        //enter friend email
        typeText(_friendEmail, loadProp.getProperty("friendemail"));
        //enter your personal massage
        typeText(_personalMassage, loadProp.getProperty("personalmassage"));
        //click on send button
        clickOnElement(_sendButton);

    }
}
