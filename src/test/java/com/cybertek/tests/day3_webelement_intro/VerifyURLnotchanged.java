package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {
    public static void main(String[] args) {
        /**
         * Verify URL not changed
         * open browser
         * go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
         * click on Retrieve password
         * verify that url did not change
          */



            //open chrome
            WebDriver driver = WebDriverFactory.getDriver("chrome");

           driver.get( "http://practice.cybertekschool.com/forgot_password");

           //save url to string variable
            String expectedUrl = driver.getCurrentUrl();

            //click on Retrieve password
          WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

          retrievePasswordButton.click();

        String actualdUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualdUrl)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //close the driver
        driver.quit();
        }
    }



