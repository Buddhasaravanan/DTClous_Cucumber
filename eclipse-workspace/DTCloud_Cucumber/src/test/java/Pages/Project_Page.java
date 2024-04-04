package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Project_Page extends BasePage
{
	WebDriver driver;
	
	
	public Project_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	
	
	
	
	@FindBy(id="app-nav-projects") WebElement Project;
	@FindBy(id="nav-plan") WebElement plan;
	@FindBy(id="nav-project-overview") WebElement overview;
	@FindBy(id="nav-project-detail") WebElement details;
	@FindBy(id="nav-attachments") WebElement attachments;
	@FindBy(id="nav-activity") WebElement activity;
	@FindBy(id="nav-review") WebElement review;
	@FindBy(xpath="//span[contains (text(), 'Tasks')]") WebElement tasks;
	@FindBy(xpath="(//a[contains (text(), 'create a new task')])[1]") WebElement createnewtask;
	@FindBy(xpath="//input[@placeholder='New task']") WebElement taskname;
	@FindBy(xpath="//mat-icon[@svgicon='calendarRange']") WebElement taskcalender;
	@FindBy(xpath="//mat-icon[@svgicon='person']") WebElement resource;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
