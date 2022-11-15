package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/*      1. Setup chrome browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browser*/

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        //set up web driver
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Open URL
        driver.get(baseUrl);
        //Maximise window
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title of the page is : "+ driver.getTitle());
        //Print the current url
        System.out.println("The current url is : "+ driver.getCurrentUrl());
        //Print the page source
        System.out.println("The current url is : "+ driver.getPageSource());

        //Enter the email to email field
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");

        //Enter the email to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.quit();

    }
}
