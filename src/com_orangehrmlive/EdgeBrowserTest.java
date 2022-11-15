package com_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        //Open URL
        driver.get(baseurl);
        //Maximise window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
