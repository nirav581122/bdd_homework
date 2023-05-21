package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class StepDefs extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LogIn logIn = new LogIn();
    AppleMacBookPro13inchProductDetailPage appleMacBookPro13inchProductDetailPage = new AppleMacBookPro13inchProductDetailPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        //click on register Button
        homePage.clickOnRegisterButton();
    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        //fill all the register details
        registerPage.registerDetails();
    }

    @Then("I should be able to register Sucessfully")
    public void i_should_be_able_to_register_sucessfully() {
        //assert register user sucessfully
        registerResultPage.expectedRegisterResultPage();

    }
    @When("I enter required registration details without timestamp")
    public void i_enter_required_registration_details_without_timestamp() {
        //enter registration details without time stamp
        registerPage.registerDetailsWithoutTimestamp();

    }
    @When("Click on log in button and fill the details")
    public void click_on_log_in_button_and_fill_the_details() {
        //click on log in button and fill the details
        logIn.clickOnLogInButton();
    }
    @When("Click on email a friend button")
    public void click_on_email_a_friend_button() {
        //fill the email a friend details and submit
        emailAFriendPage.productEmailAFriendPageWithoutTimeStamp();
    }

    @Then("I should Be able to send Email A Friend")
    public void i_should_be_able_to_send_email_a_friend() {
        //assert that email has been sent sucessfully
        emailAFriendResultPage.expectedEmailAFriendWithRegistration();
    }

    @And("Click on Apple MacBook Pro inch")
    public void clickOnAppleMacBookProInch() {
        //click on product and email a friend button
        homePage.clickOnProduct();
        appleMacBookPro13inchProductDetailPage.productDetailPage();

    }

    @Given("I am on Nopcommerece homepage")
    public void iAmOnNopcommereceHomepage() {
        driver.get("https://demo.nopcommerce.com/");

    }

    @When("I click on {string}button")
    public void iClickOnButton(String button_name ) {
        clickOnElement(By.xpath("//a[text()= '"+button_name+" ']"));
    }

    @Then("I should be verify that I am on related {string}")
    public void iShouldBeVerifyThatIAmOnRelated(String page_url) {
        Assert.assertEquals(driver.getCurrentUrl(),page_url);
       // Assert.assertEquals(getTextFromElement("h1"),);

    }

    @And("I should verify that my {string}")
    public void iShouldVerifyThatMy(String page_title ) {
        Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }
}
