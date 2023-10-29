package Base;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.crypto.RuntimeCryptoException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browser) 
	{
		try {
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			// TODO: handle exception
		}
		
	}
	
	public static void getURL(String url)
	{
		try {
		driver.get(url);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			// TODO: handle exception
		}
	}
	
	public static void elementToBeClicked(WebElement element)
	{
		try 
		{
		elementVisible(element);
		if(elementIsDispalyed(element))
		{
		element.click();
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			// TODO: handle exception
		}
	}
	
	public static void elementVisible(WebElement element)
	{
		try {
		WebDriverWait wb = new WebDriverWait(driver, 60);
		wb.until(ExpectedConditions.visibilityOf(element));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			
		}
	}
	public static boolean elementIsDispalyed(WebElement element)
	{
		try {
		boolean displayed = element.isDisplayed();
		return displayed;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			
		}
	
	}
	
	public static void dataPassing(WebElement element, String user)
	{
		try 
		{
		elementVisible(element);
		if(elementIsDispalyed(element))
		{
		element.sendKeys(user);
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			// TODO: handle exception
		}
	}
}