package com.covisint.automation.projectname.modulename.tests.type;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.covisint.automation.core.webui.BaseTestType;
import com.covisint.automation.core.webui.ITestType;
import com.covisint.automation.projectname.common.testCommon;


public class BaseClass extends BaseTestType {


	testCommon testcom;

//	@BeforeClass()
//	public void beforeClass() throws IOException{
//		
//		
//		ptr.overrideExcelData("src/resources/STG/testdata/testdata");
//		super.beforeClass();
//	}

	@BeforeMethod()
	public void beforemethod() throws IOException {
		super.beforeMethod();
		
		testcom=new testCommon(driver,ptr);
		
	    
	}



	@Override
	public void setPropertyFileName() {
		super.setPropertyFileName("PROJ-PROP");
		// TODO Auto-generated method stub
		
	}

	

}
