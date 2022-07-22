package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@data-nav-role='signin'])[1]")
	private WebElement singin;
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement username;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement conti;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement login;

	public Login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSingin() {
		return singin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}


}
