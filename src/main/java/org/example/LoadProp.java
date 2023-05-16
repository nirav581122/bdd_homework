package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static Properties prop = new Properties();
    static FileInputStream input;

    // static fileInputStream input;
    static String propertiesFileLocation="src/test/java/test/config/TestData.properties";

    public String getProperty(String key){
        try {
            input = new FileInputStream(propertiesFileLocation);
            prop.load(input);
            input.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

    public void verifyMyLoadPro(){
        System.out.println(getProperty("url"));
    }
}
