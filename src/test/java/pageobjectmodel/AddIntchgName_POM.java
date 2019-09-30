package pageobjectmodel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Baseclass;


public class AddIntchgName_POM extends Baseclass{
	
	public AddIntchgName_POM() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_0']")
	public WebElement eInterchangeName;
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	WebElement eAddintnameBtn;
	
	@FindBy(xpath="//input[@id='MainContent_txtCompetitorName']")
	WebElement eIntnameTBox;
	
	@FindBy(xpath="//input[@id='MainContent_checkACESList_3']")
	WebElement eIntTypeName;
	
	@FindBy(xpath="//input[@id='MainContent_txtbrandname']")
	WebElement eBrandAAIAbox;
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eBlankpage;
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	public void clickonInterchangeName() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangeName.click();
		Thread.sleep(5000);
	}
	
	public void clickAdd() throws InterruptedException {
		eAddintnameBtn.click();
		Thread.sleep(3000);
		
	}
	public void EnterIntName(String InterchangeNameValue) throws InterruptedException {
		eIntnameTBox.sendKeys(InterchangeNameValue);
		Thread.sleep(3000);
	}
	public void clickIntTypeName() throws InterruptedException {
		eIntTypeName.click();
		Thread.sleep(3000);
	}
	public void EnterBrandAAIA(String BrandAAIAvalue) {
		eBrandAAIAbox.sendKeys(BrandAAIAvalue);
	}
	public void Clicksave() throws InterruptedException {
		eBlankpage.click();
		Thread.sleep(3000);
		eSaveButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}

}


