package stepsdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Datatable {
	WebDriver driver;
	
	@Given("user is on the login page to login the correct clientname")
	public void user_is_on_the_login_page_to_login_the_correct_clientname() {
		 driver=new ChromeDriver();
		 driver.get("https://letcode.in/");    
	}

	@When("the users enter the correct login credential letcode website")
	public void the_users_enter_the_correct_login_credential_letcode_website(io.cucumber.datatable.DataTable dataTable) 
	{
	driver.findElement(By.linkText("Log in")).click();
	List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);

    for (Map<String, String> credential : credentials) {
        String username = credential.get("username");
        String password = credential.get("Password");
		   driver.findElement(By.name("email")).sendKeys(username);
		   driver.findElement(By.name("password")).sendKeys(password);
    }   
	}

	@When("clicks on client user the login users")
	public void clicks_on_client_user_the_login_users() {
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		   
	}


}
