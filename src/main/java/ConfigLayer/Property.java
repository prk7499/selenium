package ConfigLayer;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import BaseLayer.BaseClass;

public class Property extends BaseClass {

	public static String getProperty(String URL) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\Hybrid\\src\\main\\java\\ConfigLayer\\abc.properties");

		prop.load(fis);

		return prop.getProperty(URL);
	}
}
