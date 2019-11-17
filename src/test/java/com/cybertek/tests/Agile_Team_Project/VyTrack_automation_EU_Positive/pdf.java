package com.cybertek.tests.Agile_Team_Project.VyTrack_automation_EU_Positive;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pdf {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa1.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.name("_username"));
        userName.sendKeys("storemanager59");

        WebElement passWord = driver.findElement(By.name("_password"));
        passWord.sendKeys("UserUser123");

        WebElement sendButton = driver.findElement(By.name("_submit"));
        sendButton.click();
    }
}
