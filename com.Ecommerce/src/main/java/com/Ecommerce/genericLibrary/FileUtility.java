package com.Ecommerce.genericLibrary;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class FileUtility {

	FileInputStream f;
	Properties p;

	/**
	 * @author AMAN SINGH it is used to retrieve the data from property file
	 * @return
	 */
	public String getDataFromProperty(String path, String key) {
		try {
			f = new FileInputStream(path);
			p = new Properties();
			p.load(f);
		} catch (Exception e) {
			Reporter.log("exception handled");
		}
		return p.getProperty(key);
	}

}
