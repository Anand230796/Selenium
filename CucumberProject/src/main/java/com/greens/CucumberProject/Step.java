package com.greens.CucumberProject;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step extends Base {

	@Given("^user launch the browser and automationpractice application$")
	public void user_launch_the_browser_and_automationpractice_application() throws Throwable {

		launchBrowser("Chrome");
		launchUrl("http://automationpractice.com/index.php");

		PageFactory.initElements(driver, Login.class);
		implicitWait();

	}

	@When("^user clicks the dresses button$")
	public void user_clicks_the_dresses_button() throws Throwable {

		Login.SelectDress.click();

	}

	@Then("^user select the evening dresses$")
	public void user_select_the_evening_dresses() throws Throwable {

		Login.EveningDress.click();

	}

	@Then("^user select the quantity$")
	public void user_select_the_quantity() throws Throwable {

		Login.Quantity.click();

	}

	@Then("^user select the size$")
	public void user_select_the_size() throws Throwable {
		dropDown(Login.Size, "Value", "2");
	}

	@Then("^user select the colour$")
	public void user_select_the_colour() throws Throwable {
		Login.colour.click();
	}

	@Then("^user clicks add to cart$")
	public void user_clicks_add_to_cart() throws Throwable {
		Login.Addtocart.click();

	}

	@Then("^user clicks proceed to checkout$")
	public void user_clicks_proceed_to_checkout() throws Throwable {
		Login.ProceedtoCheckout.click();

	}

	@When("^user clicks proceed to checkout again$")
	public void user_clicks_proceed_to_checkout_again() throws Throwable {
		Login.proceedagain.click();

	}

	@When("^user enter the email id$")
	public void user_enter_the_email_id() throws Throwable {
		enterText(Login.emailid, "anandm789@gmail.com");

	}

	@Then("^user clicks create account button$")
	public void user_clicks_create_account_button() throws Throwable {
		Login.Createaccount.click();

		Login.Createaccount.click();

	}

	@Then("^user enters all the personal details$")
	public void user_enters_all_the_personal_details() throws Throwable {
		
		Login.gender.click();

		enterText(Login.firstname, "Anand");

		enterText(Login.lastname, "M");

		enterText(Login.pass, "Dukie@2123");

		dropDown(Login.days, "value", "23");

		dropDown(Login.months, "value", "7");

		dropDown(Login.years, "value", "1996");

		enterText(Login.Company, "Cognizant");

		enterText(Login.add1, "PO BOX 23566 Los Angeles CA ");

		enterText(Login.City, "Chennai");

		dropDown(Login.state, "value", "14");

		enterText(Login.postcode, "00000");

		dropDown(Login.Country, "Visibletext", "United States");

		enterText(Login.mobile, "8807435052");

		enterText(Login.address, "NO235/3 mansion st");

	}

	@Then("^clicks register button$")
	public void clicks_register_button() throws Throwable {
		Login.register.click();

	}

	@Then("^user clicks proceed again button$")
	public void user_clicks_proceed_again_button() throws Throwable {
		Login.proceedagain2.click();

	}

	@When("^user clicks agree to terms and conditions$")
	public void user_clicks_agree_to_terms_and_conditions() throws Throwable {
		Login.agree.click();
		Login.proceedagain3.click();

	}

	@Then("^user clicks pay by wire$")
	public void user_clicks_pay_by_wire() throws Throwable {
		Login.paybybankwire.click();

	}

	@Then("^user clicks confirms my order$")
	public void user_clicks_confirms_my_order() throws Throwable {
		Login.connfirmmyorder.click();

	}

	@Then("^user click sign out button$")
	public void user_click_sign_out_button() throws Throwable {
		Login.signout.click();

	}

}
