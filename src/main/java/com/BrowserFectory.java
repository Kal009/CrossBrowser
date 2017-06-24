package com;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.BrowserType.IE;

/**
 * Created by Trupesh on 11/06/2017.
 */
public class BrowserFectory {
//String browser = "Chrome";
   public static WebDriver driver;
   // @BeforeClass
   // @Parameters("browser")
    public static WebDriver getbrowser() throws MalformedURLException {
       // System.setProperty("webdriver.chrome.driver","C:\\Cucumbe jars\\WebDrivers\\chromedriver.exe");
         //    driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver", "C:\\Cucumbe jars\\WebDrivers\\chromedriver.exe");
        DesiredCapabilities cap = DesiredCapabilities.chrome();

        cap.setPlatform(Platform.WIN10);

        URL url = new URL("http://192.168.0.19:5555/wd/hub");


         driver = new RemoteWebDriver(url,cap);

        driver.get("http://www.bbc.co.uk");

        return  driver;

    }}


