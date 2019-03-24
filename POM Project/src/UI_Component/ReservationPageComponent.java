package UI_Component;

import static org.testng.Assert.assertEquals;

import java.util.List;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import com.google.common.util.concurrent.Service;

import bds.Queries.ServicesCall;

public class ReservationPageComponent {
	
	@FindBy(name="tripType")
   static List <WebElement> tripTypeRadio;
	
	@FindBy (name="fromPort")
	
	static WebElement fromLocationName;
	
	
	//Size of radio
	 public static boolean radiosize()
	{
		Integer actualSize= tripTypeRadio.size();
		Integer expectedSize=ServicesCall.radioButtonCounts;
		if(actualSize.equals(expectedSize))
		{
		 return true;
		}
		return false;
	}
	
	
	public static boolean findDepartName()
	{
	
		Select sel=new Select(fromLocationName);
        sel.selectByVisibleText("New York");
    	
      List<WebElement> dep= sel.getAllSelectedOptions();
      
      for(int i=0;i<dep.size();i++)
      {
    	  if(dep.get(i).equals(ServicesCall.fromLocation))
    	  {
    		  return true;
    	  }
      }
      return false;
				
      

	}
	

	
}	
	

