package pageobjectmodel;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import utility.Baseclass;



public class Partdescription_POM extends Baseclass {

	
	public Partdescription_POM() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
	private WebElement partspageheaderclick;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_txtMelling']")
	private WebElement txtpartsearch;
	
	
	@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
	private WebElement btnPsearch;
	
	//div[@id='Description']
	@FindBy(xpath="//div[@id='Description']")
	private WebElement partdescclick;
	
	
	
	@FindBy(xpath="//select[@id='MainContent_drpSProductLine']")
	private WebElement drpNotesType;
	
	
	
	@FindBy(xpath="//select[@id='MainContent_drpNotesType']")
	private WebElement drpNotesType1;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtNotes']")
	private WebElement txtNotes;
	
	
	@FindBy(xpath="//td[@class='pad_top_15']")
	private WebElement clk;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement btnSave;
	
	
	
	@FindBy(xpath="//input[@id='MainContent_gv_imgEdit_0']")
	private WebElement imgEdit_0;
	
	
	@FindBy(xpath="//input[@id='MainContent_gv_imgDelete_0']")
	private WebElement imgDelete_0;
	
	
	
	
	public void partslanding() {
		partspageheaderclick.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	public void partsearch(String partnoenter) throws InterruptedException {
		
		txtpartsearch.sendKeys(partnoenter);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ACBehavior_completionListElem']//li"));
		System.out.println("total number of parts-->" + list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Testpart-1 | Ignition Test | Autoapa")) {
				list.get(i).click();
				break;
			}
		}
		btnPsearch.click();
		Thread.sleep(3000);
	}
	
	
	public void descriptionclick() throws InterruptedException {
		partdescclick.click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
	}
	/*
	public void descdrop1() throws InterruptedException {
		
		WebElement descnotes = drpNotesType;
		Select select = new Select(descnotes);
		select.selectByValue("1");
		Thread.sleep(2000);
	}*/
	
	
	public void descriptiondrpdownnotes() throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement descnote = drpNotesType1;
		Select select = new Select(descnote);
		select.selectByVisibleText(pro.getProperty("notestype"));
		Thread.sleep(2000);
	}
	
	
	public void descriptionadd(String notes) {
		txtNotes.sendKeys(notes);
		
	}
	
	
	public void savebtn() throws InterruptedException {
		btnSave.click();
		Thread.sleep(3000);
	}
	
	
	
	
	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Parts Related " + "Description Notes" + alert.getText());
		alert.accept();
		Thread.sleep(3000);
		
	}
	
	
	
	
	public void editpartdesc(String editnotes) throws Exception {
		driver.switchTo().frame(0);
		imgEdit_0.click();
		Thread.sleep(2000);
		txtNotes.sendKeys(editnotes);
		
	}
	
	
	public void deletepartdesc() throws Exception {
		driver.switchTo().frame(0);
		imgDelete_0.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
}
