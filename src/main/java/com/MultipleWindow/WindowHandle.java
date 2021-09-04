package com.MultipleWindow;

import com.Base.TestBase;
import com.BrowserOptions.Headless;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle extends TestBase {
    public static void main(String[] args) throws InterruptedException {
        firefox_launch();
        //Headless.Firefox_headless();
        OpenUrl("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[2]/a[2]/img")).click(); // child_Window

        Set<String> handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();

        String ParentWindowID = it.next();
        System.out.println("Parent Window Id is : "+ParentWindowID);

        String ChildWindowID = it.next();
        System.out.println("Child Window Id is : "+ChildWindowID);

        //Switching
        driver.switchTo().window(ChildWindowID);
        Thread.sleep(5000);
        System.out.println("Child Window URL :"+driver.getCurrentUrl());
       // driver.close();

        driver.switchTo().window(ParentWindowID);
        System.out.println("Parent Window URL :"+driver.getCurrentUrl());
        driver.navigate().to("https://demo.opencart.com/");
        System.out.println("Another window "+driver.getTitle());
        //driver.close();

        driver.quit();







    }
}
