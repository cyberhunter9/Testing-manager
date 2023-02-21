package org.C_Execution;




import org.A_PraveenBaseClass.BaseClass;
import org.B_Locators.C_RadioButtonLocators;


public class C_RadioButtonExe extends C_RadioButtonLocators{

	public static void RadioButton() throws InterruptedException
	{
		Thread.sleep(3000);
		BaseClass.click(BaseClass.findElementid(C_RadioButtonLocators.RadioButton));
	}
	
	public static void RadioSearch()
	{

		BaseClass.click(BaseClass.findElementname(C_RadioButtonLocators.RadioSearch));
	}
}
