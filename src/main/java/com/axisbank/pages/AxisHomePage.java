package com.axisbank.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.axis.util.Waits;
import com.keyword.axis.UIKeywords;

public class AxisHomePage {
UIKeywords keywords = UIKeywords.getInstance();

@FindBy(css="#screen_takeover_outer div.close_button")
public List<WebElement> closeButton;
@FindBy(css="#nvpush_cross")
public WebElement npush_cross;
@FindBy(xpath = "//a[contains(text(),'Grab Deals')]")
public WebElement grab;
public void closeButton() {
	Iterator<WebElement> itr=closeButton.iterator();
	while (itr.hasNext()) {
		WebElement webElement = (WebElement) itr.next();
		System.out.println(webElement.getText());
	if (webElement.getText().equals("X")) {
		webElement.click();
		System.out.println("GGG");
	}
	}
}
public void npucross() {
	Waits.elementToBeClickable(npush_cross);
	npush_cross.click();
	System.out.println("hhhh");
}

}
