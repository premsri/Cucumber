package stepdefinition;

import org.junit.Before;

import baseclass.BaseClass;
import cucumber.api.java.After;

public class Hooks extends BaseClass {

	@cucumber.api.java.Before
	public void launch() {
		launchBrowser("https://www.google.co.in/");
	}
	
	@After
	public void quitB() {
		quit();
	}
}
