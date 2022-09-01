package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseLayer.BaseClass;

public class ExtentReportSetup extends BaseClass {

	protected static ExtentReports extent;

	public static ExtentReports extentReportMethod() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"C:\\Users\\admin\\eclipse-workspace\\Hybrid\\Reports");
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("PiM test cases");
		sparkReporter.config().setTheme(Theme.DARK);
		return extent;

	}

}
