package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath=("//div[text()='Dedeepya Sukhavasi']"))
	WebElement name;
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean isDisplayed() {
		return name.isDisplayed();
	}
}
