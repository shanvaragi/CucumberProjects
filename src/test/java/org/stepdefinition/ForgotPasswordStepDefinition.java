package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ForgotPasswordStepDefinition extends BaseClass {
	@Given("The user should launch the chrome browsers")
	public void theUserShouldLaunchTheChromeBrowsers() {
		
	    
	}

	@When("The user should type the Url")
	public void theUserShouldTypeTheUrl() {
		
	    
	    
	}

	@When("The user should maxmize the Window")
	public void theUserShouldMaxmizeTheWindow() {
		
	    
	    
	}

	@When("The user should click the forgot password link")
	public void theUserShouldClickTheForgotPasswordLink() {
	    
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
	    
	}

	@When("The user should nagvigate to find your account page")
	public void theUserShouldNagvigateToFindYourAccountPage() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("verify the FB accoynt page", current.endsWith("screen=0"));
		System.out.println("Account page verified");
		
	    
	    
	}

	@When("The user should type the registered mobile number or email id")
	public void theUserShouldTypeTheRegisteredMobileNumberOrEmailId() {
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("1234123412");
	    
	    
	}

	@When("The user should click the search button")
	public void theUserShouldClickTheSearchButton() {
		driver.findElement(By.xpath("//button[@id='did_submit']"));
	    
	    
	}

	@Then("The user should nagvigate to reset your password page")
	public void theUserShouldNagvigateToResetYourPasswordPage() {
	    
	    
	}


}
