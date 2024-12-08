package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

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
	@FindBy(xpath="//input[@placeholder='Adjustment name']") WebElement adjestmentname;
	@FindBy(id="adjustment-dollar-percent-toggle") WebElement percenttoggle;
	@FindBy(id="adjustment-amount") WebElement adjestmentamount;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[4]") WebElement addadjestment;
	@FindBy(xpath="//a[text()='+ New location']") WebElement createnewlocation;
	@FindBy(xpath="//input[@placeholder='Location name']")  WebElement locationname;
	@FindBy(id="optional-locOrSys-button") WebElement optionallocationtoggle;
	@FindBy(xpath="//div[contains(text(),'Create')]")  WebElement loccreate;
	@FindBy(xpath="//span[contains(text(), 'optional')]")  WebElement optionaltag;
	@FindBy(id="quote-summary-menu")  WebElement quotepricesummary;
	@FindBy(xpath="//span[contains(text(), 'Create proposal')]")  WebElement createproposalbtn;
	@FindBy(id="itemDisplay")  WebElement itemdispaly;
	@FindBy(xpath="//mat-icon[@svgicon='addAccessory']") WebElement addaccessory;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[3]") WebElement addaccessorybtn;
	@FindBy(xpath="//mat-icon[@svgicon='multimedia-proposal']") WebElement multimediaproposal;
	@FindBy(xpath="//div[contains(text(), 'Quick Quote')]") WebElement Quickquoteproposal;
	@FindBy(xpath="//span[text()='Create']") WebElement createbtn;
	@FindBy(id="present-proposal")  WebElement presentproposal;
	@FindBy(xpath="//span[contains(text(),'Accept & Pay')]") WebElement acceptandsignbtn;
	@FindBy(xpath="//input[@placeholder='Email']") WebElement email;
	@FindBy(xpath="//input[@placeholder='First name']") WebElement firstname;
	@FindBy(xpath="//input[@placeholder='Last name']") WebElement lastname;
	@FindBy(xpath=" //span[contains (text(), 'Accept & Proceed to Payment')]") WebElement Acceptproposal;
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
	@FindBy(xpath="(//input[@type='checkbox'])[2]") WebElement april13;
	@FindBy(xpath="//span[contains (text(), 'Monitoring Agreements')]") WebElement monitouringagreement;
	@FindBy(xpath="(//span[contains(text(), 'Add')])[3]") WebElement serviceadd;
	@FindBy(xpath="//span[contains (text(), 'Service Agreements')]") WebElement recommendedplan;
	@FindBy(id="nav-visual-design")  WebElement planview;
	@FindBy(xpath="(//input[@id='add-product-search'])[2]") WebElement accessoriessearch;
	@FindBy(xpath="//span[contains(text(), 'Settings')]") WebElement quotesettings;
	@FindBy(xpath="(//mat-icon[@svgicon='closeIcon'])[4]") WebElement adjestmentcloseicon;
	@FindBy(css=("rainforest-payment[allowed-methods='CARD,ACH,APPLE_PAY']")) WebElement showdowhostmain;
	@FindBy(css=("rainforest-card[style-button-color='#0dbb7d']")) WebElement showdowhostcard;
	@FindBy(css=(".absolute.top-0.right-0.border-none.text-slate-300.bg-transparent")) WebElement showdowhosttestcards;
	@FindBy(css=("value='Approve|0'")) WebElement showdowhostapprove;
	@FindBy(css=("button[data-testid='payment-submit-button']")) WebElement showdowhostpaybutton;
	@FindBy(css="input[placeholder='Card number']") WebElement DTPcardnumber;
	@FindBy(css="iframe[sandbox='allow-scripts']") WebElement iframeelement;
	
	
	
	@FindBy(xpath="//mat-icon[@svgicon='dropDownArrowIcon']")  WebElement spdropdown;
	@FindBy(id="btn-quote-service-plan-create")  WebElement newserviceplan;
	@FindBy(xpath="//input[@placeholder='Name']")  WebElement serviceplanname;
	
	

	
	@FindBy(xpath="//div[@class='mat-mdc-form-field-infix ng-tns-c1205077789-498']")  WebElement hourlyCost$;
	@FindBy(xpath="//input[@id='mat-input-246']") WebElement hourlyPrice;
	@FindBy(xpath="//span[normalize-space()='Create']")WebElement create;
	@FindBy(xpath="//mat-icon[@class='mat-icon notranslate cursor-pointer m-l-r-10 slate-grey mat-icon-no-color ng-star-inserted']//*[name()='svg']//*[name()='path'][2]")  WebElement img;
	@FindBy(xpath="//a[normalize-space()='Edit']")  WebElement edit;
	@FindBy(xpath="//span[contains (text(),  'Create proposal')]")  WebElement createProposal;
	
	
	
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
	
	public void add_item() throws InterruptedException
	{
		addtoquote.click();
		Thread.sleep(2000);
	}
	
	public String itemvalidation()
	{
		try
		{
			String toast = toastmsg.getText();
			return toast;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
			return null;
		
		
	}
	
	public void addadjestment() throws IOException, InterruptedException
	{
		moremenu.click();
		Thread.sleep(1000);
		quotesettings.click();
		Thread.sleep(1000);
		adjestment.click();
		addadjestmentbtn.click();
		adjestmentname.sendKeys(Base.getProperties().getProperty("adjestment_name"));
		percenttoggle.click();
		adjestmentamount.clear();
		adjestmentamount.sendKeys(Base.getProperties().getProperty("adjestment_value"));
		addadjestment.click();	
		Thread.sleep(2000);
		adjestmentcloseicon.click();
	}
	
	public boolean adjestmentvalidation()
	{
		boolean btn = addadjestmentbtn.isDisplayed();
				return btn;
	}
	
	public void create_optional_location() throws IOException, InterruptedException
	{
		createnewlocation.click();
		Thread.sleep(2000);
		locationname.sendKeys(Base.getProperties().getProperty("location_name"));
		Thread.sleep(2000);
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
		try 
		{
			String toast = toastmsg.getText();
			return toast;
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
			return null;
		
		
	}
	
	public void add_accessory() throws IOException, InterruptedException
	{
		try
		{
			itemdispaly.click();
			Thread.sleep(3000);
			addaccessory.click();
			accessoriessearch.sendKeys(Base.getProperties().getProperty("accessory"));
			Thread.sleep(3000);
			firstitem.click();
			Thread.sleep(2000);
			addaccessorybtn.click();
			Thread.sleep(2000);
			addaccessorybtn.click();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void createmultimeadiaproposal() throws InterruptedException
	{
		createProposal.click();
		multimediaproposal.click();
		createbtn.click();
		Thread.sleep(5000);
		
	}
	
	public void presentproposal() throws IOException, InterruptedException
	{
		try 
		{
			presentproposal.click();
			acceptandsignbtn.click();
			
			WebElement acceptbtn = Acceptproposal;
				if(acceptbtn.isEnabled())	
				{
					acceptbtn.click();
					Thread.sleep(10000);
				}
				else
				{
					email.sendKeys(Base.getProperties().getProperty("proposal_email"));
					firstname.sendKeys(Base.getProperties().getProperty("firstname"));
					lastname.sendKeys(Base.getProperties().getProperty("Lastname"));
					Acceptproposal.click();
					Thread.sleep(10000);
				}
				
				
				WebElement Mainhost = Base.elementloader().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("rainforest-payment[allowed-methods='CARD,ACH,APPLE_PAY']")));
				Thread.sleep(1000);
				
				JavascriptExecutor js = (JavascriptExecutor) Base.getdriver();
	            WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", Mainhost);
	            
	            SearchContext SubHost = shadowRoot.findElement(By.cssSelector("rainforest-card[style-button-color='#0dbb7d']"));
				Thread.sleep(1000);
				
				WebElement subshadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", SubHost);
				
				WebElement iframe = subshadowRoot.findElement(By.cssSelector("iframe[sandbox='allow-scripts']"));
						
				Base.getdriver().switchTo().frame(iframe);
				
				js.executeScript("document.querySelector('Card number').sendKeys('4111111111111111')");
				
				driver.switchTo().defaultContent();

				
				
				//DTPcardnumber.sendKeys(Base.getProperties().getProperty("Creditcard"));
				
				//This Element is inside 2 nested shadow DOM.
				
				SearchContext shadow0 = showdowhostmain.getShadowRoot();
				Thread.sleep(1000);
				SearchContext shadow1 = shadow0.findElement(By.cssSelector("rainforest-card[style-button-color='#0dbb7d']")).getShadowRoot();
				Thread.sleep(1000);
				shadow1.findElement(By.cssSelector("input[placeholder='MM / YY']")).sendKeys(Base.getProperties().getProperty("M/D"));
			    Thread.sleep(1000);
				
			  //This Element is inside single shadow DOM.
			    SearchContext shadow = showdowhostmain.getShadowRoot();
			    Thread.sleep(1000);
			    shadow.findElement(By.cssSelector("button[data-testid='payment-submit-button']")).click();
			
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
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
			
		
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
		addserviceplan.click();
		april13.click();
		monitouringagreement.click();
		april13.click();
		serviceadd.click();
	}
	
	public boolean serviceplan_validation()
	{
		boolean servicetag = recommendedplan.isDisplayed();
		return servicetag;
	}
	
	
	
	
	
	
	
	

}
