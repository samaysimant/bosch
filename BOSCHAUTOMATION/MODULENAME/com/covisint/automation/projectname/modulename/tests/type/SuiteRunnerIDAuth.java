package com.covisint.automation.projectname.modulename.tests.type;

import org.testng.annotations.Test;

import com.covisint.automation.core.webui.SuiteRunner;

public class SuiteRunnerIDAuth extends SuiteRunner {

	public  final String Grp = "SUITE-RUNNER-001";

	@Override
	@Test(groups = { Grp })
	public void Run() throws Exception {
		super.addPackage("com.covisint.automation.projectname.modulename.tests.type");
		
		addClass("BoschTestHomePageTabs");
		
		
		super.addtest();

		super.run();

		
	}

	@Override
	public void validategroups() {
		super.validategroups(Grp);
		// TODO Auto-generated method stub

	}

	@Override
	public void setHeadless() {
		super.setHeadless(false);
		// TODO Auto-generated method stub

	}

}
