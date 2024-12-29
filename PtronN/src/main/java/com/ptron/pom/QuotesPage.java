package com.ptron.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuotesPage {
@FindBy(id = "Quotes")
private WebElement QuotesButton;
@FindBy(xpath = "//td[@class='title hline']//input")
private WebElement NewQuoteButton;
@FindBy(xpath = "//table[@id='secContent1']//input[@name='property(Subject)']")
private WebElement SubjectTextBox;
@FindBy(xpath = "//img[@title='Account Name Lookup']")
private WebElement AccountNameLookUpIcon;
@FindBy(name = "fldValue")
private WebElement ChildWindowSearchTestFeild;
@FindBy(xpath ="//input[@value='Go']")
private WebElement ChildWindowSearchTestFeildGoButton;
@FindBy(xpath = "//a[contains(@onclick,'se')]")
private WebElement ChildWindowSearchTestFeildGoButtonSearchedAccount;
@FindBy(xpath = "//table[@id='secContent3']//img[contains(@src,'ts_small.gif')]")
private WebElement ProductNameLookUpIcon;
@FindBy()
private WebElement;
@FindBy()
private WebElement;
}
