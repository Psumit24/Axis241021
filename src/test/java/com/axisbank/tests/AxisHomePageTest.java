package com.axisbank.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.axis.config.BaseClass;
import com.axisbank.pages.AxisHomePage;
import com.keyword.axis.UIKeywords;

public class AxisHomePageTest extends BaseClass {
	UIKeywords keyword = UIKeywords.getInstance();
@Test
	public void tc_01() {
	AxisHomePage ahp=PageFactory.initElements(UIKeywords.getInstance().driver, AxisHomePage.class);
ahp.closeButton();
ahp.grab.click();
ahp.npucross();
}
}
