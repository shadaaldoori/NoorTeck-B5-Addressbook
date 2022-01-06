package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {
	
	@FindBy(id = "user_email")
	WebElement userEmailField;
	
	@FindBy(id = "user_password")
	WebElement passwordField;
	
	@FindBy(name = "commit")
	WebElement signUpButton;

public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
public void enterEmail(String email) {
	enter(userEmailField, email);
}
public void enterPassword(String password) {
		enter(passwordField,password);
}
public void clickSignUp() {
	click(signUpButton);
	
	
}
}