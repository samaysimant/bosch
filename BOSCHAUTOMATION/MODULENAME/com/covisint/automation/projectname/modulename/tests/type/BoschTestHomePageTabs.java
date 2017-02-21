package com.covisint.automation.projectname.modulename.tests.type;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.covisint.automation.core.services.ApiServices;

/**
 * Date scripted 30th OCT 2015
 * 
 * @author DS00374741 (Dipika Sahu)
 * 
 *         Review Level 1 : Review Level 2 : Functionality :User must have the
 *         ability to check own registration status_Reminder Scenario Dependency
 *         :
 */

public class BoschTestHomePageTabs  extends BaseClass{
	
	
	@Test(dataProvider=DP)
	public void test(String browser,String baseUrl) throws Exception {
		
		ptr.openUrl(baseUrl);
		ptr.click(testcom.homepg.tab_Home, "Click on Home");
		
		ptr.assertTrue(ptr.getCurrentUrl().contains("home"));
		
	/*	ptr.click(testcom.homepg.tab_Group, "Click on Bosch Group");
		
		ptr.assertTrue(ptr.getCurrentUrl().contains("boschgroup"));
		
		ptr.click(testcom.homepg.tab_ProdServices, "Click on Product & Services");
		ptr.assertTrue(ptr.getCurrentUrl().contains("products-and-services"));
		
		ptr.click(testcom.homepg.tab_Newsroom, "Click on Newsroom");
		ptr.assertTrue(ptr.getCurrentUrl().contains("newsroom"));
		
		ptr.click(testcom.homepg.tab_Career, "Click on Career");
		ptr.assertTrue(ptr.getCurrentUrl().contains("career"));
		
		ptr.click(testcom.homepg.tab_Research, "Click on Research");
		ptr.assertTrue(ptr.getCurrentUrl().contains("research"));
		
		ptr.click(testcom.homepg.tab_Sustainability, "Click on sustainability Tab");
		ptr.assertTrue(ptr.getCurrentUrl().contains("sustainability"));
*/		
		ptr.endReport();
		
	}
	
	
}
