package com.OpenCart;

import com.Base.TestBase;

public class EndToEnd extends TestBase {

    public static void main(String[] args) {
        firefox_launch();
        String Homepage = "https://demo.opencart.com/";
        OpenUrl(Homepage);
        Registration.OpenRegisterPage();
        Registration.TC_RegisterAccount();
        Logout.LogOut();
        Login.OpenLoginPage();
        Login.TC_ValidLogin();
        Logout.LogOut();


    }
}
