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


public class Buyersguide_POM extends Baseclass {


			
			public Buyersguide_POM() {
				PageFactory.initElements(driver, this);
			}
				
			
			@FindBy(xpath="//a[@id='ucMenu_rptLevel1_lnkLink1_2']")
			private WebElement partspageheaderclick;
			
			
			
			@FindBy(xpath="//input[@id='MainContent_txtMelling']")
			private WebElement txtpartsearch;
			
			
			@FindBy(xpath="//input[@id='MainContent_btnPsearch']")
			private WebElement btnPsearch;
			
			
			@FindBy(xpath="//div[@id='BuyersGuid1']")
			private WebElement BuyersGuid1click;
			
			
			@FindBy(xpath="//select[@id='MainContent_drpVehicleType']")
			private WebElement drpVehicleType;
			
			
			@FindBy(xpath="//select[@id='MainContent_drpMake']")
			private WebElement drpMake;
			
			
			
			@FindBy(xpath="//select[@id='MainContent_drpModel']")
			private WebElement drpModel;
			
			
			@FindBy(xpath="//input[@id='MainContent_searchbtn']")
			private WebElement searchbtn;
			
			
			@FindBy(xpath="//input[@id='MainContent_GvApplications_chkActivee1_0']")
			private WebElement selectappln;
			

			
			@FindBy(xpath="//input[@id='MainContent_btnSave']")
			private WebElement btnSave;
			
			
			
			@FindBy(xpath="//tr[@id='tr_0']//input[@id='appartsedit_btn']")
			private WebElement appartsedit_btn;
			
			
			@FindBy(xpath="//textarea[@id='MainContent_GvApplications_txtapppartsnotes_0']")
			private WebElement apppartsnotes;
			
			
			@FindBy(xpath="//tr[@id='tr_0']//input[@name='ctl00$MainContent$checkbox2']")
			private WebElement Delete_checkbox2;
			
			
			@FindBy(xpath="//div[@class='dataTables_scrollHeadInner']//input[@id='apppartdelete']")
			private WebElement apppartdelete;
			
			
			@FindBy(xpath="//input[@id='MainContent_btnUpdate']")
			private WebElement btnUpdate;
			
			
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
				
			
			
			public void buyerguideclick() throws InterruptedException {
				BuyersGuid1click.click();
				Thread.sleep(2000);
				
			}
			
			
			
			public void apppartsvehicldropdown() throws InterruptedException {
				driver.switchTo().frame(0);
				WebElement vehiclesselect = drpVehicleType ;
				Select select = new Select(vehiclesselect);
				//select.selectByVisibleText(pro.getProperty("vehicletypename"));
				select.selectByValue("2");
				Thread.sleep(2000);
			}
			
			
			
			public void apppartsmakedropdown() throws InterruptedException {
				//driver.switchTo().frame(0);
				WebElement makeselect = drpMake ;
				Select select = new Select(makeselect);
				//select.selectByVisibleText(pro.getProperty("makename"));
				select.selectByValue("163");
				Thread.sleep(2000);
			}
			
			
			
			
			public void apppartsmodeldropdown() throws InterruptedException {
				WebElement modelselect = drpModel ;
				Select select = new Select(modelselect);
				//select.selectByVisibleText(pro.getProperty("modelname"));
				select.selectByValue("1091");
				Thread.sleep(2000);
			}
			
			
			
			
			public void apppartsearch() throws InterruptedException {
				searchbtn.click();
				Thread.sleep(2000);
			}
			
			
			
			
			public void apppartsenginebase() {
				selectappln.click();
			}
			
			
			
			public void savebtn() throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", btnSave);
				btnSave.click();
				Thread.sleep(8000);
			}
			
			public void updatebtn() throws InterruptedException {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", btnUpdate);
				btnUpdate.click();
				Thread.sleep(8000);
			}
			
			
			/*
			 * alert accept & fetching text
			 */
			public void acceptAlert() throws InterruptedException{
				Alert alert = driver.switchTo().alert();
				//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
				System.out.println("Parts Related " + "application added " + alert.getText());
				alert.accept();
				
				Thread.sleep(3000);
			}
			
			public void acceptAlert1() throws InterruptedException{
				Alert alert = driver.switchTo().alert();
				//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
				System.out.println("Parts Related " + "application deleted " + alert.getText());
				alert.accept();
				Thread.sleep(1000);
				alert.accept();
				Thread.sleep(3000);
			}
			
			
			public void editappparts() throws InterruptedException {
				driver.switchTo().frame(0);
				appartsedit_btn.click();
				Thread.sleep(2000);
					
			}
			
			public void apppartsnote(String apppartnotes) {
				apppartsnotes.sendKeys(apppartnotes);
				
			}
			
			public void deletebuyerappln() throws InterruptedException {
				driver.switchTo().frame(0);
				Delete_checkbox2.click();
				apppartdelete.click();
				Thread.sleep(3000);
				
			}
			
			
			
			
			
			
			
			
			
			
}
