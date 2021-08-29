package com.Locators;

import com.Base.TestBase;
import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class ElementsLocators extends TestBase
{
    public static void main(String[] args)
    {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        OpenRegisterPage();
        TC_RegisterAccount();
        OpenLoginPage();
        TC_Login();

    }

    public static void OpenLoginPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Login= driver.findElement(By.linkText("Login"));
        Login.click();
    }

    public static void TC_Login()
    {
        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("shaisobkishor@gmail.com");

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.sendKeys("Asd@112");

        WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginClick.click();
    }

    public static void OpenRegisterPage()
    {
        WebElement MyAccount = driver.findElement(By.linkText("My Account"));
        MyAccount.click();

        WebElement Reg= driver.findElement(By.linkText("Register"));
        Reg.click();
    }

    public static void TC_RegisterAccount()
    {
        WebElement Fname = driver.findElement(By.name("firstname"));
        Fname.sendKeys("Shaisob");

        WebElement Lname = driver.findElement(By.name("lastname"));
        Lname.sendKeys("Kishor Dhar");

        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("shaisobkishor@gmail.com");

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
