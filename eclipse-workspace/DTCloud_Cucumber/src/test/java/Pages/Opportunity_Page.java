package Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.Base;

public class Opportunity_Page extends BasePage {
	
WebDriver driver;

Date d=new Date();
	
	public Opportunity_Page(WebDriver driver) 
	{
	    super(driver);
		
	}
	
	Base bc=new Base();
	
	
	@FindBy(xpath="//mat-list-item[@id='app-nav-opportunities']") WebElement opportunities;
	@FindBy(xpath="//button[@id='btn-new-opportunity']") WebElement newOpportunity;
	@FindBy(xpath="//input[@id='opportunityName']") WebElement opportunityName;
	@FindBy(xpath="//ng-select[@id='opportunityProjectType']//div[@class='ng-select-container']") WebElement selectProjectType;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement listbox;
	@FindBy(xpath="//ng-select[@id='marketType']//div[@class='ng-select-container']") WebElement selectMarketType;
	@FindBy(xpath="//input[@placeholder='Client name']") WebElement clientName;
	@FindBy(xpath="//div[@id='btn-create-opportunity']") WebElement next;
	@FindBy(xpath="//input[@id='opportunityMeasurementLabel']") WebElement squareFeet;
	@FindBy(xpath="//div[@id='btn-create-opportunity']") WebElement create;
	@FindBy(xpath="//span[normalize-space()='Won']") WebElement wonbtn;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement list;
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Service']") WebElement service;
	@FindBy(xpath="//span[normalize-space()='Single Family Detached - Custom']")  WebElement markettypesingle;
	@FindBy(xpath="//label[contains (text(), 'Residential')]")  WebElement residential;
	@FindBy(id="opportunityBudget")  WebElement oppbudget;
	@FindBy(xpath="//div[@aria-expanded='true']")  WebElement quotetype;
	@FindBy(xpath="//span[contains (text(), 'Bid/Spec')]")  WebElement bid;
	
	
	
	
	
	
	public void click_opportunity() 
	{
		opportunities.click();
	}
	
	public void click_newopportunity()
	{
		newOpportunity.click();
	}
	
	public void oppname() throws IOException
	{
		opportunityName.sendKeys(Base.getProperties().getProperty("oppname") + " " + d );
	}
	
	public void projectype()
	{
		WebElement dropdown = selectProjectType;
		dropdown.click();
		service.click();
		
	}
	
	public void markettype()
	{
		WebElement dropdown = selectMarketType;
		dropdown.click();
		
		markettypesingle.click();
		
	}
	
	public void client() throws IOException, InterruptedException, AWTException
	{
		clientName.sendKeys(Base.getProperties().getProperty("Cname"));
		Thread.sleep(2000);
		Base.Enter();
		Thread.sleep(2000);
		
	}
	
	public void NXTbtn() throws InterruptedException
	{
		next.click();
		Thread.sleep(2000);
		next.click();
	}
	
	public void  Sqfeet() throws IOException
	{
		squareFeet.sendKeys(Base.getProperties().getProperty("sqfeet"));
	}
	
	public void createopp() throws InterruptedException
	{
		create.click();
		Thread.sleep(2000);
	}
	

	public boolean createoppvalidation()
	{
		wonbtn.isDisplayed();
		return true;
		
		
	}
	
	
	public void residential()
	{
		residential.click();
	}
	
	
	public void budget() throws IOException
	{
		oppbudget.sendKeys(Base.getProperties().getProperty("Budget"));
	}
	
	
	public void quotetype()
	{
		quotetype.click();
		bid.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
