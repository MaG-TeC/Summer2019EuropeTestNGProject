package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WikipediaTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        WebElement searchBox = driver.findElement(By.cssSelector("input#searchInput"));
        searchBox.sendKeys("selenium webdriver");

        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive"));
        searchButton.click();

        WebElement searchResult = driver.findElement(By.xpath("//div/a/span"));
        searchResult.click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://en.wikipedia.org/wiki/Selenium_(software)");





    }


}
