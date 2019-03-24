package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import UI_Component.ReservationPageComponent;

public class ReservationPage extends AbstactTest {
	
	
	@Test (description="verifiy RadioButton size",priority= 1)
	public void testSize()
	{
		
		Assert.assertTrue(ReservationPageComponent.radiosize(),"verifiy RadioButton size");
		

   }
	@Test (description="verifiy FromLocation size",priority= 2)
	
	public void testfromLocation()
	{
		Assert.assertTrue(ReservationPageComponent.findDepartName(),"verifiy FromLocation size");
	}

}
