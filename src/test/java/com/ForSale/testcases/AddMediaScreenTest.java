package com.ForSale.testcases;

import org.testng.annotations.Test;

import com.ForSale.base.Base;
import com.ForSale.screens.AddmediaScreen;

public class AddMediaScreenTest extends Base {
	
	AddmediaScreen addmediaScreen;
	
	@Test
	public void TestCase_NavigationToAddMediaScreen() {
		
		addmediaScreen = new AddmediaScreen();
		addmediaScreen.validateUserNavigatedToAddMedia();
	}

}
