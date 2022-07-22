package com.Maven_project_training;

import org.openqa.selenium.WebDriver;
import org.page_object_manager.Page_object_manager;
import org.property_file.Configuration_reader;

public class Runner_amazon extends BaseClass {
	
	public static WebDriver driver = launchbrowser();
	public static Page_object_manager pom=new Page_object_manager(driver);

	public static void main(String[] args) throws Throwable {
		
		
		//launch url & login
		String url = Configuration_reader.getInstancecfr().getInstancefrm().geturl();
		launchUrl(url);
		clicktheElement(pom.getInstancelp().getSingin());
		String username = Configuration_reader.getInstancecfr().getInstancefrm().getusername();
		keytosend(pom.getInstancelp().getUsername(), username);
		clicktheElement(pom.getInstancelp().getConti());
		String password = Configuration_reader.getInstancecfr().getInstancefrm().getpassword();
		keytosend(pom.getInstancelp().getPassword(), password);
		clicktheElement(pom.getInstancelp().getLogin());
		
		//choosing the product
		String find = Configuration_reader.getInstancecfr().getInstancefrm().getfind();
		keytosend(pom.getInstanceCtp().getSearchBar(), find);
		clicktheElement(pom.getInstanceCtp().getSearch());
		clicktheElement(pom.getInstanceCtp().getProduct());
		switchtab();
		
		//add & remove 
		clicktheElement(pom.getInstancects().getAddtocart());
		Thread.sleep(5000);
		clicktheElement(pom.getInstancects().getViewcart());
		Thread.sleep(3000);
		String snip = Configuration_reader.getInstancecfr().getInstancefrm().getsnip();
		Snip(snip);
		clicktheElement(pom.getInstancects().getDelete());
		closewindow();
		quitbrowser();
	}
}
