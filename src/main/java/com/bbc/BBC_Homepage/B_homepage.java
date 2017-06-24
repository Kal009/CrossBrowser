package com.bbc.BBC_Homepage;

import com.bbc.Basepage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Trupesh on 11/06/2017.
 */
public class B_homepage extends Basepage {
WebDriver driver;

   @FindBy(how = How.LINK_TEXT, using = "News")
   WebElement homepage_link;
            //= driver.findElement(By.linkText("News"));



    //WebElement login_page_link;
  //  WebElement Whether_page_link;
   // WebElement News_page_link;

   //This is a Constructor of current class
   public B_homepage(WebDriver driver){
            this.driver = driver;
         PageFactory.initElements(driver,this);
    }

   public void Login_page(){
   homepage_link.click();

}

}


