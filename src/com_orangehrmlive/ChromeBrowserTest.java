package com_orangehrmlive;
/*      1. Setup chrome browser
        2. Open URL
        3. Print the title of the page
        4. Print the current url
        5. Print the page source
        6. Enter the email to email field
        7. Enter the password to password field
        8. Close the browser*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // set up chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        //Open URL
        driver.get(baseUrl);
        //Maximising the window
        driver.manage().window().maximize();
        //Print the title of the page
        System.out.println("Title of the page: " + driver.getTitle());
        //Print the current url
        System.out.println("Current url is : " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source is :" + driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Enter the email to email field
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");

        //Enter the email to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Click on login
     // driver.findElement(By.cssSelector(".oxd-button")).click();


       // Close the browser
        driver.quit();
    }
}
