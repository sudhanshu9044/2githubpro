package com.actitime.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class opentask
{
   @FindBy(linkText="project&customers")
   WebElement projectcustomerslink;
   public void navigatetoprojectandcustomerpage()
   {
	   projectcustomerslink.click();
   }
}
