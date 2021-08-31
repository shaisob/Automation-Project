package com.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) throws IOException {

        FileOutputStream fis = new FileOutputStream("./src/main/resources/Data.Properties");
        Properties prop = new Properties();

        prop.setProperty("Name","Shaisob Kishor");
        prop.setProperty("Email","shaisobkishor@gmail.com");

        prop.store(fis,null);
    }
}
