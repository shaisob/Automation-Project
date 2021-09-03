package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Registration extends TestBase {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenRegisterPage();
        RandomEmail();
        TC_RegisterAccount_properties();

    }

    public static void OpenRegisterPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Reg= driver.findElement(By.linkText("Register"));
        Reg.click();
    }

    public static void TC_RegisterAccount_properties() throws IOException {

        FileInputStream fis = new FileInputStream("./src/main/resources/Data.Properties");
        Properties prop = new Properties();
        prop.load(fis);

        WebElement Fname = driver.findElement(By.name("firstname"));
        Fname.sendKeys("Shaisob");

        WebElement Lname = driver.findElement(By.name("lastname"));
        Lname.sendKeys("Kishor Dhar");

        WebElement mail = driver.findElement(By.name("email"));
        mail.sendKeys(prop.getProperty("RandomEmail"));

        WebElement Telephone = driver.findElement(By.name("telephone"));
        Telephone.sendKeys("01521416161");

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.sendKeys("Asd@112");

        WebElement ConfirmPassaword = driver.findElement(By.name("confirm"));
        ConfirmPassaword.sendKeys("Asd@112");

        WebElement Subscription = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
        Subscription.click();

        WebElement Policy= driver.findElement(By.name("agree"));
        Policy.click();

        WebElement Continue= driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();



    }

}
