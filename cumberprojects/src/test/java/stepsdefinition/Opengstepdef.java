package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengstepdef {
	WebDriver driver;

	@Given("user is entering googlecoin")
	public void user_is_entering_googlecoin() {
	    // Write code here that turns the phrase above into concrete actions
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
		
	}
	@When("user is typing search term {string}")
	public void user_is_typing_search_term(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys("jamal mohamed college");
	}
	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}
	
	@Then("then user should see the search results")
	public void then_user_should_see_the_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	 boolean status=  driver.findElement(By.partialLinkText("jamal")).isDisplayed();
	 if (status) {
		System.out.println("Results is dispalyed");
	}
	}



}
