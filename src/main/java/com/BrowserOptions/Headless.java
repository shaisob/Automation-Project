package com.BrowserOptions;

import com.Base.TestBase;
import com.OpenCart.Login;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless extends TestBase {
    public static void main(String[] args) {
        Firefox_headless();
    }
    public static void Firefox_headless(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        FirefoxOptions fxobj = new FirefoxOptions();
        fxobj.setHeadless(true);
        driver = new FirefoxDriver(fxobj);
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        Login.TC_ValidLogin();
        System.out.println("Login Completed");

    }
}
