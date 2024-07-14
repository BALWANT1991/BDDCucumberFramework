package stepDefinitions;

import io.cucumber.java.After; 
import io.cucumber.java.Before;

public class CucmberHooks {
	
	@Before ("@Netbanking")
	public void netBanking() {
		System.out.println("***************************");
		System.out.println("Refresh the Browser");
	}
	
	@After
	public void teardown() {
		System.out.println("Tear Down");
		
	}
	
	
	@Before ("@Mortage")
	public void mortage() {
		System.out.println("***************************");
		System.out.println("Refresh the Browser");
	}

}
