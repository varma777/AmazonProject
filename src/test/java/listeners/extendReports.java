package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendReports {

	public static ExtentReports extendsReports() {
	
	 String path = System.getProperty("users.dir")+"ExtentReport//report.html";

	 ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	 reporter.config().setReportName("QA Vinecnt REPORT");
	 reporter.config().setDocumentTitle("AMAZON AUTOMATON TESTING");
	 
	 ExtentReports extent = new  ExtentReports();
	 extent.attachReporter(reporter);
	 extent.setSystemInfo("Vincent", "AMAZON-COMMERCE");
	 return extent;
	 
	}

}
