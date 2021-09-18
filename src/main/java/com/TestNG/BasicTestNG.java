package com.TestNG;

import org.testng.annotations.Test;

public class BasicTestNG {
    @Test
    public  void TestMethod1(){
        System.out.println("No.1");
    }

    @Test(priority = 2)
    public void TestMethod4(){
        System.out.println("2nd Priority");
    }

    @Test(enabled = false)
    public  void TestMethod2(){
        System.out.println("No.2");
    }

    @Test(priority = 1)
    public void TestMethod3(){
        System.out.println("Most Priority");
    }



}
