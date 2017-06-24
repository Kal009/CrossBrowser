package com.bbc;

import com.BrowserFectory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

/**
 * Created by Trupesh on 11/06/2017.
 */
public class Basepage implements InterfacejPage {


    public WebDriver driver;
   public void getDriver() throws MalformedURLException {

       driver = BrowserFectory.getbrowser();

   }
}
