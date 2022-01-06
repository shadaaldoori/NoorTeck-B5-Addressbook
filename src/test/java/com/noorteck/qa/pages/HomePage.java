package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy (xpath = "//*[@data-test = 'home']")
	WebElement homeButton;
	
	@FindBy (xpath = "//*[@data-test = 'addresses")
	WebElement addressButton;
	
	@FindBy (xpath = "//*[@data-test = 'SingOut']")
	WebElement SignOutButton;
	
	@FindBy (xpath = "//*[@date-test='sign-out']")
	WebElement verifyMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickhomeButton() {
		click(homeButton);
	}
	public void clickAddressButton() {
		click(addressButton);
	}
	public void clickSignOutButton() {
		click(SignOutButton);
	}
	public void textVerifyMessage() {
		click(verifyMessage);
	}

}

