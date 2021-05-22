package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.Hooks;

public class stepdefinition {
	
	WebDriver driver = Hooks.driver;
	
	@Given("^User is on the google page$")
	public void user_is_on_the_google_page()  {
		driver.get("https://www.google.com/");
	    // Write code here that turns the phrase above into concrete actions

	}

	@When("^User search facebook$")
	public void user_search_facebook() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("facebook");
	}

	@When("^clicks on Search button$")
	public void clicks_on_Search_button()  {
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Results will be populated$")
	public void results_will_be_populated()  {
		System.out.println("Step 4");
	    // Write code here that turns the phrase above into concrete actions
	}
	
	@When("^User search \"([^\"]*)\"$")
	public void user_search(String searchvalue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(searchvalue);
	}
	
	@Given("^login to the application$")
	public void login_to_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("execute before the test cases");
	}


}
