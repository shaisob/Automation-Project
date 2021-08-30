package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends TestBase {

    public static void main(String[] args) {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        Login.OpenLoginPage();
        Login.TC_ValidLogin();
        LogOut();
    }
    public static void LogOut(){
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
        WebElement CnButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a"));
        CnButton.click();

    }
}
