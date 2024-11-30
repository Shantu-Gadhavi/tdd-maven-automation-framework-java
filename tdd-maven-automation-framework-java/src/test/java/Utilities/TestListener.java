package Utilities;

import org.testng.*;

import javax.sound.midi.Soundbank;

public class TestListener implements ITestListener, IClassListener, ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
    }

    @Override
    public void onFinish(ISuite suite) {
    }

    @Override
    public void onBeforeClass(ITestClass testClass) {
    }

    @Override
    public void onAfterClass(ITestClass testClass) {
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Execution started.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Execution passed.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Execution failed.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Execution skipped.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

        this.onTestFailure(result);
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
