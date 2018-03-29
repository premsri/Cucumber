package stepdefinition;

import java.util.List;
import java.util.Map;

import org.cucumber.maven.MavenCucumber.DemoPage;
import org.junit.Assert;
import org.openqa.selenium.By;

import baseclass.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoqaStep extends BaseClass {

	 DemoPage d = null;
	
	public  void getInstance() {
		if (d==null) {
			d= new DemoPage();
		}
	}
	
	@Given("^User register in demoqa page$")
	public void user_register_in_demoqa_page() {
		
		driver.navigate().to("http://demoqa.com/registration/");
		

	}

	@When("^User enter text \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_text_and(String fname, String lname) {
		getInstance();
		sendText(d.getfName(), fname);
		sendText(d.getlName(), lname);

	}

	@When("^User enter another text \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_another_text_and(String mobile, String username) {
		sendText(d.getMobile(), mobile);
		sendText(d.getuName(), username);
	}

	@When("^User enter about \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_about_and(String about, String email) {
		sendText(d.getAboutMe(), about);
		sendText(d.geteMail(), email);
	}

	@When("^User enter pass \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_pass_and(String pass, String againpass) {
		sendText(d.getPass(), pass);
		sendText(d.getConfirm(), againpass);
		
	}
	
	

	@Then("^User verifies text \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_verifies_text_and(String fname, String lname) {
		Assert.assertTrue(d.getfName().getAttribute("value").equals(fname));
		Assert.assertTrue(d.getlName().getAttribute("value").equals(lname));
	}

	@Then("^User verifies another text \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_verifies_another_text_and(String mobile, String username) {
		Assert.assertEquals(mobile, d.getMobile().getAttribute("value"));
		Assert.assertEquals(username, d.getuName().getAttribute("value"));
	}

	@Then("^User verifies about \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_verifies_about_and(String about, String email) {
		Assert.assertTrue(d.getAboutMe().getAttribute("value").equals(about));
		Assert.assertTrue(d.geteMail().getAttribute("value").equals(email));
	}

	@Then("^User verifies pass \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_verifies_pass_and(String pass, String againpass) {
		Assert.assertTrue(d.getPass().getAttribute("value").equals(pass));
		Assert.assertTrue(d.getConfirm().getAttribute("value").equals(againpass));
	}

	@When("^User radio and checkbox click$")
	public void user_radio_and_checkbox_click() {
	   getInstance();
	   click(d.getRadio());
	   click(d.getCricket());
	   click(d.getDance());
	}

	@Then("^User verifies radio and checkbox selected$")
	public void user_verifies_radio_and_checkbox_selected() {
	    Assert.assertTrue(d.getRadio().isSelected());
	    Assert.assertTrue(d.getCricket().isSelected());
	    Assert.assertTrue(d.getDance().isSelected());
	}

	@When("^User select dropdown$")
	public void user_select_dropdown(DataTable data) {
	 getInstance();
	List<Map<String,String>> asMaps = data.asMaps(String.class, String.class);
	  dropDown(d.getCountry(), asMaps.get(0).get("Country"));
	  dropDown(d.getDate(), asMaps.get(0).get("Date"));
	  dropDown(d.getMon(), asMaps.get(0).get("Month"));
	  dropDown(d.getYear(), asMaps.get(0).get("Year"));
	}

	@Then("^User click verifies is selected$")
	public void user_click_verifies_is_selected() {
	   Assert.assertTrue(d.getCountry().getAttribute("value").equals("India"));
	}
}
