package com.OpenCart;

import com.Base.TestBase;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EndToEnd extends TestBase {

    public static void main(String[] args) throws IOException {
        firefox_launch();
       // String Homepage = "https://demo.opencart.com/";
        OpenUrl("https://demo.opencart.com/");
        Registration.OpenRegisterPage();
        Registration.TC_RegisterAccount();
        Logout.LogOut();
        Login.OpenLoginPage();
        Login.TC_ValidLogin();
        Logout.LogOut();


    }
}
