package com.espo.crm.generic.fileutility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readDataFromPropertiesFile(String key) throws IOException {
		
		// Create object for FileInputStream class from java.io
		FileInputStream fis = new FileInputStream("./src/main/resources/commondata.properties");
		
		// Create object for file type class (properties) from java.util to open the file
		Properties prop = new Properties();
		
		// Load all data into test script
		prop.load(fis);
		
		// Read data from the loaded file
		String value = prop.getProperty(key);
		
		return value;
		
	}
}
