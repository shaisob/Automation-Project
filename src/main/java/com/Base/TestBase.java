package com.Base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.net.UrlChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Random;

public class TestBase
{
    public static WebDriver driver;

    public static void firefox_launch()
    {
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();

    }
    public static void firefox_close()
    {
        driver.close();
    }

    public static void OpenUrl(String URL)

    {
        driver.get(URL);
    }

    public static String RandomEmail() throws FileNotFoundException, IOException {

        FileOutputStream fis = new FileOutputStream("./src/main/resources/Data.Properties");
        Properties prop = new Properties();

        String SALTCHAR = "abcdeAbcde123";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while(salt.length()<5){
            int index = (int)(rnd.nextFloat() * SALTCHAR.length());
            salt.append(SALTCHAR.charAt(index));
        }

        String saltstr = salt.toString().concat("@gmail.com");
        prop.setProperty("RandomEmail",saltstr);
        prop.store(fis,null);

        return saltstr;
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
