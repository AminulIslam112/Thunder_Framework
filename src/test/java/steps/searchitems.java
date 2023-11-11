package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomepage;

public class searchitems extends googleBase {
	googleHomepage gp;

	@Given("i am on the home page")
	public void i_am_on_the_home_page() {
		lauchBrowser();
		
	}

	@When("I enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {

	gp = new googleHomepage(Driver);
	gp.enterProduct(string);

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		gp = new googleHomepage(Driver);
		gp.clickOnSearchButton();
		}

	@Then("I can see search results successfully")
	public void i_can_see_search_results_successfully() {
		gp = new googleHomepage(Driver);
		
		
		Assert.assertTrue(gp.verifySearchResultIsDisplayed());
		Driver.quit();
		
		closeAll();

	}

}
