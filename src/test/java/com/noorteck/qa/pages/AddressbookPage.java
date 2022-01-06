package com.noorteck.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressbookPage extends CommonUI{
		
	@FindBy(css = "#address_first_name")
	WebElement firstNameField;

	@FindBy(css = "#address_last_name")
	WebElement lastNameField;
	
	@FindBy(css = "#address_street_address")
	WebElement addressOneField;
	
	@FindBy(css = "#address_street_second_address")
	WebElement addressTwoField;
	
	@FindBy(css = "#address_city")
	WebElement cityField;
	
	@FindBy(css = "#address_state")
	WebElement stateDropDown;
	
	@FindBy(css = "#address_zip_code")
	WebElement zipcodeField;
	
	@FindBy(css = "#address_country_US")
	WebElement countryRadio;
	
	@FindBy(css = "#address_age")
	WebElement ageField;
	
	@FindBy(css = "#address_website")
	WebElement websiteField;
	
	@FindBy(css = "#address_phone")
	WebElement phoneField;
	
public AddressbookPage() {
	PageFactory.initElements(driver,this);
}
public void enterFirstName(String firstName) {
	enter(firstNameField, firstName);
}
public void enterlastName(String lastName) {
	enter(lastNameField, lastName);
}
public void enterAddressOne(String addressOne) {
	enter(addressOneField, addressOne);
}
public void enterAddressTwo(String addressTwo) {
	enter(addressTwoField, addressTwo);
}
public void enterCity(String city) {
	enter(cityField, city);
}
public void dropdownState(String methodname, String indexTextValue) {
	selectFromDropdown(stateDropDown, methodname, indexTextValue);
}
public void enterZipcode(String zipcode) {
	enter(zipcodeField, zipcode);
}
public void clickCountry() {
	click(countryRadio);
}
public void enterAge(String age) {
	enter(ageField, age);
}
public void enterWebsite(String website) {
	enter(websiteField, website);
}
public void enterPhone(String phone) {
	enter(phoneField, phone);
	

}
}