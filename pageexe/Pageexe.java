package www.app.pageexe;

import www.app.pageobject.Pageobject;
import www.base.BaseClass;
import www.locator.PFLocator;

public class Pageexe extends Pageobject{
	
//	public static void user(String data) {
//		BaseClass.inputvalue(Pageobject.user(),data);
//		
//		
//	}
//	
//	public static void pass(String data) {
//		BaseClass.inputvalue(Pageobject.pass(),data);
//		
//		
//	}
	
	public static void user(String data) {
		BaseClass.inputvalue(Pageobject.user(), BaseClass.inputProperties("username"));
		
		
	}
	
	public static void pass(String data) {
		BaseClass.inputvalue(Pageobject.pass(), BaseClass.inputProperties("password"));

	}
	
	public static void click() {
		BaseClass.clickvalue(Pageobject.login());
		
		
	}

}
