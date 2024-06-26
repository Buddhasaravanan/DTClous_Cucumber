package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import factory.Base;

public class Project_Page extends BasePage
{
	WebDriver driver;
	
	
	public Project_Page(WebDriver driver) 
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@class='cdk-overlay-pane']")  WebElement toastmsg;
	
	
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
	@FindBy(xpath="//span[contains (text(),'Ajai DND')]") WebElement resource1;
	@FindBy(xpath="//span[contains (text(),'Siva - DND')]") WebElement resource2;
	@FindBy(id="resourceAssign") WebElement assign;
	@FindBy(xpath="(//span[contains (text(),'Create')])[1]") WebElement create;
	@FindBy(xpath="//a[contains (text(),'Add task')]") WebElement addtask;
	@FindBy(xpath="//mat-icon[@svgicon='closeIcon']") WebElement canceltask;
	@FindBy(xpath="//span[contains (text(),'Schedule')]") WebElement schedule;
	@FindBy(xpath="//span[contains (text(),'New task group')]") WebElement newtaskgroup;
	@FindBy(xpath="//input[@placeholder='New task group']") WebElement taskgroupname;
	@FindBy(xpath="(//span[@class='elipseName'])[1]") WebElement tasknameclick;
	@FindBy(xpath="(//mat-icon[@svgicon='moreHorzIcon'])[3]") WebElement taskmoreicon;
	@FindBy(xpath="//span[contains (text(), 'Edit')]") WebElement taskedit;
	@FindBy(id="checklistFocus") WebElement checklist;
	@FindBy(xpath="//a[contains (text(),'Add items')]") WebElement taskadditems;
	@FindBy(id="select-all-items-input") WebElement selectallitem;
	@FindBy(id="btn-add-task-items") WebElement addselecteditems;
	@FindBy(xpath="//span[contains (text(), 'Finished adding')]") WebElement finishedadding;
	@FindBy(id="btn-close-task") WebElement taskclosebtn;
	@FindBy(xpath="(//div[@class='cursor-pointer'])[2]") WebElement taskelement;
	
	
	
	@FindBy(xpath="//span[contains (text(),' Scheduling')]") WebElement scheduling;
	@FindBy(xpath="(//mat-icon[@svgicon='addIcon'])[1]") WebElement addschedule;
	@FindBy(xpath="//a[contains (text(), 'Assign Task')]") WebElement assigntask;
	@FindBy(xpath="(//input[@type='checkbox'])[1]") WebElement taskcheckbox;
	@FindBy(xpath="//span[contains (text(), 'Add selected tasks')]") WebElement addselectedtask;	
	
	@FindBy(xpath="//span[contains (text(), 'Time Tracking')]") WebElement timetracking;
	@FindBy(id="btnTimeEntry") WebElement addnewtimeentry;
	@FindBy(id="txt-app-search") WebElement addresource;
	@FindBy(xpath="//div[contains (text(), 'Select project task')]") WebElement selectprojecttask;
	@FindBy(xpath="(//span[contains (text(), 'Add')])[2]") WebElement addtimeentry;
	@FindBy(xpath="//div[@class='time-container']") WebElement houresworked;
	@FindBy(id="labor-thour-input") WebElement laborhour;
	@FindBy(id="labor-tmin-input") WebElement labormins;
	@FindBy(xpath="//input[@placeholder='Select Date(s)']") WebElement timeentrycalender;
	@FindBy(xpath="//span[contains (text(), '16')]") WebElement date16;
	@FindBy(xpath="//span[contains (text(),'Done')]") WebElement caldone;
	@FindBy(xpath="//ng-select[@placeholder='Select labor type']") WebElement TElabortype;
	@FindBy(xpath="(//div[@role='option'])[2]") WebElement task;
	
	
	@FindBy(xpath="//input[@type='checkbox']") WebElement itemcheckbox;
	@FindBy(xpath="//span[contains (text(), 'Create purchase order')]") WebElement createpurchaseorder;
	@FindBy(id="nav-product-status") WebElement itemstatus;
	@FindBy(xpath="//span[contains (text(), ' New for all ')]") WebElement newforall;
	@FindBy(xpath="//span[contains (text(), 'Continue')]") WebElement contunie;
	@FindBy(xpath="//span[contains (text(), 'Send PO')]") WebElement sendpobutton;	
	@FindBy(xpath="//mat-icon[@svgicon='closeIcon']") WebElement closeiconpo;
	
	@FindBy(id="nav-payments") WebElement payments;
	@FindBy(xpath="//a[contains (text(), 'New payment request')]") WebElement newpaymentrequest;
	@FindBy(id="btn-done-automation-setup") WebElement createpayments;
	@FindBy(xpath="//mat-icon[@svgicon='backIcon']") WebElement paymentbackicon;
	@FindBy(xpath="//div[@aria-haspopup='menu']") WebElement paymentstatus;
	@FindBy(xpath="(//span[contains (text(), ' Paid ')])[2]") WebElement paid;
	@FindBy(xpath="//span[contains (text(), 'Save')]") WebElement paidstatussave;
	@FindBy(xpath="//span[contains (text(),'Payment Request')]") WebElement paymentrequestvalidatetext;
	@FindBy(xpath="//mat-icon[@svgicon='proposalShare']") WebElement sharepayemnt;
	@FindBy(xpath="//span[contains (text(), 'Email')]") WebElement shareemail;
	@FindBy(xpath="//app-contacts-integration[@placeholder='Type here to enter email or contact']") WebElement toemail;
	@FindBy(xpath="//span[contains (text(), 'Send')]") WebElement sendmail;
	
	
	
	public void plan()
	{
		plan.click();
	}
	
	public void task() throws InterruptedException
	{
		tasks.click();
		Thread.sleep(2000);
	}
	
	public void createtask() throws IOException, InterruptedException
	{
		createnewtask.click();
		taskname.sendKeys(Base.getProperties().getProperty("Taskname"));
		taskcalender.click();
		
		String Date ="10";
		
	List<WebElement>Alldates = driver.findElements(By.xpath("//*[@id=\"mat-datepicker-92\"]/div/mat-month-view/table/tbody"));
	
	for (WebElement dt:Alldates)
	{
		if(dt.getText().equals(Date))
		{
			dt.click();
			break;
		}
	}
	
	resource.click();
	Thread.sleep(2000);
	resource1.click();
	resource2.click();
	assign.click();
	create.click();
		
	}
	
	public boolean validatetask()
	{
		boolean tv = schedule.isDisplayed();
		return tv;
	}
	
	
	public void createtaskgroup() throws IOException
	{
		newtaskgroup.click();
		taskgroupname.sendKeys(Base.getProperties().getProperty("Taskgroupname"));
		create.click();
	}
	
	public String validationtaskgroup()
	{
		  String tomsg = toastmsg.getText();
				  return tomsg;
	}
	
	
	public void hower()
	{
		Actions act = new Actions(Base.getdriver());
		
		act.moveToElement(taskelement);		
	}

	
	public void edittask() throws InterruptedException
	{
		taskmoreicon.click();
		taskedit.click();
		Thread.sleep(3000);
	}
	
	public void checklist() throws IOException
	{
		checklist.sendKeys(Base.getProperties().getProperty("Taskchecklist") + Keys.ENTER);
		checklist.sendKeys(Base.getProperties().getProperty("Taskchecklist") + Keys.ENTER);
	}
	
	public String CHLvalidation()
	{
		 String tomsg = toastmsg.getText();
		  return tomsg;
	}
	
	public void additem()
	{
		taskadditems.click();
		selectallitem.click();
		addselecteditems.click();
		finishedadding.click();
	}
	
	public String addeditemvalidation()
	{
		 String tomsg = toastmsg.getText();
		  return tomsg;
	}
	
	public void taskclose()
    {
		taskclosebtn.click();
    }
	
	public void clickschedulebutton()
	{
		schedule.click();
	}
	
	public void schedulecreatebtn()
	{
		create.click();
	}
	
	public String schudulevalidation()
	{
		 String tomsg = toastmsg.getText();
		  return tomsg;
	}
	
	public void timetracking() throws InterruptedException
	{
		timetracking.click();
		Thread.sleep(3000);
	}
	
	public void timeentry() throws InterruptedException
	{
		addtimeentry.click();
		addresource.click();
		resource1.click();
		selectprojecttask.click();
		task.click();
		TElabortype.click();
		task.click();
		houresworked.click();
		laborhour.sendKeys("1");
		addresource.click();
		timeentrycalender.click();
		date16.click();
		caldone.click();
		addtimeentry.click();	
		
	}
	
	public String timeentryvalidation()
	{
		 String tomsg = toastmsg.getText();
		  return tomsg;
	}
	
	
	public void projectoverviewpage() throws InterruptedException
	{
		overview.click();
		Thread.sleep(3000);
	}
	
	
	public void paymentpage()
	{
		details.click();
		payments.click();
	}
	
	public void cretenewpayment() throws InterruptedException
	{
		newpaymentrequest.click();
		Thread.sleep(3000);
		createpayments.click();
		Thread.sleep(3000);	
	}
	
	public boolean validatenewpayment()
	{
		boolean payment = paymentrequestvalidatetext.isDisplayed();
		return payment;
	}
	
	public void sharepayment() throws InterruptedException, IOException
	{
		sharepayemnt.click();
		shareemail.click();
		Thread.sleep(3000);	
		toemail.sendKeys(Base.getProperties().getProperty("proposal_email"));
		sendmail.click();	
	}
	
	public String paymentemailsharevalidation()
	{
		 String tomsg = toastmsg.getText();
		  return tomsg;
	}
	
	public void paymentstatus() throws InterruptedException
	{
		paymentbackicon.click();
		Thread.sleep(3000);
		paymentstatus.click();
		paid.click();
		Thread.sleep(3000);
		paidstatussave.click();
		Thread.sleep(3000);	
	}
	
	public boolean paymentsummaryvalidation()
	{
		WebElement pa = driver.findElement(By.xpath("//tr[@class='ng-star-inserted green']//td[7]"));
		pa.getText();
		
		WebElement pa1 = driver.findElement(By.xpath("//*[@id='container-PPE-scroll']/div/app-project-payments/div/div[1]/div[2]/span[2]"));
		pa1.getText();
		
		if(pa.equals(pa1))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
