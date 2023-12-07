package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {
	
	public static Properties p;
	public static void loadProperties() throws IOException  {
		
		p = new Properties();
		//System.out.println(System.getProperty("user.dir"));
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		p.load(fis);
	}

}
