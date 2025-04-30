package LoginFunAutomationSuite;

import java.util.Arrays;
import java.util.List;

public class ParallelTestRunner {
	 public static void main(String[] args) {
	        List<String> browsers = Arrays.asList("chrome", "edge");

	        for (String browser : browsers) {
	            Thread thread = new Thread(new BrowserTestTask(new LoginTest(browser)));
	            thread.start();
	        }
	    }
	}
