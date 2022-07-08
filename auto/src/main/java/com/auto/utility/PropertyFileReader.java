package com.auto.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static String ReadData(String key) {
		Properties prop = new Properties();
		File file = new File(new PathFormer().constructPath("test\\resources\\config.properties"));
		
		try {
			FileReader reader = new FileReader(file);
			prop.load(reader);
		} catch (IOException e) {
			System.out.println("could not read data value from property file");
			e.printStackTrace();
		}
		return prop.getProperty(key);
 	}
}
