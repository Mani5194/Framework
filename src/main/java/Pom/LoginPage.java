package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Sign in']")
	public static WebElement signin;
	
	@FindBy(id = "identifierId")
	public static WebElement username;
	
	@FindBy(id = "identifierNext")
	public static WebElement login;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement signIn() 
	{
		return signin;
	}
	
	public WebElement userName() 
	{
		return username;
	}
	public WebElement logIn() 
	{
		return login;
	}
	
}



