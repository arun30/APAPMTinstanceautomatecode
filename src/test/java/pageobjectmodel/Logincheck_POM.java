package pageobjectmodel;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;

public class Logincheck_POM extends Baseclass {

	
	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	private WebElement txtusername;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	WebElement btnlogin;
	
	public Logincheck_POM() {
		//this.ldriver=rdriver;
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	public void logindetails(String username, String pwd) {
		txtusername.sendKeys(username);
		txtpassword.sendKeys(pwd);
		btnlogin.click();
	
	}
}
