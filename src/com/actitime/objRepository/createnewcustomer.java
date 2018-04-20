package com.actitime.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createnewcustomer {

	
	  @FindBy(name="name")
	  WebElement customernameEdt;
	  
	  @FindBy(xpath="input[@value='create customer']")
	  WebElement createcustomerBtn;
	  
	  public void createcustomer(String customername)
	  {
		  customernameEdt.sendKeys("hdfc");
		  createcustomerBtn.click();
	  }}

