package com.covisint.automation.projectname.pageobjects;

/**
 * 
 * @author Subhasmita
 * @Owner Prachurya
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Web Element for Sign In page
	 */
	@FindBy(xpath = "//ul[@id='mainNav']/li/span[.='Home']")
	public WebElement tab_Home;

	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Bosch Group']")
	public WebElement tab_Group;


	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Products and Services']")
	public WebElement tab_ProdServices;
	
	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Newsroom']")
	public WebElement tab_Newsroom;
	
	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Career']")
	public WebElement tab_Career;
	
	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Research']")
	public WebElement tab_Research;
	
	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Sustainability']")
	public WebElement tab_Sustainability;
	
//	@FindBy(xpath = "//ul[@id='mainNav']/li/a[.='Bosch Group']")
//	public WebElement tab_Group;
}

