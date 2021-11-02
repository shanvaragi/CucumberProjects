package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utilities.BaseClass;
import org.utilities.FBPojoClass;

import io.cucumber.java.en.*;

public class FacebookLoginStepDefinition extends BaseClass {
	@Given("The user should launch the chrome browser")
	public void the_user_should_launch_the_chrome_browser() {
		

	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
		
	}

	@When("The user should maxmize the window")
	public void the_user_should_maxmize_the_window() {
		

	}

	@When("The user should type the invalid username and invalid password")
	public void the_user_should_type_the_invalid_username_and_invalid_password() throws IOException {
		FBPojoClass fb= new FBPojoClass();
		fill(fb.getTxtuser(), getData(0,1));
		fill(fb.getTxtpass(), getData(1,2));

	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
		FBPojoClass fb= new FBPojoClass();
		btnClick(fb.getBtnclick());
		Thread.sleep(3000);

	}

	@When("The user should get the title of the incorrect credential page")
	public void the_user_should_get_the_title_of_the_incorrect_credential_page() {

	}

	@Then("The user should naviage to incorrect credential page")
	public void the_user_should_naviage_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Verify The Page", currentUrl.contains("privacy"));
		System.out.println("the test case is passed");

	}
	//One Diamensioanl WithOut Header List Datatable
	//	@When("The user should type the invalid username and invalid passwords")
	//	public void the_user_should_type_the_invalid_username_and_invalid_passwords(io.cucumber.datatable.DataTable d) {
	////	    List<String> asList = d.asList();
	//		FBPojoClass fb= new FBPojoClass();
	//		fill(fb.getTxtuser(), d.asList().get(2));
	//		fill(fb.getTxtpass(), d.asList().get(1));
	//	}

	//Two Diamensioanl WithOut Header List Datatable

	//@When("The user should type the invalid username and invalid passwords")
	//public void the_user_should_type_the_invalid_username_and_invalid_passwords(io.cucumber.datatable.DataTable d) {
	//	FBPojoClass fb= new FBPojoClass();
	//	fill(fb.getTxtuser(), d.asLists().get(0).get(2));
	//	fill(fb.getTxtpass(), d.asLists().get(1).get(3));
	//}
	//One Diamensioanl With Header Map Datatable
//	@When("The user should type the invalid username and invalid passwords")
//	public void the_user_should_type_the_invalid_username_and_invalid_passwords(io.cucumber.datatable.DataTable d) {
//		Map<String, String> mp = d.asMap(String.class, String.class);
//		FBPojoClass fb= new FBPojoClass();
//		fill(fb.getTxtuser(), mp.get("User"));
//		fill(fb.getTxtpass(), mp.get("Passs"));
//	}
	@When("The user should type the invalid username and invalid passwords")
	public void theUserShouldTypeTheInvalidUsernameAndInvalidPasswords(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> mp = dataTable.asMaps();
	    FBPojoClass fb= new FBPojoClass();
	    fill(fb.getTxtuser(),mp.get(0).get("user"));
	    fill(fb.getTxtpass(),mp.get(2).get("last"));
	    
	    
	}
	@When("The user should type the invalid username{string} and invalid password{string}")
	public void the_user_should_type_the_invalid_username_and_invalid_password(String s1, String s2) throws IOException, InterruptedException {
		FBPojoClass fb= new FBPojoClass();
		fill(fb.getTxtuser(), s1);
		fill(fb.getTxtpass(), s2);
		Thread.sleep(3000);

	}

}
