package org.test.prolaborate.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PojoClass extends BaseClass{
	public static Select s;
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	@FindBy(xpath = "(//a[text()='Take a Trial'])[4]")
	private WebElement takeTrail;
	
	@FindBy(xpath = "(//a[text()='Book a Demo'])[4]")
	private WebElement bookDemo;

	@FindBy(xpath = "(//a[text()='Setup a PoC'])[4]")
	private WebElement setupPoc;


	@FindBy(xpath = "//input[contains(@id,'FirstName')]")
	private WebElement name;


	@FindBy(xpath = "//input[contains(@id,'Email')]")
	private WebElement email;


	@FindBy(id = "password")
	private WebElement password;


	@FindBy(id = "confirm_password")
	private WebElement confirmPassword;


	@FindBy(id = "ClientCompanyName")
	private WebElement companyName;
	

	@FindBy(id = "how_know")
	private WebElement howKnow;
	
	@FindBy(id = "demoReqDesignation")
	private WebElement designation;

	
	@FindBy(name = "enter")
	private WebElement submitButton;

	@FindBy(id = "BookDemoRequestPhone")
	private WebElement phoneNumber;
	
	@FindBy(xpath = "//input[contains(@id,'OrganisationName')]")
	private WebElement OrganisationName;
	
	@FindBy(id = "BookDemoRequestNotes")
	private WebElement notes;
	
	@FindBy(id = "BookPocRequestNotes")
	private WebElement Poc;
	
	@FindBy(xpath = "//div[text()='Start Here']")
	public WebElement start_here;
	
	@FindBy(xpath = "(//a[text()='Book a Demo'])[1]")
	private WebElement menu_BookDemo;
	
	@FindBy(xpath = "(//a[text()='Take a Trial'])[1]")
	private WebElement menu_takeTrail;
	
	@FindBy(xpath = "(//a[text()='Setup a PoC'])[1]")
	private WebElement menu_setupPoc;
	
	@FindBy(xpath = "//span[text()='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(xpath = "//input[contains(@id,'Subject')]")
	private WebElement subject;
	
	@FindBy(xpath = "//textarea[contains(@id,'Message')]")
	private WebElement message;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	

	@FindBy(xpath = "//div[text()='Customers']")
	public WebElement customers;


	@FindBy(xpath = "//div[text()='Resources']")
	public WebElement Resources;
	
	@FindBy(id = "BuyEnterpriseArchitectOnCloudName")
	public WebElement cloudName;
	
	@FindBy(id = "tbName")
	public WebElement requestInstallerName;

	@FindBy(id = "demoReqEmail")
	public WebElement requestInstallerMail;
	
	@FindBy(id = "organisationname")
	public WebElement requestInstallerOrgName;
	
	//Methods
	
	public WebElement getRequestInstallerName() {
		return requestInstallerName;
	}

	public WebElement getRequestInstallerMail() {
		return requestInstallerMail;
	}

	public WebElement getRequestInstallerOrgName() {
		return requestInstallerOrgName;
	}
	
	public WebElement getCloudName() {
		return cloudName;
	}

	public WebElement getCustomers() {
		return customers;
	}
	
	public WebElement getResources() {
		return Resources;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getSubject() {
		return subject;
	}
	
	public WebElement getMessage() {
		return message;
	}
	
	@FindBy(id = "ContactName")
	private WebElement contactName;
	
	
	public WebElement getContactName() {
		return contactName;
	}
	public WebElement getContactUs() {
		return contactUs;
	}

	public WebElement getMenu_BookDemo() {
		return menu_BookDemo;
	}

	public WebElement getMenu_takeTrail() {
		return menu_takeTrail;
	}

	public WebElement getMenu_setupPoc() {
		return menu_setupPoc;
	}

	public WebElement getStart_here() {
		return start_here;
	}

	public WebElement getsetupPoc() {
		return setupPoc;
	}
	
	public WebElement getPoc() {
		return Poc;
	}

	public WebElement getNotes() {
		return notes;
	}


	public WebElement getOrganisationName() {
		return OrganisationName;
	}


	public WebElement getPhoneNumber() {
		return phoneNumber;
	}


	public WebElement getDesignation() {
		return designation;
	}
	
	
	public WebElement getBookDemo() {
		return bookDemo;
	}
	
	public WebElement getTakeTrail() {
		return takeTrail;
	}
	
	public WebElement getName() {
		return name;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getConfirmpassword() {
		return confirmPassword;
	}
	
	public WebElement getCompanyname() {
		return companyName;
	}
	
	public WebElement gethowknow(String t) {
		s = new Select(howKnow);
		s.selectByVisibleText(t);
		return howKnow;
	}
	
	
	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy(xpath = "//span[contains(text(),'Sign Out')]")
	private WebElement signout;
	
	public WebElement getSignout() {
		return signout;
	}
	
	@FindBy(xpath = "//img[@class='d-inline-block rounded-circle user-icon']")
	private WebElement profileIcon;
	
	public WebElement getProfileIcon() {
		return profileIcon;
	}

}
