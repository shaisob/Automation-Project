package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LoginWithTestNG {
    WebDriver driver;

//    @BeforeMethod
//    public void InitSetup(){
//        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.get("https://demo.opencart.com/index.php?route=account/login");
//
//    }
//    @AfterMethod
//    public void TearDown(){
//        driver.quit();
// 
//    }

    @BeforeClass
        public void InitSetup(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");

    }
    @AfterClass
    public void TearDown(){
        //driver.quit();

    }

    @Test(priority = 1,description = "Email and password are valid")
    public void TC_ValidLogin_001() throws InterruptedException {
        WebElement Email = driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("shaisobkishor@gmail.com");

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.clear();
        Passaword.sendKeys("Asd@112");


        WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginClick.click();

        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        System.out.println("1st done");

    }
    @Test(priority = 2,description ="Email Invalid and password vaid ")
    public void TC_InvalidLogin_002() throws InterruptedException {
        WebElement Email = driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys("shaisobkishor@gmail");

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.clear();
        Passaword.sendKeys("Asd@112");


        WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginClick.click();
        Thread.sleep(3000);
        System.out.println("2nd Done");

    }


}
