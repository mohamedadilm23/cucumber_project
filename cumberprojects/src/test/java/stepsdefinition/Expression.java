package stepsdefinition;

import io.cucumber.java.en.Given;

public class Expression {
  @Given("I have a {int} laptop")
  public void i_have_a_laptop(Integer int1) {
	  System.out.println("laptop count"+int1);
  }
  
  @Given("I have a {double} cgpa")
  public void i_have_a_cgpa(Double double1) {
	  System.out.println("usercgpa"+double1);
  }
  
  @Given("{string} is elder to {string} and {string}")
  public void is_elder_to_and(String string, String string2, String string3) {
	  System.out.println("userelder"+string2);
  }



}