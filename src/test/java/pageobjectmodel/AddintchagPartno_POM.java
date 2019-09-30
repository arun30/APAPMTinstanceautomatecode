package pageobjectmodel;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class AddintchagPartno_POM extends Baseclass{
	
	public AddintchagPartno_POM() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	public WebElement emaster;
	
	@FindBy(xpath ="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_2_lnkLink3_1']")
	public WebElement eInterchangepart;
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	WebElement eAddintpartBtn;
	
	@FindBy(xpath="//select[@id='MainContent_drpCompetitorAdd']")
	WebElement eIntnameDDBox;
	
	@FindBy(xpath="//input[@id='MainContent_txtCompetitorPartno']")
	WebElement eIntnamePartTbox;
	
	@FindBy(xpath="//select[@id='MainContent_drpQualityGradeLevel']")
	WebElement eGradeLevelDDBox;
	
	@FindBy(xpath="//select[@id='MainContent_drpInterchangeTypeCode']")
	WebElement eTypeCodeDDBox;
	
	@FindBy(xpath="//input[@id='MainContent_txtInternalNotes']")
	WebElement eInternalNotes;
	
	@FindBy(xpath="//input[@id='MainContent_txtInterchangeNotes']")
	WebElement eInterchangeNotes;
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	

	public void clickonInterchangePart() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(emaster).build().perform();
		Thread.sleep(3000);
		eInterchangepart.click();
		Thread.sleep(5000);
	}
	
	public void clickAdd() throws InterruptedException {
		eAddintpartBtn.click();
		Thread.sleep(3000);
		
	}
	public void EnterIntName(String IntchgNameValue4DBox) throws InterruptedException {
		Select intName = new Select(eIntnameDDBox);
		intName.selectByVisibleText(IntchgNameValue4DBox);
		Thread.sleep(3000);
	}
	public void EnterIntchgpartValue(String interchangepartno) throws InterruptedException {
		eIntnamePartTbox.sendKeys(interchangepartno);
		Thread.sleep(3000);
	}
	public void SelectGradeLevel(String GradeLevelValue) throws InterruptedException {

		Select GradeLevel = new Select(eGradeLevelDDBox);
		GradeLevel.selectByVisibleText(GradeLevelValue);
		Thread.sleep(3000);
	}
	public void SelectTypeCode(String TypeCodeValue) throws InterruptedException {
		eTypeCodeDDBox.sendKeys(TypeCodeValue);
		Select TypeCode = new Select(eTypeCodeDDBox);
		TypeCode.selectByVisibleText(TypeCodeValue);
		Thread.sleep(3000);
	}
	public void EnterInternalNotes(String InternalNotesValue) {
		eInternalNotes.sendKeys(InternalNotesValue);
	}
	public void EnterInterchangeNotes(String InterchangeNotesValue) {
		eInterchangeNotes.sendKeys(InterchangeNotesValue);
	}
	
	public void Clicksave() throws InterruptedException {
		eSaveButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}
	
}




