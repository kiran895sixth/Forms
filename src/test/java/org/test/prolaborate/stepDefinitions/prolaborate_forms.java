package org.test.prolaborate.stepDefinitions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.test.prolaborate.baseclass.BaseClass;
import org.test.prolaborate.baseclass.PojoClass;
import org.test.prolaborate.baseclass.XLdata;

import cucumber.api.java.en.*;

public class prolaborate_forms extends BaseClass{
	public static String sheet1 = "Test_Data";
	public static String sheet2 = "Test_case";
	public static String xlfile = "TestData//Forms.xlsx";
	
	PojoClass p ;
	Actions act ;
	//@tag1
	
	@Given("^User is open the URL$")
	public void user_is_open_the_URL() throws Throwable {
		
		launchChrome();
		sleep(6000);
	  
	}

	@When("^User click on Take a trial button$")
	public void user_clik_on_Take_a_trial_button() throws Throwable {
		p = new PojoClass();
		p.getTakeTrail().click();
	  
	}

	@Then("^User enter vaild details$")
	public void user_enter_vaild_details() throws Throwable {
		p = new PojoClass();
		String name = XLdata.getStringCellData(xlfile, sheet1, 1, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 1, 1);
		String password = XLdata.getStringCellData(xlfile, sheet1, 1, 2);
		String companyName = XLdata.getStringCellData(xlfile, sheet1, 1, 4);
		
		p.getName().sendKeys(name);
		p.getEmail().sendKeys("b"+email);
		p.getPassword().sendKeys(password);
		p.getConfirmpassword().sendKeys(password);
		p.getCompanyname().sendKeys(companyName);
		p.gethowknow("Sparx Systems Website");
	}

	@Then("^User click on Submit button$")
	public void user_click_on_Submit_button() throws Throwable {
	
		p.getSubmitButton().click();
	   
	}

	@Then("^user should see Welcome to Prolaborate Message and My Account button$")
	public void user_should_see_Welcome_to_Prolaborate_Message_and_My_Account_button() throws Throwable {
		System.out.println("\n TC01_Verifiying prolaborate take a trial request successfully sended \n");
		try {
			sleep();
			boolean success_msg = driver.findElement(By.xpath("//h2[text()='Welcome to Prolaborate!']")).isDisplayed();
			boolean myaccount = driver.findElement(By.xpath("//a[text()='My Account']")).isDisplayed();
			if (success_msg&&myaccount) {
				System.out.println("Take a Trial form successfully sent");
				XLdata.pass(xlfile, sheet2, 1, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Take a Trial form  NOT sent");
			XLdata.fail(xlfile, sheet2, 1, 2);
			System.out.println("***Test case fail***");
		}
	   quit();
	 
	}
	
	//@tag2
	
	@When("^User click on book a demo button$")
	public void user_clik_on_book_a_demo_button() throws Throwable {
		p = new PojoClass();
		scroll(p.getBookDemo());
		sleep();
		p.getBookDemo().click();
	}

	@Then("^User enter vaild details in book a demo form$")
	public void user_enter_vaild_details_in_book_a_demo_form() throws Throwable {
		p = new PojoClass();
		String name = XLdata.getStringCellData(xlfile, sheet1, 2, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 2, 1);
		String designation = XLdata.getStringCellData(xlfile, sheet1, 2, 5);
		String phone = XLdata.getNumericCellData(xlfile, sheet1, 2, 6);
		String companyName = XLdata.getStringCellData(xlfile, sheet1, 2, 4);
		String notes = XLdata.getStringCellData(xlfile, sheet1, 2, 7);
		
		p.getName().sendKeys(name);
		p.getEmail().sendKeys("b"+email);
		p.getDesignation().sendKeys(designation);
		sleep(1000);
		p.getPhoneNumber().sendKeys(phone);
		p.getOrganisationName().sendKeys(companyName);
		p.getNotes().sendKeys(notes);
		p.gethowknow("Sparx Systems Website");
	}
	
	

	@Then("^user should see thankyou Message$")
	public void user_should_see_thankyou_Message() throws Throwable {
		System.out.println("\n TC02_check if the prolaborate book a demo request successfully sended \n" );
		sleep();
		if (driver.getPageSource().contains("Thank you for your interest!")) {
			System.out.println("Book a Demo request form successfully sent");
			XLdata.pass(xlfile, sheet2, 2, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Book a Demo request form NOT sent");
			XLdata.fail(xlfile, sheet2, 2, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag3
	
	@When("^User click on setup a PoC button$")
	public void user_clik_on_setup_a_PoC_button() throws Throwable {
		p = new PojoClass();
		scroll(p.getsetupPoc());
		sleep();
		p.getsetupPoc().click();
	}

	@Then("^User enter vaild details in setup a PoC form$")
	public void user_enter_vaild_details_in_setup_a_PoC_form() throws Throwable {
		p = new PojoClass();
		String name = XLdata.getStringCellData(xlfile, sheet1, 2, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 2, 1);
		String companyName = XLdata.getStringCellData(xlfile, sheet1, 2, 4);
		String notes = XLdata.getStringCellData(xlfile, sheet1, 2, 7);
		
		
		p.getName().sendKeys(name);
		p.getEmail().sendKeys("b"+email);
		p.getOrganisationName().sendKeys(companyName);
		p.getPoc().sendKeys(notes);
		p.gethowknow("Sparx Systems Website");
	}
	
	@Then("^user should see thankyou Message Poc submit$")
	public void user_should_see_thankyou_Message_Poc_submit() throws Throwable {
		System.out.println("\n TC03_check if the prolaborate setup Poc request successfully  sended \n" );
		sleep();
		if (driver.getPageSource().contains("Thank you for your interest!")) {
			System.out.println("Setup PoC request form successfully sent");
			XLdata.pass(xlfile, sheet2, 3, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Setup PoC request form NOT sent");
			XLdata.fail(xlfile, sheet2, 3, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag4
	@When("^User mouse over on start here$")
	public void user_mouse_over_on_start_here() throws Throwable {
		p = new PojoClass();
		act=new Actions(driver);
		WebElement start_Here=p.getStart_here();
		sleep();
		act.moveToElement(start_Here);
	}
	@When("^User click on book a demo button from menu$")
	public void user_clik_on_book_a_demo_button_from_menu() throws Throwable {
		
		act.moveToElement(p.getMenu_BookDemo()).click().build().perform();
	}

	@Then("^User should see book a demo form$")
	public void user_should_see_book_a_demo_form() throws Throwable {
		System.out.println("\n TC04_check if user click on book a demo from menu is redirected to related page \n"  );
		sleep();
		try {
			boolean bookDemopage = driver.findElement(By.xpath("//h1[text()='Request a Demo']")).isDisplayed();
			if (bookDemopage) {
				System.out.println("book a Demo page properly visible");
				XLdata.pass(xlfile, sheet2, 4, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("book a Demo page properly not visible");
			XLdata.fail(xlfile, sheet2, 4, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag5
	
	@When("^User click on Take a trial button from menu$")
	public void user_clik_on_Take_a_trial_button_from_menu() throws Throwable {
		act.moveToElement(p.getMenu_takeTrail()).click().build().perform();
	}
	
	@Then("^User should see Take a trial form$")
	public void user_should_see_Take_a_trial_form() throws Throwable {
		System.out.println("\n TC05_check if user click on take a trial from menu is redirected to related page\n" );
		sleep();
		try {
			boolean takeTrialpage = driver.findElement(By.xpath("//h1[text()='Prolaborate Trial']")).isDisplayed();
			if (takeTrialpage) {
				System.out.println("Take a Trial page properly visible");
				XLdata.pass(xlfile, sheet2, 5, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Take a Trial page properly not visible");
			XLdata.fail(xlfile, sheet2, 5, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag6
	
	@When("^User click on setup a PoC button from menu$")
	public void user_clik_on_setup_a_PoC_button_from_menu() throws Throwable {
		
		act.moveToElement(p.getMenu_setupPoc()).click().build().perform();
	}

	@Then("^User should see setup a PoC form$")
	public void user_should_see_setup_a_PoC_form() throws Throwable {
		System.out.println("\n TC06_check if user click onsetup Poc from menu is redirected to related page \n");
		sleep();
		try {
			boolean pocpage = driver.findElement(By.xpath("//h1[text()='PROOF OF CONCEPT']")).isDisplayed();
			if (pocpage) {
				System.out.println("setupPoc page properly visible");
				XLdata.pass(xlfile, sheet2, 6, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("setupPoc page properly not visible");
			XLdata.fail(xlfile, sheet2, 6, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag7
	
	@When("^User is click on the contact us link$")
	public void user_is_click_on_the_contact_us_link() throws Throwable {
		p = new PojoClass();
		p.getContactUs().click();
	}

	@Then("^User sholud redirected to related page$")
	public void user_sholud_redirected_to_related_page() throws Throwable {
		System.out.println("\n TC07_check if user clinking on the contact us link redirects to the related page \n" );
		sleep();
		try {
			boolean page_url = getCurrentUrl().contains("contact-us");
		    boolean page_heading = driver.findElement(By.xpath("//h1[text()=' Contact Us']")).isDisplayed();
		    
		    if (page_url&&page_heading) {
		    	System.out.println("contact us form visible properly");
				XLdata.pass(xlfile, sheet2, 7, 2);
				System.out.println("***Test case pass***");
			} else {
				System.out.println("contact us form not visible properly");
				XLdata.fail(xlfile, sheet2, 7, 2);
				System.out.println("***Test case fail***");
			}
		} catch (Exception e) {
			System.out.println("--contant not found--");
			XLdata.fail(xlfile, sheet2, 7, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag8
	@Then("^User enter vaild details in contact us form$")
	public void user_enter_vaild_details_in_contact_us_form() throws Throwable {
		String name = XLdata.getStringCellData(xlfile, sheet1, 2, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 2, 1);
		String notes = XLdata.getStringCellData(xlfile, sheet1, 2, 7);
		p.getContactName().sendKeys(name);
		p.getEmail().sendKeys("b"+email);
		p.getSubject().sendKeys(notes);
		p.getMessage().sendKeys(notes);
	}

	@Then("^User should see thankyou Message for submit$")
	public void user_should_see_thankyou_Message_for_submit() throws Throwable {
		System.out.println("\n TC08_check if the prolaborate contact us form successfully sended \n" );
		sleep();
		if (driver.getPageSource().contains("Thank you for your interest!")) {
			System.out.println("Contact Us request form successfully sent");
			XLdata.pass(xlfile, sheet2, 8, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Contact Us request form NOT sent");
			XLdata.fail(xlfile, sheet2, 8, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag9
	
	@When("^User is click on the my account link$")
	public void user_is_click_on_the_my_account_link() throws Throwable {
	   p = new PojoClass();
	   p.getMyAccount().click();
			   
	}

	@Then("^User sholud redirected to login page$")
	public void user_sholud_redirected_to_login_page() throws Throwable {
		System.out.println("\n TC09_check if user clinking on the my account link redirects to the login page \n" );
		sleep();
		if (driver.getPageSource().contains("Login to Trial Account")) {
			System.out.println("Login page is visible properly");
			XLdata.pass(xlfile, sheet2, 9, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Login page is not visible");
			XLdata.fail(xlfile, sheet2, 9, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag10
	
	@When("^User click on the Register for a Trial link$")
	public void user_click_on_the_Register_for_a_Trial_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("//a[contains(text(),'Register for a Trial')]")).click();
	}
	
	@Then("^User should see Take a trial form	from login page$")
	public void user_should_see_Take_a_trial_form_from_login_page() throws Throwable {
		System.out.println("\n TC10_check if user clinking on the Register for a Trial link from login page redirects to the take a trial form page \n" );
		sleep();
		try {
			boolean takeTrialpage = driver.findElement(By.xpath("//h1[text()='Prolaborate Trial']")).isDisplayed();
			if (takeTrialpage) {
				System.out.println("Take a Trial page properly visible");
				XLdata.pass(xlfile, sheet2, 10, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Take a Trial page properly not visible");
			XLdata.fail(xlfile, sheet2, 10, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag11
	
	@When("^User is click on the premises learn more link$")
	public void user_is_click_on_the_premises_learn_more_link() throws Throwable {
		sleep();
		scroll(driver.findElement(By.xpath("//span[contains(text(),'Getting started')]")));
		sleep();
		WebElement learnmore = driver.findElement(By.xpath("(//a[contains(text(),'Learn More')])[1]"));    
	    learnmore.click();
	}

	@Then("^User should redirect to premises page$")
	public void user_should_redirect_to_premises_page() throws Throwable {
		System.out.println("\n TC11_check if user clinking on the premises learn morel link from home page redirects to the premises page \n");
		sleep();
		if (driver.getPageSource().contains("Prolaborate on Premises")) {
			System.out.println("Premises page is visible properly");
			XLdata.pass(xlfile, sheet2, 11, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Premises page is not visible");
			XLdata.fail(xlfile, sheet2, 11, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag12
	@When("^User is click on the cloud saas learn more link$")
	public void user_is_click_on_the_cloud_saas_learn_more_link() throws Throwable {
		sleep();
		scroll(driver.findElement(By.xpath("//span[contains(text(),'Getting started')]")));
		sleep();
		WebElement learnmore = driver.findElement(By.xpath("(//a[contains(text(),'Learn More')])[2]"));    
	    learnmore.click();
	}

	@Then("^User should redirect to cloud saas page$")
	public void user_should_redirect_to_cloud_saas_page() throws Throwable {
		System.out.println("\n TC12_check if user clinking on the cloud saas learn morel link from home page redirects to the cloud saas page \n" );
		sleep();
		if (driver.getPageSource().contains("Prolaborate and EA Infra on Cloud")) {
			System.out.println("cloud saas page is visible properly");
			XLdata.pass(xlfile, sheet2, 12, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("cloud saas page is not visible");
			XLdata.fail(xlfile, sheet2, 12, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag13
	
	@When("^User is click on take a trial button$")
	public void user_is_click_on_take_a_trial_button() throws Throwable {
		sleep();
		driver.findElement(By.xpath("//span//a[contains(text(),'Take a Trial')]")).click();
	}

	@Then("^User should redirect to take a trial form page$")
	public void user_should_redirect_to_take_a_trial_form_page() throws Throwable {
		System.out.println("\n TC13_check if user clinking on the take a trial from premises page redirects to the  take a trial form page \n" );
		sleep();
		try {
			boolean takeTrialpage = driver.findElement(By.xpath("//h1[text()='Prolaborate Trial']")).isDisplayed();
			if (takeTrialpage) {
				System.out.println("Take a Trial page properly visible");
				XLdata.pass(xlfile, sheet2, 13, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Take a Trial page properly not visible");
			XLdata.fail(xlfile, sheet2, 13, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag14
	
	@When("^User is click on setup poc button$")
	public void user_is_click_on_setup_poc_button() throws Throwable {
		sleep();
		driver.findElement(By.xpath("//span[2]/a[2]")).click();
	}

	@Then("^User should redirect to setup poc related page$")
	public void user_should_redirect_to_related_page() throws Throwable {
		System.out.println("\n TC14_check if user clinking on the setup poc from premises page redirects to the related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='On-Premises Proof of Concept-V3']")).isDisplayed();
			if (pagehead) {
				System.out.println("setup a poc is redirects to related page");
				XLdata.pass(xlfile, sheet2, 14, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("setup a poc is redirects to unrelated page");
			XLdata.fail(xlfile, sheet2, 14, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag15
	
	@When("^User is click on check FQA button$")
	public void user_is_click_on_check_FQA_button() throws Throwable {
		sleep();
		driver.findElement(By.xpath("//span[2]/a[1]")).click();
	}

	@Then("^User should redirect to check FQA related page$")
	public void user_should_redirect_to_check_FQA_related_page() throws Throwable {
		System.out.println("\n TC15_check if user clinking on the check faq from cloud saas page redirects to the related page\r\n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Prolaborate and Enterprise Architect on Cloud FAQ']")).isDisplayed();
			if (pagehead) {
				System.out.println("Check FQA is redirects to related page");
				XLdata.pass(xlfile, sheet2, 15, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Check FQA is redirects to unrelated page");
			XLdata.fail(xlfile, sheet2, 15, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag16
	
	@Then("^User should redirect to setup poc related page from cloud saas$")
	public void user_should_redirect_to_setup_poc_related_page_from_cloud_saas() throws Throwable {
		System.out.println("\n TC16_check if user clinking on the  setup poc from cloud saas page redirects to the related page\n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Cloud Proof of Concept']")).isDisplayed();
			if (pagehead) {
				System.out.println("setup poc is redirects to related page");
				XLdata.pass(xlfile, sheet2, 16, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("setup poc is redirects to unrelated page");
			XLdata.fail(xlfile, sheet2, 16, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag17
	
	@When("^User is click on cloud proof of concept link$")
	public void user_is_click_on_cloud_proof_of_concept_link() throws Throwable {
	    sleep();
	    driver.findElement(By.xpath("//a[text()='here']")).click();
	}

	@Then("^User should redirect to cloud proof of concept related page$")
	public void user_should_redirect_to_cloud_proof_of_concept_related_page() throws Throwable {
		System.out.println("\n TC17_check if user clinking on the Cloud Proof of Concept link from Proof of Concept page redirects to the related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Cloud Proof of Concept']")).isDisplayed();
			if (pagehead) {
				System.out.println("Cloud Proof of Concept page  is visible");
				XLdata.pass(xlfile, sheet2, 17, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Cloud Proof of Concept page  is not visible");
			XLdata.fail(xlfile, sheet2, 17, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag18
	
	@When("^User is click on setup poc form link$")
	public void user_is_click_on_setup_poc_form_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("(//u[text()='form'])[1]")).click();
	}
	
	@Then("^User should see setup a PoC form from cloud proof of concept page$")
	public void user_should_see_setup_a_PoC_form_from_cloud_proof_of_concept_page() throws Throwable {
		System.out.println("\n TC18_check if user clinking on the setup poc  link from Cloud Proof of Concept page redirects to the related page \n");
		sleep();
		try {
			boolean pocpage = driver.findElement(By.xpath("//h1[text()='PROOF OF CONCEPT']")).isDisplayed();
			if (pocpage) {
				System.out.println("setupPoc form page properly visible");
				XLdata.pass(xlfile, sheet2, 18, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("setupPoc form page properly not visible");
			XLdata.fail(xlfile, sheet2, 18, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag19
	
	@When("^User is click on the take a trial link bottom on the home page$")
	public void user_is_click_on_the_take_a_trial_link_bottom_on_the_home_page() throws Throwable {
	    sleep();
	    WebElement taketrial = driver.findElement(By.xpath("(//a[text()='Take a Trial'])[5]"));
	    scroll(taketrial);
	    sleep();
	    taketrial.click();
	}

	@Then("^User should see take a trial form$")
	public void user_should_see_take_a_trial_form() throws Throwable {
		System.out.println("\n TC19_user clicking on the take a trial on bottom of home page is redirects to the related page\n" );
		sleep();
		try {
			boolean takeTrialpage = driver.findElement(By.xpath("//h1[text()='Prolaborate Trial']")).isDisplayed();
			if (takeTrialpage) {
				System.out.println("Take a Trial page properly visible");
				XLdata.pass(xlfile, sheet2, 19, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Take a Trial page properly not visible");
			XLdata.fail(xlfile, sheet2, 19, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag20
	
	@When("^User click on the forgot password link$")
	public void user_click_on_the_forgot_password_link() throws Throwable {
	    sleep();
	    driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
	}

	@Then("^User should see forgot password page$")
	public void user_should_see_forgot_password_page() throws Throwable {
		System.out.println("\n TC20_user clicking on forgot password link is redirect to the related page \n" );
		sleep();
		if (driver.getPageSource().contains("Forgot Your Account Password")) {
			System.out.println("Forgot password page is visible properly");
			XLdata.pass(xlfile, sheet2, 20, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Forgot password page is not visible");
			XLdata.fail(xlfile, sheet2, 20, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag21
	
	@When("^User click on blog post link$")
	public void user_click_on_blog_post_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("//a[text()='blog post ']")).click();
	}

	@Then("^User should see blog post link related page$")
	public void user_should_see_blog_post_link_related_page() throws Throwable {
		System.out.println("\n TC21_check if user clicking on blog post link from setup poc form page is redirect to the related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Cloud Proof of Concept']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 21, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 21, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag22
	
	@Then("^User click preview ea diagram link$")
	public void user_click_preview_ea_diagram_link() throws Throwable {
	    sleep();
	    driver.findElement(By.xpath("(//a[text()='Click here'])[1]")).click();
	}

	@Then("^User should see prolaborate ea digaram page$")
	public void user_should_see_prolaborate_ea_digaram_page() throws Throwable {
		System.out.println("\n TC22_check if user clicking on preview ea diagram link is redirect to related page \n" );
		sleep();
		try {
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			if (driver.getCurrentUrl().contains("prolaborate.com")) {
				System.out.println("Clicked link related page is visible properly");
				XLdata.pass(xlfile, sheet2, 22, 2);
				System.out.println("***Test case pass***");
			}else {
				System.out.println("Clicked link related page is not visible properly");
				XLdata.fail(xlfile, sheet2, 22, 2);
				System.out.println("***Test case fail***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not open");
			XLdata.fail(xlfile, sheet2, 22, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag23
	
	@Then("^User click preview model link$")
	public void user_click_preview_model_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("(//a[text()='Click here'])[2]")).click();
	}

	@Then("^User should see prolaborate model page$")
	public void user_should_see_prolaborate_model_page() throws Throwable {
		System.out.println("\n TC23_check if user clicking on preview model link is redirect to related page \n" );
		sleep();
		try {
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			if (driver.getCurrentUrl().contains("prolaborate.com")) {
				System.out.println("Clicked link related page is visible properly");
				XLdata.pass(xlfile, sheet2, 23, 2);
				System.out.println("***Test case pass***");
			}else {
				System.out.println("Clicked link related page is not visible properly");
				XLdata.fail(xlfile, sheet2, 23, 2);
				System.out.println("***Test case fail***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not open");
			XLdata.fail(xlfile, sheet2, 23, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag24
	
	@Then("^User click preview dashboard link$")
	public void user_click_preview_dashboard_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("(//a[text()='Click here'])[3]")).click();
	}

	@Then("^User should see prolaborate dashboard page$")
	public void user_should_see_prolaborate_dashboard_page() throws Throwable {
		System.out.println("\n TC24_check if user clicking on preview dashboard link is redirect to related page \n" );
		sleep();
		try {
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			if (driver.getCurrentUrl().contains("prolaborate.com")) {
				System.out.println("Clicked link related page is visible properly");
				XLdata.pass(xlfile, sheet2, 24, 2);
				System.out.println("***Test case pass***");
			}else {
				System.out.println("Clicked link related page is not visible properly");
				XLdata.fail(xlfile, sheet2, 24, 2);
				System.out.println("***Test case fail***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not open");
			XLdata.fail(xlfile, sheet2, 24, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag25
	
	@Then("^User click preview my diagrams link$")
	public void user_click_preview_my_diagrams_link() throws Throwable {
		sleep();
	    driver.findElement(By.xpath("(//a[text()='Click here'])[4]")).click();
	}

	@Then("^User should see prolaborate my diagrams page$")
	public void user_should_see_prolaborate_my_diagrams_page() throws Throwable {
		System.out.println("\n TC25_check if user clicking on preview my diagrams link is redirect to related page \n" );
		sleep();
		try {
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			if (driver.getCurrentUrl().contains("prolaborate.com")) {
				System.out.println("Clicked link related page is visible properly");
				XLdata.pass(xlfile, sheet2, 25, 2);
				System.out.println("***Test case pass***");
			}else {
				System.out.println("Clicked link related page is not visible properly");
				XLdata.fail(xlfile, sheet2, 25, 2);
				System.out.println("***Test case fail***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not open");
			XLdata.fail(xlfile, sheet2, 25, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag26
	
	@When("^User click on start here link$")
	public void user_click_on_start_here_button() throws Throwable {
	   p = new PojoClass();
	   p.getStart_here().click();
	}

	@Then("^User should see start here home page$")
	public void user_should_see_start_here_home_page() throws Throwable {
		System.out.println("\n TC26_check if user clicking on start here is redirects to the start here home page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='Start Here']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 26, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 26, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag27
	
	@When("^User click on customers link$")
	public void user_click_on_customers_link() throws Throwable {
	    p = new PojoClass();
	    p.getCustomers().click();
	}

	@Then("^User should see customers home page$")
	public void user_should_see_customers_home_page() throws Throwable {
		System.out.println("\n TC27_check if user clicking on customers is redirects to the Customers home page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='Customers']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 27, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 27, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag28
	
	@When("^User click on resources link$")
	public void user_click_on_resources_link() throws Throwable {
		p = new PojoClass();
	    p.getResources().click();
	}

	@Then("^User should see resources home page$")
	public void user_should_see_resources_home_page() throws Throwable {
		System.out.println("\n TC28_check if user clicking on Resources is redirects to the Resources home page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='Resources']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 28, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 28, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag29
	
	@When("^User click on get started with ea cloud link from float menu$")
	public void user_click_on_get_started_with_ea_cloud_link_from_float_menu() throws Throwable {
		sleep();
		scroll(driver.findElement(By.xpath("//span[contains(text(),'Getting started')]")));
		sleep();
		driver.findElement(By.xpath("//a[contains(text(),'Get Started with EA Cloud')]")).click();
	}

	@Then("^User should see get started with ea cloud related page$")
	public void user_should_see_get_started_with_ea_cloud_related_page() throws Throwable {
		System.out.println("\n TC29_check if user clicking on get started with ea cloud from float menu is redirects to the related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Purchase EA Cloud']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 29, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 29, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag30
	
	@When("^User click on get started with prolaborate link from float menu$")
	public void user_click_on_get_started_with_prolaborate_link_from_float_menu() throws Throwable {
		sleep();
		scroll(driver.findElement(By.xpath("//span[contains(text(),'Getting started')]")));
		sleep();
		driver.findElement(By.xpath("//a[contains(text(),'Get Started with Prolaborate')]")).click();
	}

	@Then("^User should see get started with prolaborate related page$")
	public void user_should_see_get_started_with_prolaborate_related_page() throws Throwable {
		System.out.println("\n TC30_check if user clicking on get started with prolaborate from float menu is redirects to the related page\n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()='Purchase Prolaborate']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 30, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 30, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag31
	
	@When("^User click on contact us link from float menu$")
	public void user_click_on_contact_us_link_from_float_menu() throws Throwable {
		sleep();
		scroll(driver.findElement(By.xpath("//span[contains(text(),'Getting started')]")));
		sleep();
		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
	}

	@Then("^User should see contact us related page$")
	public void user_should_see_contact_us_related_page() throws Throwable {
		System.out.println("\n TC31_check if user clicking on contact us from float menu is redirects to the related page\n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[text()=' Contact Us']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 31, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 31, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag32
	
	@Then("^User enter the valid details in purchase form$")
	public void user_enter_the_valid_details_in_purchase_form() throws Throwable {
		sleep();
	    p = new PojoClass();
	    String name = XLdata.getStringCellData(xlfile, sheet1, 2, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 2, 1);
	    String companyName = XLdata.getStringCellData(xlfile, sheet1, 2, 4);
	    sleep();
	    
	    p.getCloudName().sendKeys(name);
	    p.getEmail().sendKeys(email);
	    p.getOrganisationName().sendKeys(companyName);
	    driver.findElement(By.id("float_pcs_yes")).click();
	    driver.findElement(By.id("load_pcs_yes")).click();
	}
	
	@Then("^User click on Submit button in purchase$")
	public void user_click_on_Submit_button_in_purchase() throws Throwable {
	    driver.findElement(By.id("btnSub")).click();
	}

	@Then("^User should see thank you success message$")
	public void user_should_see_thank_you_success_message() throws Throwable {
		System.out.println("\n TC32_check if the purchase ea cloud rquest successfully  sended \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h2[contains(text(),'Thank you!')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Purchase form successfully sent");
				XLdata.pass(xlfile, sheet2, 32, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Purchase form successfully not sent");
			XLdata.fail(xlfile, sheet2, 32, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag33
	
	@Then("^User enter the valid details in purchase prolaborate form$")
	public void user_enter_the_valid_details_in_purchase_prolaborate_form() throws Throwable {
		sleep();
	    p = new PojoClass();
	    String name = XLdata.getStringCellData(xlfile, sheet1, 2, 0);
		String email = XLdata.getStringCellData(xlfile, sheet1, 2, 1);
	    String companyName = XLdata.getStringCellData(xlfile, sheet1, 2, 4);
	    
	    p.getName().sendKeys(name);
	    p.getEmail().sendKeys(email);
	    p.getOrganisationName().sendKeys(companyName);
	}

	@Then("^User click on Submit button in purchase prolaborate$")
	public void user_click_on_Submit_button_in_purchase_prolaborate() throws Throwable {
		 driver.findElement(By.id("buttonsub")).click();
	}

	@Then("^User should see thank you success message purchase prolaborate$")
	public void user_should_see_thank_you_success_message_purchase_prolaborate() throws Throwable {
		System.out.println("\n TC33_check if the purchase prolaborate rquest successfully  sended \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h2[contains(text(),'Thank you. We are delighted!')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Purchase form successfully sent");
				XLdata.pass(xlfile, sheet2, 33, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Purchase form successfully not sent");
			XLdata.fail(xlfile, sheet2, 33, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag34
	
	@Then("^User click on features view button$")
	public void user_click_on_features_view_button() throws Throwable {
	    driver.findElement(By.xpath("(//a[contains(text(),'View')])[1]")).click();
	}

	@Then("^User should see features related page$")
	public void user_should_see_features_related_page() throws Throwable {
		System.out.println("\n TC34_check if user clicking on features from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Maximize the value of Enterprise Architecture')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 34, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 34, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag35
	
	@Then("^User click on pricing view button$")
	public void user_click_on_pricing_view_button() throws Throwable {
		 driver.findElement(By.xpath("(//a[contains(text(),'View')])[2]")).click();
	}

	@Then("^User should see pricing related page$")
	public void user_should_see_pricing_related_page() throws Throwable {
		System.out.println("\n TC35_check if user clicking on pricing from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'PICK A PLAN ')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 35, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 35, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag36
	@Then("^User click on tour view button$")
	public void user_click_on_tour_view_button() throws Throwable {
		 driver.findElement(By.xpath("(//a[contains(text(),'View')])[3]")).click();
	}

	@Then("^User should see tour related page$")
	public void user_should_see_tour_related_page() throws Throwable {
		System.out.println("\n TC36_check if user clicking on tour from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Take a Tour')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 36, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 36, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag37
	
	@Then("^User click on prolaborate on premises view button$")
	public void user_click_on_prolaborate_on_premises_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[4]")).click();
	}

	@Then("^User should see prolaborate on premises related page$")
	public void user_should_see_prolaborate_on_premises_related_page() throws Throwable {
		System.out.println("\n TC37_check if user clicking on prolaborate on premises from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Prolaborate on Premises')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 37, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 37, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag38
	
	@Then("^User click on cloud platfrom view button$")
	public void user_click_on_cloud_platfrom_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[5]")).click();
	}

	@Then("^User should see cloud platfrom related page$")
	public void user_should_see_cloud_platfrom_related_page() throws Throwable {
		System.out.println("\n TC38_check if user clicking on cloud platfrom from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//h1[contains(text(),'Sparx Cloud Platform')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 38, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 38, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag39
	
	@Then("^User click on ea saas view button$")
	public void user_click_on_ea_saas_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[6]")).click();
	}

	@Then("^User should see ea saas related page$")
	public void user_should_see_ea_saas_related_page() throws Throwable {
		System.out.println("\n TC39_check if user clicking on ea saas from start here home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Enterprise Architect SaaS')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 39, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 39, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag40
	
	@Then("^User click on articles view button$")
	public void user_click_on_articles_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[1]")).click();
	}

	@Then("^User should see articles related page$")
	public void user_should_see_articles_related_page() throws Throwable {
		System.out.println("\n TC40_check if user clicking on articles from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Articles')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 40, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 40, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag41
	
	@Then("^User click on  release notes view button$")
	public void user_click_on_release_notes_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[2]")).click();
	}

	@Then("^User should see  release notes related page$")
	public void user_should_see_release_notes_related_page() throws Throwable {
		System.out.println("\n TC41_check if user clicking on release notes from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='Release Notes']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 41, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 41, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}

	//tag42
	
	@Then("^User click on third version documentation view button$")
	public void user_click_on_third_version_documentation_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'Explore')])[1]")).click();
	}

	@Then("^User should see third version documentation related page$")
	public void user_should_see_third_version_documentation_related_page() throws Throwable {
		System.out.println("\n TC42_check if user clicking on v3 documentation from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='V3 Documentation']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 42, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 42, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag43
	
	@Then("^User click on fourth version documentation view button$")
	public void user_click_on_fourth_version_documentation_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'Explore')])[2]")).click();
	}

	@Then("^User should see fourth version documentation related page$")
	public void user_should_see_fourth_version_documentation_related_page() throws Throwable {
		System.out.println("\n TC43_check if user clicking on v4 documentation from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='V4 documentation']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 43, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 43, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}

	//tag44
	
	@Then("^User click on prolaborate FAQ view button$")
	public void user_click_on_prolaborate_FAQ_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[3]")).click();
	}

	@Then("^User should see prolaborate FAQ related page$")
	public void user_should_see_prolaborate_FAQ_related_page() throws Throwable {
		System.out.println("\n TC44_check if user clicking on prolaborate FAQ from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[text()='FAQ']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 44, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 44, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}

	//tag45
	
	@Then("^User click on events view button$")
	public void user_click_on_events_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[4]")).click();
	}

	@Then("^User should see events related page$")
	public void user_should_see_events_related_page() throws Throwable {
		System.out.println("\n TC45_check if user clicking on events from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[@class='video-ads-text bold']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 45, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 45, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}

	//tag46
	
	@Then("^User click on videos view button$")
	public void user_click_on_videos_view_button() throws Throwable {
		driver.findElement(By.xpath("(//a[contains(text(),'View')])[5]")).click();
	}

	@Then("^User should see videos related page$")
	public void user_should_see_videos_related_page() throws Throwable {
		System.out.println("\n TC46_check if user clicking on videos from resources home page is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//a[@href='#Features-tab']")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicked link related page is visible");
				XLdata.pass(xlfile, sheet2, 46, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicked link related page is not visible");
			XLdata.fail(xlfile, sheet2, 46, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag47
	
	@When("^User scroll down the page$")
	public void user_scroll_down_the_page() throws Throwable {
	    sleep();
	    WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Take a look')]"));
	    scroll(element);
	}

	@Then("^User should see request quote popup$")
	public void user_should_see_request_quote_popup() throws Throwable {
		System.out.println("\n TC47_check if user scroll down in ea saas page request a quote popup is visible or not \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//div[@id='floatMenu']//following::a[contains(text(),'Request a Quote')]")).isDisplayed();
			if (pagehead) {
				System.out.println("popup is visible");
				XLdata.pass(xlfile, sheet2, 47, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("popup is not visible");
			XLdata.fail(xlfile, sheet2, 47, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	}
	
	//tag48
	
	@When("^User click request a quote link from popup$")
	public void user_click_request_a_quote_link_from_popup() throws Throwable {
		sleep();
		driver.findElement(By.xpath("//div[@id='floatMenu']//following::a[contains(text(),'Request a Quote')]")).click();
	    
	}

	@Then("^User should see request quote related page$")
	public void user_should_see_request_quote_related_page() throws Throwable {
		System.out.println("\n TC48_check if user clicking on popup request a quote link is redirect to related page \n" );
		sleep();
		try {
			boolean pagehead = driver.findElement(By.xpath("//span[contains(text(),'Request for a Custom Quote')]")).isDisplayed();
			if (pagehead) {
				System.out.println("Clicking link is redirect to related page properly");
				XLdata.pass(xlfile, sheet2, 48, 2);
				System.out.println("***Test case pass***");
			}
		} catch (Exception e) {
			System.out.println("Clicking link is redirect to related page not properly");
			XLdata.fail(xlfile, sheet2, 48, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	    
	}
	
//tag49
	
	@Then("^User click on latest version$")
	public void user_click_on_latest_version() throws Throwable {
	    
	  driver.findElement(By.xpath("(//li//h4)[1]")).click();//click latest version
	  sleep();
	}

	@Then("^User click Request Installer button$")
	public void user_click_Request_Installer_button() throws Throwable {
		
		WebElement reqInstaller = driver.findElement(By.xpath("//a[@data-target='#requestInstaller']"));
		sleep();
		mouseHover(reqInstaller);
	    reqInstaller.click();
	    sleep();
	  
	}

	@Then("^User enter vaild details in request installer form$")
	public void user_enter_vaild_details_in_request_installer_form() throws Throwable {
		p = new PojoClass();
	    p.getRequestInstallerName().sendKeys("test");
	    p.getRequestInstallerMail().sendKeys("test@mail.com");
	    p.getRequestInstallerOrgName().sendKeys("test pvt");
	    Select objSelect =new Select(driver.findElement(By.id("pcsversion")));
	    objSelect.selectByIndex(1);
	    Select objSelect1 =new Select(driver.findElement(By.id("DatabaseType")));
	    objSelect1.selectByIndex(2);
	    Select objSelect2 =new Select(driver.findElement(By.id("Prolaborate_version")));
	    objSelect2.selectByIndex(3);
	  
	}

	@Then("^User should see thankyou Message for request installer submit$")
	public void user_should_see_thankyou_Message_for_request_installer_submit() throws Throwable {
		System.out.println("\n check if the prolaborate book a demo request successfully  sended from the release-notes page \n" );
		sleep();
		if (driver.getPageSource().contains("Thank you for your interest!")) {
			System.out.println("Request Installer request form successfully sent");
			XLdata.pass(xlfile, sheet2, 49, 2);
			System.out.println("***Test case pass***");
		}else {
			System.out.println("Request Installer request form NOT sent");
			XLdata.fail(xlfile, sheet2, 49, 2);
			System.out.println("***Test case fail***");
		}
		quit();
	  
	}
	
	
}
