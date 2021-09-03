package com.Navigation;

import com.Base.TestBase;
import org.openqa.selenium.By;

public class NAvigationTest extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        Navigation_To();
        Navigation_Back();
        Navigation_Refresh();
       Navigation_Forward();

    }

    public static void Navigation_To(){
        driver.navigate().to("https://www.google.com/");
    }

    public static void Navigation_Back(){
        driver.navigate().back();
    }

    public static void Navigation_Forward(){
        driver.navigate().forward();
    }

    public static void Navigation_Refresh() throws InterruptedException {
        driver.findElement(By.name("search")).sendKeys("Bike");
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
}
