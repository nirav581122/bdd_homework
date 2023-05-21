package org.example;


import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverManger extends Utils {
    public boolean SAUCE_LAB = false;
    LoadProp loadProp = new LoadProp();
    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
//    String browserName = System.getProperty("browser");
    MutableCapabilities sauceOptions = new MutableCapabilities();
    String browserName = "Chrome";


    public void openBrowser() {
        if (SAUCE_LAB) {
            System.out.println("It is working with sauce Lab=" + browserName);
            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("Firefox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setCapability("platformName", "Windows 10");
                browserOptions.setCapability("browserVersion", "latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        }
        else
        {
            if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("You have entered wrong browser or implemented wrong" + browserName);
        }

        }
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }



    public void closeBrowser() {
        driver.close();
    }
}

