package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;


public class DataProviderRegistration {
    WebDriver driver;
    @BeforeClass
    public void InitSetup(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register");

    }
    @AfterClass
    public void TearDown(){
        driver.quit();

    }
    @DataProvider(name = "Registration Data")
    public Object[][] data(){
        Object[][] data = new Object[2][6];
        //Set 1
        data[0][0]="Shaisob";
        data[0][1]="kd";
        data[0][2]="amarr@gmail.com";
        data[0][3]="015214161";
        data[0][4]="01234";
        data[0][5]="01234";

        //Set 2
        data[1][0]="plabs";
        data[1][1]="kish";
        data[1][2]="sskkp@gmail.com";
        data[1][3]="01766297985";
        data[1][4]="012345";
        data[1][5]="012345";

        return data;

    }
    @Test(dataProvider = "Registration Data")
    public void TC_RegisterAccount_properties(String DP_Fname,String DP_Lname,String DP_mail,String DP_Telephone,String DP_Password,String DP_ConfirmPassword) throws IOException, InterruptedException {


        WebElement Fname =driver.findElement(By.name("firstname"));
        Fname.clear();
        Fname.sendKeys(DP_Fname);
        Thread.sleep(3000);

        WebElement Lname = driver.findElement(By.name("lastname"));
        Lname.clear();
        Lname.sendKeys(DP_Lname);

        WebElement mail = driver.findElement(By.name("email"));
        mail.clear();
        mail.sendKeys(DP_mail);

        WebElement Telephone = driver.findElement(By.name("telephone"));
        Telephone.sendKeys(DP_Telephone);

        WebElement Passaword = driver.findElement(By.name("password"));
        Passaword.sendKeys(DP_Password);

        WebElement ConfirmPassaword = driver.findElement(By.name("confirm"));
        ConfirmPassaword.sendKeys(DP_ConfirmPassword);
        Thread.sleep(3000);

        WebElement Subscription = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
        Subscription.click();

        WebElement Policy= driver.findElement(By.name("agree"));
        Policy.click();

        WebElement Continue= driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        Continue.click();

        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);



    }


}
