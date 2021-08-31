package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
        TC_RegisterAccount();

    }

    public static void OpenRegisterPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Reg= driver.findElement(By.linkText("Register"));
        Reg.click();
    }

    public static String RandomName() throws IOException {
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

    public static void TC_RegisterAccount() throws IOException {
        String Email = RandomName().concat("@gmail.com");
        String FirstName = RandomName();

        WebElement Fname = driver.findElement(By.name("firstname"));
        Fname.sendKeys(FirstName);

        WebElement Lname = driver.findElement(By.name("lastname"));
        Lname.sendKeys("Kishor Dhar");

        WebElement mail = driver.findElement(By.name("email"));
        mail.sendKeys(Email);

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
