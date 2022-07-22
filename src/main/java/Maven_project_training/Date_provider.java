package com.Maven_project_training;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Date_provider {
	
	@Test (dataProvider = "cred")
	public void login(String username, String password) {
		System.out.println(username);
		System.out.println(password);

	}
	
	@DataProvider (name = "cred")
	public Object[][] credentials() {
		
		return new Object[][] {
			{"praveen","123456"},
			{"kumar","654321"},
			{"rpk","895623"}
		};
	}

}
