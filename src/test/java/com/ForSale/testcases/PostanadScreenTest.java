package com.ForSale.testcases;

import org.testng.annotations.Test;

import com.ForSale.base.Base;
import com.ForSale.screens.PostanadScreen;

public class PostanadScreenTest extends Base {
	
	PostanadScreen postanadScreen ;
	
	@Test
	public void TestCase_DisplayRequiredDataMessage() {
		
		postanadScreen = new PostanadScreen();
		postanadScreen.chooseCategory();
		postanadScreen.chooseService();
		postanadScreen.choosePackandmove();
		postanadScreen.clickNext();
		postanadScreen.fillRequireddatamessage();
	}
	
	@Test
	public void TestCase_ResumeAdDetails() {
		
		postanadScreen.clickLocation();
		postanadScreen.clickDistrict();
		postanadScreen.selectAhmadidistrict();
		postanadScreen.clickDistrictdone();
		postanadScreen.clickArea();
		postanadScreen.selectMiddleofahmadiarea();
		postanadScreen.clickAreadone();
		postanadScreen.clickBlock();
		postanadScreen.selectBlock9();
		postanadScreen.clickBlockdone();
		postanadScreen.clickLocationdone();
		postanadScreen.addTitle("customer");
		postanadScreen.clickNext();
		
	}

}
