package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
@BeforeClass
public void configBC(){
	driver=new FirefoxDriver();
}
@BeforeMethod
public void configBM(){
	
}
}
