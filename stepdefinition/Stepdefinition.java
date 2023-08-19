package www.app.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import www.app.baseclass.Baseclass;
import www.app.pageexe.Pageexe;

public class Stepdefinition extends Pageexe {
	@Given("Open browser and URL")
	public void open_browser_and_URL() {
		browser();
	}

	@When("Enter the username {string}")
	public void enter_the_username(String user) {
		user(user);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String pass) {
		pass(pass);

	}

	@When("Click the login button")
	public void click_the_login_button() {
		click();
	}

	@Then("Validate the outcome")
	public void validate_the_outcome() {
		System.out.println("Validated");
	}
}
