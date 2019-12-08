package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Yahoo_Search {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.de/");
        WebElement searchBoxAmazon = driver.findElement(By.cssSelector("twotabsearchtextbox"));
        searchBoxAmazon.sendKeys("Selenium");

        WebElement searchButtonAmazon = driver.findElement(By.cssSelector("[value='Los']"));
        searchButtonAmazon.click();

        String AmazonResultMessage = driver.findElement(By.xpath("//h1//span[3]")).getText();
        System.out.println(AmazonResultMessage);


        driver.get("https://www.ebay.com/");
        WebElement searchBoxYahoo = driver.findElement(By.cssSelector("#gh-ac"));
        searchBoxYahoo.sendKeys("Selenium");

        WebElement searchButtonYahoo = driver.findElement(By.cssSelector("#gh-btn"));
        searchButtonYahoo.click();

        String YahooResultMessage = driver.findElement(By.xpath("//h1/span[2]")).getText();
        System.out.println(YahooResultMessage);


        driver.quit();
    }
}
