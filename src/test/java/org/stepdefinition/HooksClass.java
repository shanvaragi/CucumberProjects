package org.stepdefinition;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass  extends BaseClass{
	//	After and Before HookCalss
	//	@Before
	//	public void beforeScenario() {
	//		System.out.println("Scenario To Start");
	//		launchChrome();
	//		loadUrl("https://www.facebook.com/");
	//		winmax();
	//
	//	}
	//	@After
	//	public void AeforeScenario() {
	//		closebrouserchrome();
	//		System.out.println("Scenario Ends");
	//		
	//
	//	}


	@Before(order=1)
	public void beforeScenario() {
		System.out.println("Scenario To Start");
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winmax();

	}
	@After(order=1)
	public void AeforeScenario() {
		closebrouserchrome();
		System.out.println("Scenario Ends");


	}
	@Before(order=2)
	public void starTime() {
		System.out.println(new Date());
		

	}
	@After(order=2)
	public void endTime() {
		System.out.println(new Date());
		

	}
	@Before(order=3)
	public void beforeSec() {
		System.out.println("Before Testimg");

	}
	@After(order=3)
	public void AfterSec(Scenario s) throws IOException {
//	String name = s.getName();
//	String fileName = name.replace(" ", "_");
//	screenShot(fileName);
		
		if (s.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			
		}
		
		
		
		
		System.out.println("After Testimg");

	}

}
