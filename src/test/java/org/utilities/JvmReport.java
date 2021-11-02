package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void generateJvmReport(String jsonpath) {
		//1.Mention the target folder location - File
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports");
		//2.Add details to the report using Configuration class
		Configuration con = new Configuration(f, "Facebook Application");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "94");
		con.addClassifications("PaltformName", "Windows");
		con.addClassifications("Platversion", "Windows10");
		con.addClassifications("Sprint", "23");
		//3.Add json file paths into List<String> (first complete 4th step then come back to 3rd step )
		List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		//4.Create object for ReportBuilder class and using the created object call generateReports() method.
		ReportBuilder r = new ReportBuilder(li,con);
		r.generateReports();
		
		

	}
}
