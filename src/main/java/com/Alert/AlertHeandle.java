package com.Alert;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHeandle extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        OpenUrl("https://the-internet.herokuapp.com/javascript_alerts");
       Normal_Alert();
       Confirm_Alert();
       Prompt_Alert();
       firefox_close();

    }

    public static void Normal_Alert() throws InterruptedException {
        WebElement alertBtn = driver.findElement(By.cssSelector(".example > ul:nth-child(3) > li:nth-child(1) > button:nth-child(1)"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept(); // {accept = click on Ok}

    }

    public static void Confirm_Alert() throws InterruptedException {
        WebElement alertBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss(); // [dismiss = click on cancel]

    }

    public static void Prompt_Alert() throws InterruptedException {
        WebElement alertBtn = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button"));
        alertBtn.click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Test automation");  //For writing something on prompt.
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

    }


}
