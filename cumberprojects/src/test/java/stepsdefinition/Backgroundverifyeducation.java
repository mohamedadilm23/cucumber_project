package stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundverifyeducation {
	@Given("the students finished high school")
	public void the_students_finished_high_school() {
	   System.out.println("the students finished high school");
	}

	@Given("the students finished Higher scendary school")
	public void the_students_finished_higher_scendary_school() {
	    System.out.println("the students finished Higher scendary school");
	}

	@Given("the students applied for medical course")
	public void the_students_applied_for_medical_course() {
	    System.out.println("the students applied for medical course");
	}

	@When("the students cleared entrance exam")
	public void the_students_cleared_entrance_exam() {
	   System.out.println("the students cleared entrance exam");
	}

	@Then("the students eligble for joining any medical Instutie")
	public void the_students_eligble_for_joining_any_medical_instutie() {
	   System.out.println("the students eligble for joining any medical Instutie");
	}

	@Given("the students applied for arts and science course")
	public void the_students_applied_for_arts_and_science_course() {
	   System.out.println("the students applied for arts and science course");
	}

	@Then("the students eligble for joining any arts and science")
	public void the_students_eligble_for_joining_any_arts_and_science() {
	    System.out.println("the students eligble for joining any arts and science");
	}



}
