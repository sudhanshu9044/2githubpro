package com.actitime.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class projectandcustomer {
 
	
	@FindBy(xpath="//input[value='create New customer']")
	WebElement createcustomerBtn;
	
	public void navigatetocreatenewcustomerpage()
	{
		createcustomerBtn.click();
		
		
	}}
	
	
	
	
	
	
	

