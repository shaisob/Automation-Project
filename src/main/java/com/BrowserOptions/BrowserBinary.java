package com.BrowserOptions;

import com.Base.TestBase;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class BrowserBinary extends TestBase {
    public static void main(String[] args) {
        setBinary();
    }
    public static void setBinary(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions fxobj = new FirefoxOptions();
        fxobj.setBinary(new FirefoxBinary(new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\\")));
        driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/");
    }
}
