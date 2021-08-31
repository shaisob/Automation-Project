package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Random;

public class TestBase
{
    public static WebDriver driver;

    public static void firefox_launch()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();

    }
    public static void firefox_close()
    {
        driver.close();
    }

    public static void OpenUrl(String URL)

    {
        driver.get(URL);
    }

    public static String RandomName() throws FileNotFoundException, IOException {

        FileOutputStream fis = new FileOutputStream("./src/main/resources/Data.Properties");
        Properties prop = new Properties();

        String SALTCHAR = "abcdeAbcde123";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while(salt.length()<5){
            int index = (int)(rnd.nextFloat() * SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }

        String saltstr = salt.toString();
        prop.setProperty("RandomName",saltstr);
        prop.store(fis,null);

        return saltstr;
    }
}
