package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI{
	
	@FindBy(css = "#mat-input-6")
	WebElement nameField;
	
	@FindBy(css = "#mat-input-7")
	WebElement addressField;
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-19.ng-star-inserted")
	WebElement loanTypeDropDown;
	
	@FindBy(css = "#mat-input-8")
	WebElement yearField;
	
	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/form/div/button/span")
	WebElement nextButton;
	
	@FindBy(css = "#mat-input-15")
	WebElement amountField;
	
	@FindBy(css = "#mat-input-16")
	WebElement motherName;
	
	@FindBy(css = "#mat-input-17")
	WebElement ssn;
	
	@FindBy(xpath = "//*[@id=\"cdk-step-content-1-1\"]/form/div/button[2]/span")
	WebElement nextSign;
	
	@FindBy(xpath = "//*[@id=\"cdk-step-content-1-2\"]/div/button[1]/span")
	WebElement confirmButton;
	
	public LoansPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterName(String name) {
		enter(nameField, name);
		
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
		
	}
	
	public void dropdownLoanType(String methodName, String indexTextValue) {
		selectFromDropdown(loanTypeDropDown, methodName, indexTextValue);
		
	}
	
	public void enterYear(String year) {
		enter(yearField, year);
		
	}
	
	public void clickNextOne() {
		click(nextButton);
		
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
		
	}
	
	public void enterMotherMN(String maidenName) {
		enter(motherName, maidenName);
		
	}
	
	public void enterSSN(String ssnNumber) {
		enter(ssn, ssnNumber);
		
	}
	
	public void clickNextTwo() {
		click(nextSign);
		
	}
	
	public void clickConfirm() {
		click(confirmButton);
		
	}
	
	
	
	
	

}
