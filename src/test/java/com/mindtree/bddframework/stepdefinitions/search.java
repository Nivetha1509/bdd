package com.mindtree.bddframework.stepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import com.mindtree.bddframework.pageobject.automatingsearchpage;
import com.mindtree.bddframework.reusablecomponents.*;
import com.mindtree.bddframework.utility.PropertyFileReader;

@RunWith(Cucumber.class)
public class search {

	WebDriver driver;

    @Given("^User enter (.+) place and (.+) place$")
    public void user_enter_place_and_place(String from, String to) throws Throwable {
    	 driver =  ReusableComponents.loadDriver();
    	 driver.get(PropertyFileReader.loadFile().getProperty("url"));
    	 automatingsearchpage.search(driver, from,to);
    }
    @When("User select {int} the date for departure")
    public void user_select_the_date_for_departure(Integer int1) throws InterruptedException {
    	automatingsearchpage.datepicker(driver,int1);
      }

  
    
    @And("User select {int} the date for arrival")
    public void user_select_the_date_for_arrival(Integer int2) throws Throwable {
    	automatingsearchpage.datepickerarrival(driver,int2);
    	
   
    }

    
    @Then("^user click on the search button$")
    public void user_click_on_the_search_button() throws Throwable {
    	automatingsearchpage.search(driver);
    }
    

}