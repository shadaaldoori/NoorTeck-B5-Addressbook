package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressbookTest2StepDef extends ObjInitialize {
	
	
	String url = "http://a.testaddressbook.com/";
	private Object enterState;
		
	@When("User enters email {string}")
	public void user_enters_email(String email) {
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
				
	}

	@When("User clicks signin button")
	public void user_clicks_signin_button() {
		signInObj.clickSignIn();
	}

	@When("User clicks Address menu")
	public void user_clicks_address_menu() {
		addressbookObj.clickNewAddress();
	}

		
		@When("User enters firstname {string}")
		public void user_enters_firstname(String firstName) {
	    addressbookObj.enterFirstName(firstName);
		}

		@When("User enters lastname {string}")
		public void user_enters_lastname(String lastName) {
		addressbookObj.enterLastName(lastName);
		}

		@When("User enters Address1 {string}")
		public void user_enters_address1(String address1) {
		addressbookObj.enterAddressOne(address1);
		}
		@When("User enters Address2 {string}")
		public void user_enters_address2(String address2) {
		addressbookObj.user_enters_address2(address2);
		}

		@When("User enters city {string}")
		public void user_enters_city(String cityField) {
		addressbookObj.enterCity(cityField);
		}

		@When("User enters state {string}")
		public void user_dropdown_state(String State) {
		addressbookObj.dropdownState("value", State);
		}

		@When("User selects country")
		public void user_click_country() {
		addressbookObj.clickCountry();    
		}

		@When("User enters age {string}")
		public void user_enters_age(String age) {
		addressbookObj.enterAge(age);
		}

		@When("User enters phone {string}")
		public void user_enters_phone(String phone) {
		addressbookObj.enterPhone(phone);
		}

		@When("User selects common interest")
		public void user_selects_common_interest() {
		addressbookObj.clickCommonInterests();
		}

		@When("User enters note {string}")
		public void user_enters_note(String note) {
		addressbookObj.enterNote(note);
		}

		@When("User clicks create address button")
		public void user_clicks_create_address_button() {
		addressbookObj.clickCreateAddress();
		}

		@When("User clicks list button")
		public void user_clicks_list_button() {
		addressbookObj.clickList();
		}

	@Then("User verify firstname")
	public void user_verify_firstname() {
	addressbookObj.verifyFirstName();
	}

	@Then("User verify lastname")
	public void user_verify_lastname() {
	addressbookObj.verifyLastNameField();
	}

	@Then("User verify city")
	public void user_verify_city() {
	addressbookObj.verifyCityField();
	}

	@Then("User verify state")
	public void user_verify_state() {
	addressbookObj.verifyStateField();
	}

}
