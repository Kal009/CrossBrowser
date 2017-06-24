package com.bbc;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Trupesh on 15/06/2017.
 */



@RunWith(Cucumber.class)
@CucumberOptions(
       plugin = {
               "pretty", "html:target/eurostar-html-report",
               "json:target/eurostar_report.json"},
               tags = "@priya",
//        glue = "src/test/java/MyStepdefs"
               features = "src/test/resources/BBC_Home/bbc_home.feature"
               )

public class Kal {
}
