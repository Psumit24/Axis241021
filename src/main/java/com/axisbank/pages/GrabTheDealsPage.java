package com.axisbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GrabTheDealsPage {
@FindBy(css="div.loginClk")
public WebElement LoginBtn;
public void loginBtnClick() {
	LoginBtn.click();
	System.out.println("123456>>>");
}
}
