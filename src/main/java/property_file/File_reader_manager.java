package org.property_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_reader_manager {
	
	public static Properties p;
	
	public File_reader_manager() throws IOException {
		File f=new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Maven_project_training\\src\\main\\java\\org\\property_file\\Amazon.properties");
		FileInputStream fis = new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getfind() {
		String find = p.getProperty("find");
		return find;
	}
	
	public String getsnip() {
		String snip = p.getProperty("snip");
		return snip;
	}
	
}
