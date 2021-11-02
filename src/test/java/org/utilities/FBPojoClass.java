package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FBPojoClass extends BaseClass {

	//default constructor
	public FBPojoClass() {

		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="a077aa5e")
	private WebElement farme;
	public WebElement getFarme() {
		return farme;
	}
	
	//AND Operator All Values are same
	@CacheLookup
	@FindBys({
		@FindBy(id="email"),
		@FindBy(xpath="//input[@type='text']")

	})
	//@FindBy(id="email")
	private WebElement txtuser;

	//OR Operator
	@CacheLookup
	@FindAll({
		@FindBy(id="pass"),
		@FindBy(name="pass"),
		@FindBy(xpath="//input[@type='passworfgd']")

	})
	private WebElement txtpass;
	@CacheLookup
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnclick;
	//covert gultter and sluttter methods

	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	@CacheLookup
	@FindBy(xpath="//img[@src='Jmeter720.png']")
	private WebElement imgclick1;
	public WebElement getImgclick() {
		return imgclick1;
	}
}
	
