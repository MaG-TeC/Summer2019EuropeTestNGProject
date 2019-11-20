package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homework1 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebElement searcBox = driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']"));
        searcBox.sendKeys("Smart watch");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

    String resultMessage = driver.findElement(By.cssSelector("srp-controls__count-heading")).getText();

        System.out.println("resultMessage");

    }
}
