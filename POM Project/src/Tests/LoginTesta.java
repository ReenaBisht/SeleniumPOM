package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import UI_Component.Logincomponent;

public class LoginTesta extends AbstactTest{
	

	
	@Test (description="Verify login")
    	
     public void verifylogin()
     {
		Logincomponent.login();
		Assert.assertTrue(logincomponent.verifyloginFun(),"verify login");
     }
	
	
}
