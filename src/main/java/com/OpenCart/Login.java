package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends TestBase {
    public static void main(String[] args) {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenLoginPage();
        TC_ValidLogin();
       // firefox_close();
    }
    public static void OpenLoginPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }

    public static void TC_ValidLogin()
    {
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("shaisobkishor@gmail.com");

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.sendKeys("Asd@112");

        WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginClick.click();
    }

}
