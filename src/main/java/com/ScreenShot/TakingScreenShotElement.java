package com.ScreenShot;

import com.Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

public class TakingScreenShotElement extends TestBase {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");

        ScreenShot("Element");

    }

    public static void ScreenShot(String name) throws IOException {

        WebElement btn = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button"));
        File SrcFile = ((TakesScreenshot)btn).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile,new File("./src/main/My_ScreenShot/"+name+".png"),true);
        System.out.println("Image Captured and saved");

    }

}
