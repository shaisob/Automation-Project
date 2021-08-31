package com.Properties;

import com.Base.TestBase;
import com.OpenCart.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoginWithProperties extends TestBase {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/resources/Data.Properties");
        Properties prop = new Properties();
        prop.load(fis);

        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        Login.OpenLoginPage();

            WebElement Email = driver.findElement(By.name("email"));
            Email.sendKeys(prop.getProperty("Email"));

            WebElement Passaword = driver.findElement(By.name("password"));
            Passaword.sendKeys(prop.getProperty("Password"));

            WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
            LoginClick.click();


    }
}
