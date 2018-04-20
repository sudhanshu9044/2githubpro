package com.actitime.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class common {
        
	@FindBy(linkText="Logout")
	WebElement Logoutlnk;
	
	public void logout()
	{
       Logoutlnk.click();
	}
}
