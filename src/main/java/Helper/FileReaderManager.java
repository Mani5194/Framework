package Helper;

public class FileReaderManager 
{
	public static FileReaderManager fr = new FileReaderManager();
	
	public static FileReaderManager getInstance()
	{
		return fr;
	}
	
	public static ConfigurationManager cr;
	
	public static ConfigurationManager getcr() throws Throwable
	{
		if(null==cr)
		{
			cr= new ConfigurationManager();
		}
		return cr;
		
	}
}