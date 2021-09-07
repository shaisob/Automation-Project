package com.Frame;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTesting extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        OpenUrl("https://the-internet.herokuapp.com/iframe");
        SingleFrame();


    }

    public static void SingleFrame() throws InterruptedException {
        driver.switchTo().frame("mce_0_ifr");
        WebElement ifreamBody = driver.findElement(By.id("tinymce"));
        ifreamBody.clear();
        ifreamBody.sendKeys("Test Automation");
        Thread.sleep(3000);
    }
}
