package org.property_file;

import java.io.IOException;

public class Configuration_reader {
	
	private Configuration_reader() {
		// TODO Auto-generated constructor stub
	}
	
	public static Configuration_reader getInstancecfr() {
		
		Configuration_reader cfr=new Configuration_reader();
		return cfr;
	}
	
	public  File_reader_manager getInstancefrm() throws IOException {
		
		File_reader_manager frm=new File_reader_manager();
		return frm;
		
	}
	
}
