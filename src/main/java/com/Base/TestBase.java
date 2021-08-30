package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;

import java.net.URL;

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
}
