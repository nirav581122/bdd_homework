package org.example;
import org.openqa.selenium.By;
public class RegisterPage extends Utils {

    private By _firstName = (By.id("FirstName"));
    private By _lastName = (By.id("LastName"));
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = (By.id("ConfirmPassword"));
    private By _clickOnRegisterButton = (By.id("register-button"));
    private By _selectBirthDate =(By.name("DateOfBirthDay"));
    private By _selectBirthMonth =(By.name("DateOfBirthMonth"));
    private By _selectBirthYear =(By.name("DateOfBirthYear"));
    LoadProp loadProp =new LoadProp();
    public void registerDetails() {

        //Enter First name
        typeText(_firstName,loadProp.getProperty("FirstName"));
        //Enter SecondName
        typeText(_lastName,loadProp.getProperty("lastname"));
        //Select day from drop down
        selectByDate(_selectBirthDate,loadProp.getProperty("selectbydate"));
        //Select moth from drop down
        selectByMonth(_selectBirthMonth, loadProp.getProperty("selectbymonth"));
        //Select year from drop down
        selectByYear(_selectBirthYear, Integer.parseInt(loadProp.getProperty("selectbyyear")));
        //Enter Email id
        typeText(_email, (loadProp.getProperty("emailfirstpart")) + timeStamp()+ (loadProp.getProperty("emailsecondpart")));
        //enter Password
        typeText(_password, loadProp.getProperty("password"));
        //Confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmpassword"));
        //Click on Register submit button
        clickOnElement(_clickOnRegisterButton);

    }
    public void registerDetailsWithoutTimestamp() {
        //Enter First name
        typeText(_firstName, loadProp.getProperty("FirstName"));
        //Enter SecondName
        typeText(_lastName, loadProp.getProperty("lastname"));
        //Enter Email id
        typeText(_email, loadProp.getProperty("emailwithouttimestamp"));
        //enter Password
        typeText(_password, loadProp.getProperty("password"));
        //Confirm password
        typeText(_confirmPassword, loadProp.getProperty("confirmpassword"));
        //Click on Register submit button
        clickOnElement(_clickOnRegisterButton);
    }
}
