package com.covisint.automation.projectname.common;



import org.openqa.selenium.WebDriver;

import com.covisint.automation.core.webui.ProcessTestRequest;
import com.covisint.automation.projectname.pageobjects.HomePage;
import com.covisint.automation.projectname.pageobjects.LogInPage;


public class testCommon {
	public ProcessTestRequest ptr;
	public LogInPage logcp;
	public HomePage homepg;

	public testCommon(WebDriver driver, ProcessTestRequest ptr) {
		this.ptr = ptr;
		logcp = new LogInPage(driver);
		homepg=new HomePage(driver);
	}

	
}
