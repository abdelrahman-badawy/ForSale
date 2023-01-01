package com.ForSale.testcases;
import org.testng.annotations.Test;

import com.ForSale.base.Base;
import com.ForSale.screens.HomeScreen;

public class HomeScreenTest extends Base {
	
	HomeScreen homeScreen;
	
	@Test
	public void TestCase_ClickPostAnAd() {
		
		homeScreen = new HomeScreen();
		System.out.println("Click Post an Ad");
		homeScreen.clickPostanad();
		
		
	}

}
