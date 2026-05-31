package singleton;

public class ConfigSingleton {
	private static ConfigSingleton instance;
	
	private ConfigSingleton() {
	}
	
	public static synchronized ConfigSingleton getInstance() {
		if (instance == null) {
			instance = new ConfigSingleton();
			return instance;
		}
		
		return instance;
	}
}
