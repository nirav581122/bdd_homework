package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManger extends Utils {
   LoadProp loadProp =new LoadProp();
   String browserName =loadProp.getProperty("browser");
    public void openBrowser(){

        if (browserName.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
       else if (browserName.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("Firefox")){
           driver = new FirefoxDriver();
        }
        else {
            System.out.println("You have entered wrong browser or implemented wrong"+browserName);
        }
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        driver.close();
    }
}
