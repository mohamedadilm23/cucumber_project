package stepsdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginwithdata {
	WebDriver driver;

	@Given("user is on the login page to login the correct user")
	public void user_is_on_the_login_page_to_login_the_correct_user() {
		 driver=new ChromeDriver();
		 driver.get("https://letcode.in/");
	}

	@When("the users enter the correct validate {string} & {string}")
	public void the_users_enter_the_correct_validate(String string, String string2) {
		   driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.name("email")).sendKeys(string);
		   driver.findElement(By.name("password")).sendKeys(string2);
	}
	@When("clicks on client user the login button")
	public void clicks_on_client_user_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[.='LOGIN']")).click(); 
		
	
	}

	@Then("then user should be navigate the homepage fianl signout page")
	public void then_user_should_be_navigate_the_homepage_fianl_signout_page() {
		driver.findElement(By.xpath("(//a[@title='Courses'])[2]")).click();
	}



}
