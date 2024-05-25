package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datatableexample {
	WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver=new ChromeDriver();
		driver.get("https://letcode.in/");
	}

	@When("User enters {string} and {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
		
		 if (username.equals("md.mohamedadil@gmail.com") && password.equals("Mohamed@123")) {
	           System.out.println("statement pass"); 
	        } else {
	           System.out.println("statement fail");
	        }
	    }
	

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	}
}



