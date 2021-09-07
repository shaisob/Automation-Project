package com.DropDown;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle extends TestBase {
    public static void main(String[] args) {

        firefox_launch();
        OpenUrl("https://the-internet.herokuapp.com/dropdown");
        SelectIndex();
        SelectValue();
        SelectVisibleText();


    }

    public static void SelectIndex(){
        WebElement DrpButtn = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        Select obj = new Select(DrpButtn);
        obj.selectByIndex(1);
        //DrpButtn.click();


    }

    public static void SelectValue(){
        WebElement DrpButtn = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        Select obj = new Select(DrpButtn);
        obj.selectByValue("2");
        //DrpButtn.click();


    }

    public static void SelectVisibleText(){
        WebElement DrpButtn = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        Select obj = new Select(DrpButtn);
        obj.selectByVisibleText("Option 1");
        //DrpButtn.click();


    }



}
