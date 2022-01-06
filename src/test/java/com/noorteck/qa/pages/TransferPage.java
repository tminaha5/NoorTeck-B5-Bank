package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI{
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-9.ng-star-inserted")
	WebElement originAccountDropdown;
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-11.ng-star-inserted")
	WebElement destinationDropDown;
	
	@FindBy(css = "#mat-input-3")
	WebElement amountField;
	
	@FindBy(css = "#mat-input-4")
	WebElement ssnField;
	
	@FindBy(css = "#mat-input-5")
	WebElement atmField;
	
	@FindBy(xpath = "//span[contains(text(), 'Transfer Funds')]")
	WebElement transferFundsButton;
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void dropdownOriginAccount(String methodName, String indexTextValue) {
		selectFromDropdown(originAccountDropdown, methodName, indexTextValue);
	}
	
	public void dropdownDestination(String methodName, String indexTextValue) {
		selectFromDropdown(destinationDropDown, methodName, indexTextValue);
		
	}

	public void enterAmount(String amount) {
		enter(amountField, amount);
		
	}
	
	public void enterSSN(String ssn) {
		enter(ssnField, ssn);
		
	}
	
	public void enterATM(String atm) {
		enter(atmField, atm);
		
	}
	
	public void clickTransfer() {
		click(transferFundsButton);
		
	}
	
	
}
