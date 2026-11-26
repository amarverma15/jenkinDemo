package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {


	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//span[text()='Create Account']")
	private WebElement CreateAccountsLink;
	
	// Create Constructor to Initialize
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateAccountsLink() {
		return CreateAccountsLink;
	}
}