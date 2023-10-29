package TestRunner;

import org.bouncycastle.crypto.RuntimeCryptoException;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.BaseClass;
import Helper.FileReaderManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Manikandan\\eclipse-workspace\\TCF_PROJECT1\\src\\main\\resources\\Config\\smoke.feature",
		
glue = "StepDefinition")


public class TestRunner extends BaseClass
{				
	public static WebDriver driver;

	@BeforeClass
	public static void setuplauch() throws Throwable {
		try {
		String browser = FileReaderManager.getInstance().getcr().getBrowser();
		driver=	BaseClass.launchBrowser(browser);
		String url = FileReaderManager.getInstance().getcr().getUrl();
		getURL(url);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new RuntimeCryptoException();
			// TODO: handle exception
		}
	}
}