package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

public class Utils extends BasePage {

    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
      return  driver.findElement(by).getText();
    }
    public static long timeStamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }
    public static void selectByDate(By by ,String text){
        Select drpDate= new Select(driver.findElement(by));
        drpDate.selectByVisibleText(text);
    }
    public static void selectByMonth(By by, String text){
        Select drpMonth = new Select(driver.findElement(by));
        drpMonth.selectByValue(text);
    }
    public static void selectByYear(By by, int index) {
        Select drpYear = new Select(driver.findElement(by));
        drpYear.selectByIndex(index);
    }
    public static void waitForClickable(By by, int timeInSec) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
