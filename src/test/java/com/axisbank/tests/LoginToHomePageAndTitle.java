package com.axisbank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.axis.config.BaseClass;
import com.keyword.axis.UIKeywords;

public class LoginToHomePageAndTitle extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
	String expectedTittle = "Personal Banking | Internet Banking | Corporate, NRI Banking Services Online - Axis Bank";
	@Test
	public void CheckTheLoginURL() {
	String actualUrl = keyword.getCurrentURl();
	System.out.println(actualUrl + "\tTitle of Page:" + keyword.getTitleOfPage());
	Assert.assertEquals(keyword.getTitleOfPage(), expectedTittle);
	
	}

}
