package com.axisbank.tests;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.axisbank.pages.AxisHomePage;
import com.axisbank.pages.GrabTheDealsPage;
import com.keyword.axis.UIKeywords;

public class GrabTheDealsTest {
	public static RemoteWebDriver driver;
	UIKeywords keyword = UIKeywords.getInstance();
	@Test
	public void GrabTheDealsTests() {
		keyword.OpenBrow("CHROME");
		keyword.launchUrl("https://www.axisbank.com/explore-grab-deals");
		AxisHomePage ahp=PageFactory.initElements(UIKeywords.getInstance().driver, AxisHomePage.class);
		ahp.npucross();
		keyword.m1();
		GrabTheDealsPage gDP = PageFactory.initElements(UIKeywords.getInstance().driver, GrabTheDealsPage.class);
		gDP.loginBtnClick();
		Actions act= new Actions(keyword);
		act.moveToElement(gDP.LoginBtn, 300,400);
		act.contextClick();
		act.click();
		act.build();
		act.perform();
System.out.println("dusj>>>");
	}
}
