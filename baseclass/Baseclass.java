package www.app.baseclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver = null;

	public static void browser() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

	}

	public static void inputValue(WebElement element, String data) {
		try {
			element.clear();
			element.sendKeys(data);
		} catch (NoSuchElementException a) {
			throw new RuntimeException("Data not passed");
		}

	}

	public static void clickButton(WebElement element) {
		try {
			element.click();

		} catch (NoSuchElementException a) {
			throw new RuntimeException("Unable to click");

		}

	}

	public static String inputProperties(String Key) {
		String value = null;
		try {
			File file = new File("C:\\Users\\kaviy\\eclipse-workspace\\Sample\\src\\test\\resources\\data.properties");

			FileReader read = new FileReader(file);
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(Key);
			System.out.println(prop.getProperty(Key));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

}
