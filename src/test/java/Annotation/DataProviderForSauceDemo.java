package Annotation;

import org.testng.annotations.DataProvider;

public class DataProviderForSauceDemo {

	@DataProvider
	public String[][] login() {
		
		String data [][] = new String[6][2];
//		id
		data[0][0] = "standard_user";
		data[1][0] = "locked_out_user";
		data[2][0] = "problem_user";
		data[3][0] = "performance_glitch_user";
		data[4][0] = "error_user";
		data[5][0] = "visual_user";
//		passwd
		data[0][1] = "secret_sauce";
		data[1][1] = "secret_sauce";
		data[2][1] = "secret_sauce";
		data[3][1] = "secret_sauce";
		data[4][1] = "secret_sauce";
		data[5][1] = "secret_sauce";
		return data;
		
	}
}
