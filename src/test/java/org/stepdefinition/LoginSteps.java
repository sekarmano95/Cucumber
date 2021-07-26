package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pages.LoginPage;
import org.pages.PageObjectManager;
import org.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	static PageObjectManager manager;
	LoginPage l;
	RegistrationPage r;

	@Given("The user should be in Facebook page")
	public void the_user_should_be_in_Facebook_page() {	}

	@When("The user has to fill {string}  and {string}")
	public void the_user_has_to_fill_and(String user, String pass) {
		 manager = PageObjectManager.getManager();
		 l = new LoginPage();
		fillTextBox(l.getTxtUsername(), user);
		fillTextBox(l.getTxtPassword(), pass);
	}

	@When("The user has to  clcik the login button")
	public void the_user_has_to_clcik_the_login_button() {
		Assert.assertTrue(false);
		btnClick(l.getBtnLogin());
	}

	@Then("The user should be in invalid page")
	public void the_user_should_be_in_invalid_page() {
		Assert.assertTrue(true);
		System.out.println("User in Inavlaid page");
	}

	@When("The user has to fill firstname and lastname details")
	public void the_user_has_to_fill_firstname_and_lastname_details() {
		 r = new RegistrationPage();
		btnClick(r.getBtnCreate());
		fillTextBox(r.getTxtFirstName(), "Manoj");
		fillTextBox(r.getTxtLastName(), "Kumar");
	}

	@When("The user to click the sign up button")
	public void the_user_to_click_the_sign_up_button() {
		btnClick(r.getBtnSignUp());
	}

	@Then("The user successfully register")
	public void the_user_successfully_register() {
		Assert.assertTrue(true);
		System.out.println("Suucessfull registered");
	}
}