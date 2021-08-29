package com.BrowserSetup;

import com.Base.TestBase;

public class OpenWebsite extends TestBase
{
    public static void main(String[] args)
    {
        firefox_launch();
        OpenUrl("");
        firefox_close();


    }

//    public static void OpenUrl()                                             *This is static method
//    {
//        driver.get("https://google.com");
//    }
}
