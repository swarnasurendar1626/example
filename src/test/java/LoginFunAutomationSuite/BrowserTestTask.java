package LoginFunAutomationSuite;

public class BrowserTestTask implements Runnable {
    private final BrowserActions test;

    public BrowserTestTask(BrowserActions test) {
        this.test = test;
    }

    public void run() {
        test.runTest();
    }
}