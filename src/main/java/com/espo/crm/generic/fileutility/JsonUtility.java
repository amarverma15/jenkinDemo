package com.espo.crm.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {

	public String getDataFromJsonFile(String key) throws IOException, ParseException {
		FileReader fr = new FileReader("./src/test/resources/commondata.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(fr);
		
		JSONObject map = (JSONObject)obj;   // Down-casting
		String data = (String)map.get(key);
		return data;
		
	}
}
