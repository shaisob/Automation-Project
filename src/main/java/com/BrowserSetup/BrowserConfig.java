package com.BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConfig
{
    public static WebDriver driver;

    public static void main(String[] args)
    {
        firefox_launch();
        firefox_close();

    }
    public static void firefox_launch()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();

    }
    public static void firefox_close()

    {
        driver.close();
    }
}
