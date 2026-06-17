package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions(); options.addArguments("--headless=new"); options.addArguments("--no-sandbox"); options.addArguments("--disable-dev-shm-usage"); options.addArguments("--disable-gpu"); options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup(); 
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();
    }
}



