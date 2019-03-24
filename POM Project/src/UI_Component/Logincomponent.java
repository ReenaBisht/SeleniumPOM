package UI_Component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bds.Queries.ServicesCall;

public class Logincomponent {
	
	@FindBy(name="userName")
	static WebElement usernameEditorBox;
	
	@FindBy(name="password")
	static WebElement userpaswordbox;
	
	@FindBy(xpath="//*[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//img[@src='/images/spacer.gif'][1]//following::font")
	 static WebElement loginverificationtexty;
	 
	
	
	
	static public void login()
	{
		usernameEditorBox.sendKeys("batman");
		userpaswordbox.sendKeys("batman");
		loginButton.click();
	}
	
	public boolean verifyloginFun()
	{
	 String actualText=	loginverificationtexty.getText();
	 System.out.println(actualText);
	 String expectedText= ServicesCall.getloginVerificaionText();
	 
	 if(expectedText.equals(actualText))
	 {
		 return true;
	 }
	 else
		 
		return false;
	}

}
