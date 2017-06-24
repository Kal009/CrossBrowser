package com.bbc.News;

import com.bbc.Basepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Trupesh on 19/06/2017.
 */
public class Newspage extends Basepage {
        WebDriver driver;
    @FindBy(how = How.LINK_TEXT,using = "News")
    WebElement newspage_link;

    public Newspage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void newspagelink(){
        newspage_link.click();
    }

}
