package org.cucumber.maven.MavenCucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass;

public class DemoPage extends BaseClass {

	public DemoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name_3_firstname")
	private WebElement fName;
	
	@FindBy(id="name_3_lastname")
	private WebElement lName;
	
	@FindBy(xpath="//input[@value='married']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@value='cricket ']")
	private WebElement cricket;
	
	@FindBy(xpath="//input[@value='dance']")
	private WebElement dance;
	
	@FindBy(id ="dropdown_7")
	private WebElement country;
	
	@FindBy(id="mm_date_8")
	private WebElement mon;
	
	@FindBy(id="dd_date_8")
	private WebElement date;
	
	@FindBy(id="yy_date_8")
	private WebElement year;
	
	@FindBy(id="phone_9")
	private WebElement mobile;
	
	@FindBy(id="username")
	private WebElement uName;
	
	@FindBy(id="email_1")
	private WebElement eMail;
	
	@FindBy(id="profile_pic_10")
	private WebElement profile;
	
	@FindBy(id="description")
	private WebElement aboutMe;
	
	@FindBy(id="password_2")
	private WebElement pass;
	
	@FindBy(id="confirm_password_password_2")
	private WebElement confirm;
	
	@FindBy(id="//input[@value='Submit']")
	private WebElement submit;

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCricket() {
		return cricket;
	}

	public WebElement getDance() {
		return dance;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getAboutMe() {
		return aboutMe;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
