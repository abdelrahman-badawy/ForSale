package com.ForSale.screens;

import org.openqa.selenium.WebElement;
import com.ForSale.base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class PostanadScreen extends Base{
	
	@AndroidFindBy (id = "com.forsale.forsale:id/chooseCategoryField")
	private WebElement category;
	
	@AndroidFindBy (xpath = "//*[@bounds='[964,602][1030,668]']")
	private WebElement services;
	
	@AndroidFindBy (xpath = "//*[@text='Pack & Move']")
	private WebElement packAndMove;
	
	@AndroidFindBy (xpath = "//*[@bounds='[66,2012][1014,2134]']")
	private WebElement next;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/toolbar")
	private WebElement validationMessage;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/chooseDistrictField")
	private WebElement loction;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/locationSelectorText")
	private WebElement district;
	
	@AndroidFindBy (xpath = "//*[@text='Ahmadi']")
	private WebElement ahmadiDistrict;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/btnProceed")
	private WebElement districtDone;
	
	@AndroidFindBy (xpath = "//*[@text='Choose Area']")
	private WebElement area;
	
	@AndroidFindBy (xpath = "//*[@text='Middle of Ahmadi']")
	private WebElement middleOfAhmadiArea;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/btnProceed")
	private WebElement areaDone;
	
	@AndroidFindBy (xpath = "//*[@text='Choose Block']")
	private WebElement block;
	
	@AndroidFindBy (xpath = "//*[@text='Block 9']")
	private WebElement block9;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/btnProceed")
	private WebElement blockDone;
	
	@AndroidFindBy (xpath = "//*[@text='Done']")
	private WebElement locationDone;
	
	@AndroidFindBy (id = "com.forsale.forsale:id/adTitleField")
	private WebElement title;
	
	public void chooseCategory() {
		category.click();
	}
	
	public void chooseService() {
		services.click();
	}
	
	public void choosePackandmove() {
		packAndMove.click();
	}
	
	public void clickNext() {
		next.click();
	}
	
	public void fillRequireddatamessage() {
		if (validationMessage.isDisplayed())
			System.out.println("Fill required information message is displayed");
		else
			System.out.println("Fill required information message is not displayed");
	}
	
	public void clickLocation() {
		loction.click();
	}
	
	public void clickDistrict() {
		district.click();
	}
	
	public void selectAhmadidistrict() {
		ahmadiDistrict.click();
	}
	
	public void clickDistrictdone() {
		districtDone.click();
	}
	
	public void clickArea() {
		area.click();
	}
	
	public void selectMiddleofahmadiarea() {
		middleOfAhmadiArea.click();
	}
	
	public void clickAreadone() {
		areaDone.click();
	}
	
	public void clickBlock() {
		block.click();
	}
	
	public void selectBlock9() {
		block9.click();
	}
	
	public void clickBlockdone() {
		blockDone.click();
	}
	
	public void clickLocationdone() {
		locationDone.click();
	}
	
	public void addTitle(String Title) {
		title.sendKeys(Title);
	}
	
	

}
