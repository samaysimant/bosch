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

public class LogInPage {
	public WebDriver driver;

	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**
	 * Web Element for Sign In page
	 */
	@FindBy(xpath = "//input[@value='Log In']")
	public WebElement link_SignIn;

	@FindBy(id = "email")
	public WebElement tbx_username;

	@FindBy(id = "pass")
	public WebElement tbx_password;

}

