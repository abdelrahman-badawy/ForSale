package com.ForSale.screens;

import org.openqa.selenium.WebElement;


import com.ForSale.base.Base;

import io.appium.java_client.pagefactory.AndroidFindBy;


public class AddmediaScreen extends Base{
	
	@AndroidFindBy (xpath = "//*[@text='Add Media']")
	private WebElement addMedia;
	
	public void validateUserNavigatedToAddMedia() {
		if (addMedia.isDisplayed())
			System.out.println("Customer is navigated to Add Media screen");
		else
			System.out.println("Customer is not navigated to Add Media screen");
	}

}
