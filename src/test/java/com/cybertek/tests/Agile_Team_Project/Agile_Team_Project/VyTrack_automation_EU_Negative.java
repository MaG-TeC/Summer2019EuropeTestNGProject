package com.cybertek.tests.Agile_Team_Project.Agile_Team_Project;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VyTrack_automation_EU_Negative {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://qa1.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.name("_username"));
        userName.sendKeys("storemanager59");

        WebElement passWord = driver.findElement(By.name("_password"));
        passWord.sendKeys("UserUser122");

        WebElement sendButton = driver.findElement(By.name("_submit"));
        sendButton.click();

       String resultMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/form/fieldset/div[1]/div")).getText();

        System.out.println(resultMessage);
    }
}