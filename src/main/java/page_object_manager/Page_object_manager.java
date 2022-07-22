package org.page_object_manager;

import org.openqa.selenium.WebDriver;
import org.pom.Cart_TakingSnip;
import org.pom.Choosing_the_product;
import org.pom.Login_page;

public class Page_object_manager {
	
	public WebDriver driver;
	
	public Page_object_manager(WebDriver driver2) {
		this.driver=driver2;
	}

	private Login_page lp;
	
	public Login_page getInstancelp() {
		if (lp==null) {
			lp=new Login_page(driver);
		}
		return lp;
	}
	
	private Choosing_the_product ctp;
	
	public Choosing_the_product getInstanceCtp() {
		if (ctp==null) {
			ctp=new Choosing_the_product(driver);
		}
		return ctp;
	}
	
	private Cart_TakingSnip cts;
	
	public Cart_TakingSnip getInstancects() {
		if (cts==null) {
			cts=new Cart_TakingSnip(driver);
		}
		return cts;
	}
}
