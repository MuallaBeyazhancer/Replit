package assessment_8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombineToFullName8_2 {
/*
 * Complete the combineNames method to return a new String array that is composed of the first name and last name of each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */
	public static String[] combineNames(String[] first_names, String[] last_names) {
		
		String [] result = new String [first_names.length];
		
		for(int i=0; i<first_names.length;i++) {
			result[i]= first_names[i]+" "+last_names[i];
		}
		
		
			
			
			
			return result;
		}
		
		public static void main(String[] args)
		{
			//feel free to test code here
		}
	}