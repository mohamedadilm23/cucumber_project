package stepsdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	WebDriver driver;
		@Given("user is on the login page")
		public void user_is_on_the_login_page() throws InterruptedException {

			 driver=new ChromeDriver();
			 driver.get("https://letcode.in/");
		}
		@When("the users enter the validate username & password")
		public void the_users_enter_the_validate_username_password() throws InterruptedException {
			 driver.findElement(By.linkText("Log in")).click();
			   driver.findElement(By.name("email")).sendKeys("md.mohamedadil@gmail.com");
			   driver.findElement(By.name("password")).sendKeys("Mohamed@123");
			   
		}
		@When("clicks on the login button")
		public void clicks_on_the_login_button() {
	    driver.findElement(By.xpath("//button[.='LOGIN']")).click();
			   
		}
		@Then("then user should be navigate the homepage")
		public void then_user_should_be_navigate_the_homepage() {
			
			}
			}

		



	


