package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationManager 
{
	Properties ps = new Properties();
	
	public ConfigurationManager() throws Throwable
	{
		File file = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\Properties\\Config.properties");
		FileInputStream fis= new FileInputStream(file);
		ps.load(fis);
				
	}
	
	public String getBrowser()
	{
		String browser = ps.getProperty("browser");
		return browser;
	}
	
	public String getUrl()
	{
		String url = ps.getProperty("url");
		return url;
	}
}