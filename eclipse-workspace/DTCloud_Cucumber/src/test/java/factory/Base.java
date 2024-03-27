package factory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.openqa.selenium.Platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Base {
	
	static WebDriver driver;
	static Logger logger;
	static Properties p;
	
	
    
	public static WebDriver initilizebrowser() throws IOException, InterruptedException 
	{
		
		
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			if(getProperties().getProperty("os").equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN10);	
			}
			else if (getProperties().getProperty("os").equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else 
			{
				System.out.println("No matching OS");
			}
			
			switch (getProperties().getProperty("browser").toLowerCase())
			{
			case "chrome":
				capabilities.setBrowserName("chrome"); break;
				
			case "edge" :
				capabilities.setBrowserName("Microsoftedge"); break;
				
			case "firefox" :
				capabilities.setBrowserName("Firefox"); break;
				
			case "safari" :
				capabilities.setBrowserName("Safari"); break;
			}
			
			driver =new RemoteWebDriver (new URL("http://localhost:4444/wd/hub"), capabilities);
		}
		else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local"))	
		{
			switch (getProperties().getProperty("browser").toLowerCase())
			{
			case "chrome":
				driver=new ChromeDriver(); break;
				
			case "edge" :
				driver=new EdgeDriver(); break;
				
			case "firefox" :
				driver=new FirefoxDriver(); break;
				
			default:
				System.out.println("No matching Browser");
				driver=null;
		}
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get(p.getProperty("appurl"));
			
			
	}
		
		return driver;
		
	}
	
    

	
	public static WebDriver getdriver() 
	{
		return driver;
	}

	public static Properties getProperties() throws IOException 
	{
		FileReader file=new FileReader("src/test/resources/config.properties");
		
	
		p=new Properties();
		p.load(file);
		return p;
	}
	
	public static Logger getLogger()
	{
		logger =LogManager.getLogger();
		return logger;
	}
	
	public static void ESC() throws AWTException
	{
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public static void Enter() throws AWTException
	{
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
