package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Yahoo_Result {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");

        WebElement searcBox = driver.findElement(By.cssSelector("[class='gh-tb ui-autocomplete-input']"));
        searcBox.sendKeys("Smart watch");

        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        WebElement resultBox = driver.findElement(By.xpath("//h1/span[1]"));

        String resultMessage = resultBox.getText();

        System.out.println("resultMessage: " + resultMessage);

        driver.quit();

    }
}
