package www.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import www.app.baseclass.Baseclass;

public class Pageobject extends Baseclass{
	public static WebElement user() {
		return driver.findElement(By.id("username"));
		}
	
	public static WebElement pass() {
		return driver.findElement(By.id("password"));
		}
	
	public static WebElement login() {
		return driver.findElement(By.id("login"));
		}

}
