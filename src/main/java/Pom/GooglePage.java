package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Gmail']") 
	public static WebElement gmail;
	
	public GooglePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGmail()
	{
		return gmail;
	}
	
	
}