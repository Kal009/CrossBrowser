package com.bbc.BBC_Homepage;

import com.BrowserFectory;
import com.bbc.Basesteps;
import com.bbc.News.Newspage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

/**
 * Created by Trupesh on 11/06/2017.
 */
public class News_Homepage extends Basesteps {

    Newspage np;
    B_homepage hp;

    public News_Homepage() throws MalformedURLException {
    }

    @Given("^user is on homepage$")
    public void userIsOnHomepage() throws Throwable {
        hp = new B_homepage(driver);
        hp.Login_page();
    }


    @When("^user click on news link$")
    public void user_click_on_news_link() throws Throwable {
        np = new Newspage(driver);
        np.newspagelink();
        System.out.println("whenmetod");
    }

    @Then("^user can see news page$")
    public void userCanSeeNewsPage() throws Throwable {
        System.out.println("thenmetod");
    }



}
