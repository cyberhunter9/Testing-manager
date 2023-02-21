package org.C_Execution;

import org.A_PraveenBaseClass.BaseClass;
import org.B_Locators.B_SearchHotelLocators;




public class B_SearchHotelPageExe extends B_SearchHotelLocators{
	
	
	public static void location() {
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.location),
				"Melbourne");
	}
	
	public static void hotels()
	{
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.hotels), "Hotel Cornice");
	}
	
	public static void RoomType()
	{
		BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.RoomType), "Deluxe");
	}
	
    public static void NumberofRooms()
    {
    	BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.NumberofRooms), "1");
    }
    
    
    public static void CheckIn()
    {
    	BaseClass.clear(BaseClass.findElementid(B_SearchHotelLocators.CheckIn));
    	BaseClass.typeData(BaseClass.findElementid(B_SearchHotelLocators.CheckIn), BaseClass.ReadAllCredentialsFromExcel(0, 1, "SearchHotel", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
    	
    }
    public static void CheckOut()
    {
    	BaseClass.clear(BaseClass.findElementid(B_SearchHotelLocators.CheckOut));
    	BaseClass.typeData(BaseClass.findElementid(B_SearchHotelLocators.CheckOut), BaseClass.ReadAllCredentialsFromExcel(1, 1, "SearchHotel", "C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx"));
    }
	
    public static void Adults() 
    {
    	BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.Adults), "3");
	}
    
    public static void Children() 
    {
    	BaseClass.selectValue(BaseClass.findElementid(B_SearchHotelLocators.Children), "2");
	}
    
    public static void Search()
    {
		BaseClass.click(BaseClass.findElementname(B_SearchHotelLocators.Search));
    }
    
}
