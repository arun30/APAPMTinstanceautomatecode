package pageobjectmodel;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import utility.Baseclass;

public class Applicationrelated_vehicle_make_model extends Baseclass {

	public Applicationrelated_vehicle_make_model() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_0']")
	@CacheLookup
	private WebElement master;
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_0']")
	@CacheLookup
	private WebElement vehicletype;
	
	
	@FindBy(xpath="//button[@id='MainContent_btnAdd']")
	private WebElement addbutton;
	
	@FindBy(xpath="//input[@id='MainContent_txtVehicleType']")
	private WebElement vehicleentertextbox;
	
	@FindBy(xpath="//input[@id='MainContent_checkACESList_1']")
	private WebElement equivalentvehicle;
	
	@FindBy(xpath="//input[@id='MainContent_btnSave']")
	private WebElement savebutton;
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_1']")
	private WebElement clickmake;
	
	                
	@FindBy(xpath="//select[@id='MainContent_drpVehicleTypeAdd']")
	private WebElement vehicletypeselect;
	
	@FindBy(xpath="//input[@id='MainContent_txtMake']")
	private WebElement maketextbox;
	
	@FindBy(xpath="//input[@id='MainContent_checkACESList_42']")
	private WebElement eqmakeradibutton;
	
	
	@FindBy(xpath="//a[@id='ucMenu_rptLevel1_rptLevel2_0_rptLevel3_1_lnkLink3_2']")
	private WebElement modelselect;
	
	
	@FindBy(xpath="//select[@id='MainContent_drpMakeAdd']")
	private WebElement dropdownmakeselect;
	
	
	@FindBy(xpath="//input[@id='MainContent_txtModel']")
	private WebElement modeltextbox;
	
	
	@FindBy(xpath="//input[@id='MainContent_checkACESList_1']")
	private WebElement eqmodelradiobutton;
	
	@FindBy(xpath="//i[@class='fas fa-th-large theme_txt_clr sec_lv_menu']")
	private WebElement clickdashboard;
	
	
	
	/*
	 * choosing vehicle type & add button click
	 */
	public void clickonvehicletype() throws Throwable {
	
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		vehicletype.click();
		Thread.sleep(5000);
		addbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	/*
	 * entering new vehicle type name, equivalent vehicle & save
	 */
	public void vehicletypename(String vehiclename) throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		vehicleentertextbox.sendKeys(vehiclename);
		equivalentvehicle.click();
		savebutton.click();
		Thread.sleep(2000);
	}
	
	
	/*
	 * alert accept & fetching text
	 */
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related: " + pro.getProperty("vehicletypename") +  alert.getText());
		alert.accept();
		Thread.sleep(2000);

	}
	
	/*
	 * 
	 * choosing make & clicking on the add button
	 */
	public void clickonmake() throws Throwable {
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		/*boolean result = false;
		int attempt = 0;
		while(attempt<2) {
			try {
				Actions action = new Actions(driver);
				action.moveToElement(master).build().perform();
				result = true;
				break
			}
		}*/
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		clickmake.click();
		Thread.sleep(5000);
		addbutton.click();
		Thread.sleep(3000);
	}
	
	
	/*
	 * 
	 * vehicle type choose, make name add & equivalent make choose
	 */
	public void addmakename() throws InterruptedException {
		
		WebElement element = vehicletypeselect;
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("vehicletypename"));		
		Thread.sleep(2000);
		
	}
	
	
	/*
	 * 
	 * enter make name,choose equivalent aces make & save
	 */
	public void newmakename(String makename) throws InterruptedException {
		
		maketextbox.sendKeys(makename);
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eqmakeradibutton);
		eqmakeradibutton.click();
		Thread.sleep(1000);
		savebutton.click();
		Thread.sleep(2000);
		
	}
	
	
	
	/*
	 * 
	 * make successfull & alert accept
	 */
	public void acceptAlertformake() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related " +pro.getProperty("makename") + alert.getText());
		alert.accept();
		
	}
	
	
	/*
	 * 
	 * master mouse hover, choose model, addbuton click
	 */
	public void clickonmodel() throws Throwable {
		
		Actions action = new Actions(driver);
		action.moveToElement(master).build().perform();
		Thread.sleep(3000);
		modelselect.click();
		Thread.sleep(5000);
		addbutton.click();
		Thread.sleep(3000);
	}
	
	
	
	
	/*
	 * 
	 * vehicle type choose, make choose, model name add & equivalent model choose
	 */
	public void addmodelname() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement element = vehicletypeselect;
		Select select = new Select(element);
		select.selectByVisibleText(pro.getProperty("vehicletypename"));		
		Thread.sleep(2000);
	}
		
		
	public void addmodeldrp2() throws InterruptedException {	
		WebElement element1 = dropdownmakeselect;
		Select select1 = new Select(element1);
		select1.selectByVisibleText(pro.getProperty("makename"));		
		Thread.sleep(2000);
		
	}
	
	
	
	
	/*
	 * 
	 * model name add,equivalent model choose & save
	 */
	public void modelnameadd(String modelname) throws InterruptedException {
		modeltextbox.sendKeys(modelname);
		eqmodelradiobutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", savebutton);
		savebutton.click();
		Thread.sleep(2000);
		}
	
	
	
	
	/*
	 * 
	 * added model successfull & alert accept
	 */
	public void acceptAlertformodel() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		//logger.log(LogStatus.INFO,"Alert text " + alert.getText());
		System.out.println("Application Related " +pro.getProperty("modelname") + alert.getText());
		alert.accept();
		
	}
	
	
	
	
	
	
	
	
	
}

