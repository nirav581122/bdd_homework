package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerButton=By.className("ico-register");
    private By _clickOnProduct = By.xpath("//a[contains(text(),'Apple MacBook Pro 13-inch')]");
    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);
    }

    public void clickOnProduct() {
        //  click on Apple MacBook Pro 13-inc
      clickOnElement(_clickOnProduct);

    }

}
