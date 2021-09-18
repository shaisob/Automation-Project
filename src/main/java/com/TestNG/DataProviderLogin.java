package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {
    WebDriver driver;
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
    @DataProvider(name = "Login Data")
    public Object[][] data(){
        Object[][] data = new Object[3][2];
        //Set 1
        data[0][0]="mail@gmail.com";
        data[0][1]="1236";

        //Set 2
        data[1][0]="shaisob@gmail.com";
        data[1][1]="121";

        data[2][0]="shaisobkishor@gmail.com";
        data[2][1]="Asd@112";


        return data;

    }


    @Test(dataProvider = "Login Data")
    public void TC_ValidLogin(String DP_Email,String DP_Pass) throws InterruptedException {
        WebElement Email = driver.findElement(By.name("email"));
        Email.clear();
        Email.sendKeys(DP_Email);

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.clear();
        Passaword.sendKeys(DP_Pass);


        WebElement LoginClick= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
        LoginClick.click();


        System.out.println("Invalid Data");

    }
}
