package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
    static WebDriver driver;

    public static void createDriver(){
        // setup the driver
        WebDriverManager.chromedriver().setup();        

        // create new instance for driver        
        driver = new ChromeDriver();

        System.out.println("Driver Created");

        // maximize the window
        driver.manage().window().maximize();
    }

    
    public WebDriver getInstence(){
        // if driver is null then create the driver
        if(driver == null){
            createDriver();
        }
        
        return driver;
    }
}
