package com.espo.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	WebDriver driver;
	// Adding LaedButton
	@FindBy (xpath = "//span[text()='Leads']")
	private WebElement LeadLink;
	@FindBy (xpath = "//span[text()='Contacts']")
	private WebElement ContactLink;
	@FindBy (xpath = "//span[text()='Opportunities']")
	private WebElement OpportunitiesLink;
	@FindBy (xpath = "//span[text()='Accounts']")
	private WebElement AccountsLink;
	@FindBy (xpath = "//span[text()='Cases']")
	private WebElement CasesLink;
	@FindBy (id = "nav-menu-dropdown")
	private WebElement LogoutDropdown;
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement LogoutBtn;
	// Create Constructor to Initialize
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLogoutDropdown() {
		return LogoutDropdown;
	}

	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLeadLink() {
		return LeadLink;
	}

	public WebElement getContactLink() {
		return ContactLink;
	}

	public WebElement getOpportunitiesLink() {
		return OpportunitiesLink;
	}

	public WebElement getAccountsLink() {
		return AccountsLink;
	}

	public WebElement getCasesLink() {
		return CasesLink;
	}

	// Business Libraries not required
	public void logout() {
		getLogoutDropdown().click();
		getLogoutBtn().click();
	}
}
