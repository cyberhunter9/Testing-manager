package org.C_Execution;


import org.B_Locators.D_BookPage;
import org.A_PraveenBaseClass.BaseClass;


public class D_BookExc extends D_BookPage {
	
	public static void firstName()
	{
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.firstName), BaseClass.ReadAllCredentialsFromExcel(1, 0, "Booking", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
	}
	
	
	
	public static void secName()
	{
		BaseClass.typeData(BaseClass.findElementid(D_BookPage.secName), BaseClass.ReadAllCredentialsFromExcel(1, 1, "Booking", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
	}

	public static void billing()
	{
		BaseClass.typeData(BaseClass.findElementid(D_BookPage.billing), BaseClass.ReadAllCredentialsFromExcel(1, 2, "Booking", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
	}

	
	public static void card()
	{
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.card), BaseClass.ReadAllCredentialsFromExcel(1, 3, "Booking", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
	}
	
	public static void CardType()
	{
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.CardType), "AMEX");
	}
	
	
	public static void month()
	{
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.month), "3");
	}
	
	public static void year()
	{
		BaseClass.selectValue(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.year), "2015");
	}
	
	public static void ccv()
	{
		BaseClass.typeData(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.ccv),BaseClass.ReadAllCredentialsFromExcel(1, 4, "Booking", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
	}
	public static void submit()
	{
		BaseClass.click(org.A_PraveenBaseClass.BaseClass.findElementid(D_BookPage.submit));
	}
	
	
	
	
	
	
	
}
