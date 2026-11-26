package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsCreatePage {

	WebDriver driver;
	// Adding LeadButton
	@FindBy (xpath = "//input[@data-name='firstName']")
	private WebElement FirstNameEdit;
	
	@FindBy (xpath = "//input[@data-name='lastName']")
	private WebElement LastNameEdit;
	
	@FindBy (xpath = "//div[@class='cell col-sm-6 form-group' and contains(.,'Accounts')]/descendant::span[@class='input-group-btn']")
	private WebElement AddAccountLink;
	
	@FindBy (xpath = "//a[text()='BMW']/ancestor::tr/descendant::input")
	private WebElement BMWAccountCheckbox;
	
	@FindBy (xpath = "//button[text()='Select']")
	private WebElement AccountSelectButton;
	
	@FindBy (xpath = "//button[@data-name='save']")
	private WebElement SaveButton;
	
	// Create Constructor to Initialize
	public ContactsCreatePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameEdit() {
		return FirstNameEdit;
	}

	public WebElement getLastNameEdit() {
		return LastNameEdit;
	}

	public WebElement getAddAccountLink() {
		return AddAccountLink;
	}

	public WebElement getBMWAccountCheckbox() {
		return BMWAccountCheckbox;
	}

	public WebElement getAccountSelectButton() {
		return AccountSelectButton;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}
}