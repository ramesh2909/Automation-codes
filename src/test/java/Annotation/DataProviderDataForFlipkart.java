package Annotation;

import org.testng.annotations.DataProvider;

public class DataProviderDataForFlipkart {
	
	@DataProvider
	public String[] flipkart() {
		
		String data [] = new String[5];
		
		data[0] = "inphone 15";
		data[1] = " iqoo 13";
		data[2] = "shoes";
		data[3] = "watch";
		data[4] = "sunglases";
		return data;
		
	}

}
