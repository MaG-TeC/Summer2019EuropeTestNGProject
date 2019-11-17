package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertoinsDemo {


    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals(1, 1);

        System.out.println("Second Assertion");
        Assert.assertEquals("title", "titlE");

        System.out.println("after second assertion");
    }

    @Test
    public void test2(){
        //verify that title starts with C
        String actualTitle = "Cybertek";
        String expecTitleBeginning = "B";

        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expecTitleBeginning), "Verify title starts with C");

        //TASK
        //verify that email includes @ sign
        Assert.assertTrue("retro@google.com".contains("@"), "Verify @ in email");


    }

    @Test
    public void test3(){

        Assert.assertNotEquals("one", "two");

    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);



    }

}
