package org.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
//	public static void main(String[] args) {
//		String p = System.getProperty("user.dir");
//		System.out.println(p+"\\src\\test\\resource");	}
	public static void generateJVMReport(String json) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
//		1.Configuration
		Configuration con= new Configuration(f, "Facebook");
		con.addClassifications("BrowserName", "Chrome");
		con.addClassifications("BrowserVersion", "91");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Sprint", "21");
//		2.ReportBuilder
		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r= new ReportBuilder(jsonFiles, con);
		r.generateReports();	}}