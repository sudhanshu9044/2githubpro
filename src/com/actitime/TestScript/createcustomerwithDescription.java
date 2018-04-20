package com.actitime.TestScript;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import com.actitime.objRepository.common;
import com.actitime.objRepository.createnewcustomer;
import com.actitime.objRepository.homepage;
import com.actitime.objRepository.loginmet;
import com.actitime.objRepository.opentask;
import com.actitime.objRepository.projectandcustomer;


public class createcustomerwithDescription {
	public static void main(String[] args) {
		
// develop test script s usingobject repository lib
		WebDriver driver=new FirefoxDriver();
	    driver.get("https;goa-pc/login.ido");
	    //login to app
	    
	    loginmet LP=PageFactory.initElements(driver, loginmet.class);
	    	LP.login("abc", "def");
	    //navigate to taskpage
	    
	    homepage hp=PageFactory.initElements(driver, homepage.class);
	    hp.navigatetoTaskpage();
	    
	    //navigate to customerpage
	    opentask op=PageFactory.initElements(driver, opentask.class);
	    op.navigatetoprojectandcustomerpage();
	    //navigate to project and customerpage
	    projectandcustomer pcp=PageFactory.initElements(driver,  projectandcustomer .class);
	    pcp.navigatetocreatenewcustomerpage();
	    
	    //createnew customer
	    
	    createnewcustomer cp=PageFactory.initElements(driver, createnewcustomer.class );
	    cp.createcustomer("qsoider");
	    //verify
	    //logout
	    common cpa=PageFactory.initElements(driver,  common.class );
	    		cpa.logout();
	    driver.close();
	    
	    
	}

	}

