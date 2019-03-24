package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Component.Logincomponent;
import UI_Component.ReservationPageComponent;

public class AbstactTest //all the abstarct functioanlity like 
{
    
	Logincomponent logincomponent;
	ReservationPageComponent reservationComponent;
	WebDriver  driver;
	
	public AbstactTest()
	{
		logincomponent=new Logincomponent();
		reservationComponent = new ReservationPageComponent();
		
	}
	
	@BeforeTest
	
	public void setupoEnviroment() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJan2019\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http:/newtours.demoaut.com/");
	    Thread.sleep(3000);
		PageFactory.initElements(driver,logincomponent);
		PageFactory.initElements(driver,reservationComponent);
	
		
	}
	
	@AfterTest
	public void afterenve()
	{
		driver.close();
	}
	
}
