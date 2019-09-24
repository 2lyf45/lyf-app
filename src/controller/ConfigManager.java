package controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
	private static ConfigManager configManager;
	private static Properties properties;
	private ConfigManager(){
		//运行期间，执行一次的操作
		String configFile = "database.properties";
		properties = new Properties();
		InputStream is = ConfigManager.class.getClassLoader().getResourceAsStream(configFile);
		try {
			properties.load(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static class ConfigmanagerHelper{
		private static final ConfigManager INSTANCE = new ConfigManager();
	}
	public static ConfigManager getInstance(){
		configManager = ConfigmanagerHelper.INSTANCE;
		return configManager;
	}
	public String getValue(String key){
		return properties.getProperty(key);
	}
}
