package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ComSaucedemo {

    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        ComSaucedemo obj1 = new ComSaucedemo();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open URL
        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);

        // Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());

        // Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Enter email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("your_email@example.com");

        // Enter password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your_password");

        // Click on Login Button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // Print the current URL after login
        System.out.println("Current URL after login: " + driver.getCurrentUrl());

        // Navigate to baseUrl
        driver.get(baseUrl);

        // Refresh the page
        driver.navigate().refresh();

        // Close the browser
        driver.quit();
    }
}
