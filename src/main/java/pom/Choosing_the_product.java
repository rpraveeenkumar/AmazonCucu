package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Choosing_the_product {
	
	public WebDriver driver;
	
	public Choosing_the_product(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBar;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement search;
	
	@FindBy (xpath = "//span[.='OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage)']")
	private WebElement product;
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getProduct() {
		return product;
	}
	
}
