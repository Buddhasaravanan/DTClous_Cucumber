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
	
	
	
	
	
	
	
	
	
	
	

}
