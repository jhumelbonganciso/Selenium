package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chromer.driver","C:\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("incorrectPassword");
        driver.findElement(By.className("signInBtn")).click();

    }
}