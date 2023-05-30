package Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class java_test_script {






	

		
		
		@Test
		public void titlecheck() throws MalformedURLException {
			
			// test
			MutableCapabilities caps = new MutableCapabilities();
			
			WebDriver driver = new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
			
			
			driver.get("https://git-scm.com/download/win");
			
			//Assert.assertTrue(driver.getTitle().matches("Git - Downloading Package"));
			
		}
		
		
	}

	

