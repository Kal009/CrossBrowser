package com.bbc;

import com.BrowserFectory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

/**
 * Created by Trupesh on 11/06/2017.
 */
public class Basesteps  {



   public WebDriver  driver = BrowserFectory.getbrowser();


   public Basesteps() throws MalformedURLException {
   }
}
