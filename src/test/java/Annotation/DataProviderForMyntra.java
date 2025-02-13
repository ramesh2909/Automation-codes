package Annotation;

import org.testng.annotations.DataProvider;

public class DataProviderForMyntra {


	@DataProvider
	public String[] myntra() {
		
		String data [] = new String[5];
		
		data[0] = "garnier";
		data[1] = "sandle";
		data[2] = "shoes";
		data[3] = "ear rings";
		data[4] = "sunglases";
		return data;
		
	}
}
