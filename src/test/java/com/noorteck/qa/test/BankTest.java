package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "https://usdemo.vee24.com/#/transactions";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		CommonUI.quitBrowser();

	}
	
	//Test case 1
	public static void BankTestOne() {
		
		homeObj.clickTransfer();
		transferObj.dropdownOriginAccount("value", "Rainy Day");
		transferObj.dropdownDestination("value", "Investing");
		transferObj.enterAmount("1000");
		transferObj.enterSSN("123435677");
		transferObj.enterATM("1235");
		transferObj.clickTransfer();
		
	}
	
	//Test case 2
	public static void BankTestTwo() {
		
		loansObj.enterName("John Cena");
		loansObj.enterAddress("123 Java drive");
		loansObj.dropdownLoanType("value", "Retirement");
		loansObj.enterYear("2");
		loansObj.clickNextOne();
		loansObj.enterAmount("5000");
		loansObj.enterMotherMN("Kim");
		loansObj.enterSSN("123456778");
		loansObj.clickNextTwo();
		loansObj.clickConfirm();
		
		
	}
	
}

































/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/