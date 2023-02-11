package supertailsTest.config;

public class TestSetup {
	public static String URI="https://supertails.com";
	
	public static void driverConfig() {
		String path="D:\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	}
	
	

}
