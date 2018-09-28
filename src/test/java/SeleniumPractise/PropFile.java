package SeleniumPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ABI\\eclipse-workspace\\NaveenAL\\src\\test\\java\\SeleniumPractise\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
	}

}
