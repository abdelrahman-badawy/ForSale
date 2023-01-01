package com.ForSale.screens;

import org.openqa.selenium.WebElement;
import com.ForSale.base.Base;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class HomeScreen extends Base {
	
	@AndroidFindBy (id = "com.forsale.forsale:id/navgraph_postad")
	private WebElement postAnAd;
	
	public void clickPostanad() {
		postAnAd.click();
	}

}
