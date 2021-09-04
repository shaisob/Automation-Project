package com.BrowserOptions;

import com.Base.TestBase;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class InsecureWebpage extends TestBase {
    public static void main(String[] args) {
        InsecureCerts();
    }

    public static void InsecureCerts(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions fxobj = new FirefoxOptions();
        fxobj.setAcceptInsecureCerts(true);
        driver = new FirefoxDriver();
        driver.get("https://cacert.org/");
        System.out.println(driver.getTitle());

    }
}
