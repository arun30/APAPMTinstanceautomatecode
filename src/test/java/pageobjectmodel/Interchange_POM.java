package pageobjectmodel;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class Interchange_POM extends Baseclass{

		
		public Interchange_POM() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
		private WebElement partspageheaderclick;
		
		
		
		@FindBy(xpath="//input[@id='MainContent_txtMelling']")
		private WebElement txtpartsearch;
		
		
		@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
		private WebElement btnPsearch;
		
		
		@FindBy(xpath="//div[@id='interchange']")
		private WebElement interchangeclick;
		
		
		@FindBy(xpath="//select[@id='MainContent_drpCompetitorName']")
		private WebElement drpCompetitorName;
		
		
		@FindBy(xpath="//input[@id='MainContent_txtCompetitorPartno1']")
		private WebElement txtCompetitorPartno1;
		
		
		
		@FindBy(xpath="//input[@id='MainContent_btnSave']")
		private WebElement btnSave;
		
		
		
		@FindBy(xpath="//tr[@class='odd']//input[@id='MainContent_ImageButton1']")
		private WebElement imgEdit_0;
		
		
		@FindBy(xpath="//tr[@class='odd']//input[@id='MainContent_ImageButton2']")
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
		
		
		public void interchangesclick() throws InterruptedException {
			interchangeclick.click();
			Thread.sleep(2000);
		}
		
		
		
		public void interchangedrpdownnotes() throws InterruptedException {
			driver.switchTo().frame(0);
			WebElement intnotesselect = drpCompetitorName ;
			Select select = new Select(intnotesselect);
			select.selectByValue("22");
			Thread.sleep(2000);
		}
		
		
		public void interchangenoteenter(String notes) {
			txtCompetitorPartno1.sendKeys(notes);
			
		}
		
		
		public void savebtn() throws InterruptedException {
			btnSave.click();
			Thread.sleep(2000);
		}
		
		
		
		
		/*
		 * alert accept & fetching text
		 */
		public void acceptAlert() throws InterruptedException{
			Alert alert = driver.switchTo().alert();
			//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
			System.out.println("Parts Related " + "Interchange" + alert.getText());
			alert.accept();
			Thread.sleep(2000);
		}
		
		
		
		
		public void editinterchange(String notes,String editnotes) throws InterruptedException {
			driver.switchTo().frame(0);
			imgEdit_0.click();
			Thread.sleep(2000);
			txtCompetitorPartno1.sendKeys(notes);
			txtCompetitorPartno1.sendKeys(editnotes);
			
		}
		
		
		public void deletepartinter() throws InterruptedException {
			driver.switchTo().frame(0);
			imgDelete_0.click();
			Thread.sleep(2000);
		}
		
		
		
		
	
		
		
		
		
}

