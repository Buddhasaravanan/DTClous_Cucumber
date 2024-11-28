package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceCall_Page extends BasePage
{
	WebDriver driver;
	
	public ServiceCall_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	
	@FindBy(id="app-nav-service-management") WebElement Service;
	@FindBy(id="app-nav-service-management-orders") WebElement calls;
	@FindBy(xpath="//span[contains (text(), 'Schedule service')]") WebElement createservicecall;
	@FindBy(xpath="//input[@name='client']") WebElement clientname;
	@FindBy(xpath="//div[contains (text(), 'E.g. Customer called into office on Tuesday stated their conference room projector stopped working.')]") WebElement issuereported;
	@FindBy(xpath="//span[contains (text(), 'Done')]") WebElement issuereporteddone;
	@FindBy(xpath="(//span[contains (text(), 'Create')])[2]]") WebElement createSC;
	@FindBy(xpath="//input[@placeholder='Select start date']") WebElement SCstartdate;
	@FindBy(xpath="//input[@placeholder='Select end date']") WebElement SCenddate;	
	@FindBy(xpath="(//div[@role='combobox'])[4]") WebElement servicecontractdropbox;
	@FindBy(xpath="//span[contains (text(), 'Request payment')]") WebElement requestpayment;
	@FindBy(xpath="//div[contains (text(),'04:00 PM - 05:00 PM')]") WebElement schedule9to5;	
	@FindBy(xpath="//div[contains (text(), 'All Resources')]") WebElement allresource;
	@FindBy(xpath="//div[contains (text(), 'All Available Resources')]") WebElement allavailableresource;
	@FindBy(xpath="//div[contains (text(), 'Ajai DND')]") WebElement Ajai;
	@FindBy(xpath="//span[contains (text(), 'Schedule')]") WebElement SCschedule;
	@FindBy(xpath="//span[contains (text(), 'Work Summary')]") WebElement worksummary;
	@FindBy(id="labor-time-input") WebElement labortime;
	@FindBy(xpath="//span[contains (text(), 'Add labor')]") WebElement addloabor;
	@FindBy(xpath="(//ng-select[@placeholder='Select labor type'])[2]") WebElement labortype;
	@FindBy(xpath="//ng-dropdown-panel[@role='listbox']") WebElement listoflabors;
	@FindBy(xpath="(//span[contains (text(), 'Add')])[5]") WebElement laboradd;
	@FindBy(xpath="(//mat-icon[@svgicon='closeIcon'])[6]") WebElement laborclosebtn;
	@FindBy(xpath="(//div[@id='labor-time-input'])[2]") WebElement truckrollfee;
	@FindBy(xpath="//input[@name='truck']") WebElement truckrollfeevalue;
	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']") WebElement truckrollfeetax;
	@FindBy(xpath="(//div[@id='labor-time-input'])[3]") WebElement drivetimefee;
	@FindBy(xpath="(//input[@name='truck'])[2]") WebElement drivetimefeevalue;
	@FindBy(xpath="//span[contains (text(), 'Add time entry')]") WebElement SCtimeentry;
	@FindBy(id="txt-app-search") WebElement addresource;
	@FindBy(xpath="//div[@class='time-container']") WebElement houresworked;
	@FindBy(id="labor-thour-input") WebElement laborhour;
	@FindBy(id="labor-tmin-input") WebElement labormins;
	@FindBy(xpath="//ng-select[@placeholder='Select labor type']") WebElement TElabortype;
	@FindBy(xpath="(//span[contains (text(),'Add')])[4]") WebElement timenetryadd;
	
	
	
	
	
	
	
	

}
