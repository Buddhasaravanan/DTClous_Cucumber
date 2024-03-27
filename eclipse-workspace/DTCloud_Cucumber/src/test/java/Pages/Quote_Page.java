package Pages;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Base;


public class Quote_Page extends BasePage
{
	WebDriver driver;
	
	
	public Quote_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@class='q-name']") WebElement quote;
	@FindBy(xpath="//div[@id='nav-design']") WebElement design;
	@FindBy(xpath="//input[@id='add-product-search']") WebElement itemsearch;
	@FindBy(xpath="//div[@id='item_0']") WebElement firstitem;
	@FindBy(xpath="//span[contains(text(),'Add  to quote')]") WebElement addtoquote;
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	@FindBy(xpath="(//div[@class='more-menu'])[1]") WebElement moremenu;
	@FindBy(xpath="//span[contains (text(),'Adjustments')]") WebElement adjestment;
	@FindBy(xpath="//span[contains(text(), 'Add adjustment')]") WebElement addadjestmentbtn;
	@FindBy(xpath="//input[@placeholder='Create or search for an adjustment']") WebElement adjestmentname;
	@FindBy(id="adjustment-dollar-percent-toggle") WebElement percenttoggle;
	@FindBy(id="adjustment-amount") WebElement adjestmentamount;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[5]") WebElement addadjestment;
	@FindBy(xpath="//a[text()='+ New location']") WebElement createnewlocation;
	@FindBy(xpath="//input[@placeholder='Location name']")  WebElement locationname;
	@FindBy(id="optional-locOrSys-button") WebElement optionallocationtoggle;
	@FindBy(xpath="//div[contains(text(),'Create')]")  WebElement loccreate;
	@FindBy(xpath="//span[contains(text(), 'optional')]")  WebElement optionaltag;
	@FindBy(id="quote-summary-menu")  WebElement quotepricesummary;
	@FindBy(xpath="//span[contains(text(), 'Create proposal')]")  WebElement createproposalbtn;
	@FindBy(id="itemDisplay")  WebElement itemdispaly;
	@FindBy(xpath="//mat-icon[@svgicon='addAccessory']") WebElement addaccessory;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[4]") WebElement addaccessorybtn;
	@FindBy(xpath="//mat-icon[@svgicon='multimedia-proposal']") WebElement multimediaproposal;
	@FindBy(xpath="//div[contains(text(), 'Quick Quote')]") WebElement Quickquoteproposal;
	@FindBy(xpath="//span[text()='Create']") WebElement createbtn;
	@FindBy(id="present-proposal")  WebElement presentproposal;
	@FindBy(xpath="//span[contains(text(),'Accept & Sign')]") WebElement acceptandsignbtn;
	@FindBy(xpath="//input[@placeholder='Email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='First name']") WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last name']") WebElement lastname;
	@FindBy(xpath="//span[contains(text(), 'Accept proposal')]") WebElement Acceptproposal;
	@FindBy(xpath="//span[contains(text(),'Return to proposal')]") WebElement returnproposal;
	@FindBy(xpath="//mat-icon[@svgicon='backIcon']") WebElement proposalbackbtn;
	@FindBy(xpath="//mat-icon[@svgicon='closeIcon']") WebElement proposalclosebtn;
	@FindBy(xpath="//span[normalize-space()='Won']") WebElement wonbtn;
	@FindBy(xpath="//span[normalize-space()='Create project']") WebElement createproject;	
	@FindBy(xpath="//div[@id='192259']//div[@class='filter-info']")WebElement kitchen;
	@FindBy(xpath="//a[normalize-space()='New item']")  WebElement newItem;
	@FindBy(id="projectNumber")  WebElement projectnumber;
	@FindBy(id="nav-service-plan-list-design")  WebElement serviceplan;
	@FindBy(id="btn-quote-service-plan-add")  WebElement addserviceplan;
	@FindBy(xpath="//*[@id=\"mat-mdc-dialog-12\"]/div/div/app-service-plan-add/div/div[2]/div/app-selection-manager/table/tbody/tr[2]") WebElement april13;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[3]") WebElement serviceadd;
	@FindBy(xpath="//mat-card-title[contains(text(),  'Recommended Plan')]") WebElement recommendedplan;
	@FindBy(id="nav-visual-design")  WebElement planview;
	
	
	
	
	
	@FindBy(xpath="//mat-icon[@svgicon='dropDownArrowIcon']")  WebElement spdropdown;
	@FindBy(id="btn-quote-service-plan-create")  WebElement newserviceplan;
	@FindBy(xpath="//input[@placeholder='Name']")  WebElement serviceplanname;
	
	
	
	
	
	
	
	
	@FindBy(xpath="//div[@class='mat-mdc-form-field-infix ng-tns-c1205077789-498']")  WebElement hourlyCost$;
	@FindBy(xpath="//input[@id='mat-input-246']") WebElement hourlyPrice;
	@FindBy(xpath="//span[normalize-space()='Create']")WebElement create;
	@FindBy(xpath="//mat-icon[@class='mat-icon notranslate cursor-pointer m-l-r-10 slate-grey mat-icon-no-color ng-star-inserted']//*[name()='svg']//*[name()='path'][2]")  WebElement img;
	@FindBy(xpath="//a[normalize-space()='Edit']")  WebElement edit;
	@FindBy(xpath="//button[@class='primary mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']//span[@class='mat-mdc-button-touch-target']")  WebElement createProposal;
	
	
	
	public void click_quote() throws InterruptedException
	{
		quote.click();
		Thread.sleep(2000);
		design.click();
	}
	
	
	public void serach_item() throws IOException, InterruptedException
	{
		itemsearch.sendKeys(Base.getProperties().getProperty("item_name"));
		Thread.sleep(3000);
		firstitem.click();
		Thread.sleep(2000);
	}
	
	public void add_item()
	{
		addtoquote.click();
	}
	
	public String itemvalidation()
	{
		String toast = toastmsg.getText();
		return toast;
		
	}
	
	public void addadjestment() throws IOException
	{
		moremenu.click();
		adjestment.click();
		addadjestmentbtn.click();
		adjestmentname.sendKeys(Base.getProperties().getProperty("adjestment_name"));
		percenttoggle.click();
		adjestmentamount.clear();
		adjestmentamount.sendKeys(Base.getProperties().getProperty("adjestment_value"));
		addadjestment.click();		
	}
	
	public boolean adjestmentvalidation()
	{
		boolean btn = addadjestmentbtn.isDisplayed();
				return btn;
	}
	
	public void create_optional_location() throws IOException
	{
		createnewlocation.click();
		locationname.sendKeys(Base.getProperties().getProperty("location_name"));
		optionallocationtoggle.click();
		loccreate.click();
	}
	
	public boolean optionallocationvalidation()
	{
		boolean optional = optionaltag.isDisplayed();
		return optional;
	}
	
	public void serach_labor() throws IOException, InterruptedException
	{
		itemsearch.sendKeys(Base.getProperties().getProperty("labor"));
		Thread.sleep(3000);
		firstitem.click();
		Thread.sleep(2000);
	}
	
	public void add_labor()
	{
		addtoquote.click();
	}
	
	public String laborvalidation()
	{
		String toast = toastmsg.getText();
		return toast;
		
	}
	
	public void add_accessory() throws IOException, InterruptedException
	{
		itemdispaly.click();
		Thread.sleep(3000);
		addaccessory.click();
		itemsearch.sendKeys(Base.getProperties().getProperty("accessory"));
		Thread.sleep(3000);
		addaccessorybtn.click();
		Thread.sleep(2000);
		addaccessorybtn.click();
	}
	
	public void createmultimeadiaproposal() throws InterruptedException
	{
		createProposal.click();
		multimediaproposal.click();
		createbtn.click();
		Thread.sleep(2000);
		
	}
	
	public void presentproposal() throws IOException, InterruptedException
	{
		presentproposal.click();
		acceptandsignbtn.click();
		email.sendKeys(Base.getProperties().getProperty("proposal_email"));
		firstname.sendKeys(Base.getProperties().getProperty("firstname"));
		lastname.sendKeys(Base.getProperties().getProperty("Lastname"));
		Acceptproposal.click();
		Thread.sleep(2000);
		returnproposal.click();
		Thread.sleep(2000);
		proposalbackbtn.click();
		Thread.sleep(2000);
		proposalclosebtn.click();
		Thread.sleep(2000);
		proposalbackbtn.click();
		Thread.sleep(2000);
	}
	
	public void won_opportunity() throws InterruptedException
	{
		wonbtn.click();
		createproject.click();
		Thread.sleep(3000);
	}
	
	public boolean won_opportunity_validation()
	{
		boolean pno =projectnumber.isDisplayed();
		return pno;
	}
	
	public void add_service_plan()
	{
		serviceplan.click();
		april13.click();
		serviceadd.click();
	}
	
	public boolean serviceplan_validation()
	{
		boolean servicetag = recommendedplan.isDisplayed();
		return servicetag;
	}
	
	
	
	
	
	
	
	

}
