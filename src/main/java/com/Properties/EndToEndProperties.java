package com.Properties;

import com.Base.TestBase;
import com.OpenCart.Login;
import com.OpenCart.Logout;
import com.OpenCart.Registration;

import java.io.IOException;

public class EndToEndProperties extends TestBase {
    public static void main(String[] args) throws IOException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        RandomEmail();
        Registration.OpenRegisterPage();
        Registration.TC_RegisterAccount_properties();
        Logout.LogOut();
        Login.OpenLoginPage();
        LoginWithProperties.TC_valid_dynamic();
        Logout.LogOut();
        firefox_close();
    }
}
