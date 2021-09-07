package com.ScreenShot;

import com.Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TakingScreenShotPage extends TestBase {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        ScreenShot("NewImage");
        firefox_close();

    }

    public static void ScreenShot(String name) throws IOException {
        // For Capturing SShot
        File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //Save SS
        // FileUtils.copyFile(SrcFile,new File("./src/main/My_ScreenShot/Image.png"),true);  // For same image file name... Image.png
        FileUtils.copyFile(SrcFile,new File("./src/main/My_ScreenShot/"+name+".png"),true);//For different ss file name

        System.out.println("Image Captured and saved");

    }
}
