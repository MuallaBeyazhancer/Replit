package assessment_7;

import java.util.*;

public class Plurulaizer {
	/*
	 * Note that in order to handle cases where the word ends 
	 * in “y” correctly, you will need to take some care. 
	 * It is important that you order your conditions so that 
	 * your code will check for the special case endings of 
	 * “ay”, “oy”, “ey”, and “uy” before simply checking 
	 * whether a word ends in “y”. 
	 */
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("# in:");
	    int amt = inp.nextInt();
	    inp.nextLine(); //this line is necessary
	    System.out.print("word:");
	    String word = inp.nextLine();
	    //leave the above unedited, write your code below:
		    if (amt == 1) {
		    	System.out.println(amt+ " " + word);
		    }else {
		    	if (word.substring(word.length()-2, word.length()).equals("fe")) {
		    		System.out.println(amt+ " " + word.substring(0, word.length()-2)+"ves");
		    	}
		    	
		    	else if (word.substring(word.length()-2, word.length()).equals("sh")) {
		    		System.out.println(amt+ " " + word+"es");
		    	}	    	
		    	else if (word.substring(word.length()-2, word.length()).equals("ch")) {
		    		System.out.println(amt+ " " + word+"es");
		    	}	    	
		    	else if (word.substring(word.length()-2, word.length()).equals("us")) {
		    		System.out.println(amt+ " " + word.substring(0, word.length()-2)+"i");	    	
		    	}
		    	else if (word.substring(word.length()-2, word.length()).equals("ay")) {
		    		System.out.println(amt+ " " + word+"s");
		    	}		    	
		    	else if (word.substring(word.length()-2, word.length()).equals("oy")) {
		    		System.out.println(amt+ " " + word+"s");
		    	}	    
		    	else if (word.substring(word.length()-2, word.length()).equals("ey")) {
		    		System.out.println(amt+ " " + word+"s");
		    	}		    	
		    	else if (word.substring(word.length()-2, word.length()).equals("uy")) {
		    		System.out.println(amt+ " " + word+"s");
		    	}	    	
		    	
		    	else if (word.substring(word.length()-1, word.length()).equals("y")) {
		    		System.out.println(amt+ " " + word.substring(0, word.length()-1)+"ies");
		    	}	    	
		    	else  {
		    		System.out.println(amt+ " " + word+"s");
		    	}		    	
		    	
		    }    
	    
	  }
	}