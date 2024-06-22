package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CO_Page extends BasePage
{
	WebDriver driver;
	
	public CO_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	
	
	@FindBy(id="nav-co") WebElement changeorder;
	@FindBy(xpath="//span[contains (text(), 'New change order')]") WebElement createnewco;
	@FindBy(xpath="//input[@placeholder='Change order name']") WebElement coname;
	@FindBy(xpath="//span[contains (text() , ' Create & open change order')]") WebElement createcobtn;
	@FindBy(xpath="(//div[contains (text(),'Overview')])[2]") WebElement cooverview;
	@FindBy(id="nav-design") WebElement design;
	@FindBy(xpath="(//mat-icon[@svgicon='deleteIcon'])[1]") WebElement removeitem;
	@FindBy(xpath="//label[contains (text(),' Keep the accessories, and convert them to items')]") WebElement keepaccessory;
	@FindBy(xpath="//span[contains (text(),'Yes, remove')]") WebElement yesremove;
	@FindBy(xpath="//mat-icon[@svgicon='unDeleteIcon']") WebElement undeletionbtn;
	@FindBy(xpath="//label[contains (text(),'Remove product, but keep the associated labor')]") WebElement keeplabor;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[1]") WebElement hower1stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[2]") WebElement hower2stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[3]") WebElement hower3stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[4]") WebElement hower4stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[5]") WebElement hower5stitem;
	@FindBy(xpath="(//div[@id=\"showHideColumns\"])[6]") WebElement hower6stitem;
	@FindBy(xpath="//mat-icon[@svgicon='copyContent']") WebElement copyitem;
	@FindBy(xpath="(//span[contains (text(), 'All')])[2]") WebElement alllocation;
	@FindBy(xpath="(//span[contains (text(),'Copy')])[2]") WebElement copybtn;
	@FindBy(xpath="//mat-icon[@svgicon='replace']") WebElement replace;
	@FindBy(xpath="//span[contains (text(), 'Maintain price')]") WebElement maintainprice;
	@FindBy(xpath="//span[contains (text(), 'Keep labor')]") WebElement replacekeeplabor;
	@FindBy(xpath="//span[contains (text(), 'Keep accessories')]") WebElement replacekeppaccossory;
	@FindBy(id="btn-replace") WebElement replacebtn;
	@FindBy(xpath="//div[contains (text(), 'Internal')]") WebElement internalco;
	@FindBy(xpath="//span[contains (text(), ' Approve change order ')]") WebElement approvechangeorder;
	
	
}




