package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_TakingSnip {
	
	public WebDriver driver;
	
	public Cart_TakingSnip(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//form[@id='attach-view-cart-button-form']")
	private WebElement viewcart;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement delete;
	
	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	public WebElement getDelete() {
		return delete;
	}

}
