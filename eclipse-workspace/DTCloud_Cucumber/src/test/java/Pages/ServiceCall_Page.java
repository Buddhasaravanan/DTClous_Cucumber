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
	
	
	
	
	
	
	
	
	
	
	

}
