package org.C_Execution;


import org.A_PraveenBaseClass.BaseClass;
import org.B_Locators.A_LoginPageLocators;





public class A_LoginPageExe extends A_LoginPageLocators {
	
	public static void username(String username) {
		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.username), username);
	}
	
	public static void password(String password) {
		BaseClass.typeData(BaseClass.findElementid(A_LoginPageLocators.password),password);
	}
	public static void loginButton() {
		BaseClass.click(BaseClass.findElementid(A_LoginPageLocators.login));
	}

}
