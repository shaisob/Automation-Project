package com.BrowserSetup;

import com.Base.TestBase;
import com.OpenCart.Login;

public class TitleVarification extends TestBase {
    public static void main(String[] args) {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        Login.OpenLoginPage();
        ValidTitle_varify();
    }


    public static void ValidTitle_varify() {
        String ExpectedTitle = "Account Login";
        String ActualTitle = driver.getTitle();

        if (ExpectedTitle.equals(ActualTitle)) {
            System.out.println("Varified Title,Passed");

        } else
            System.out.println("Not varified,Failed");
    }
}