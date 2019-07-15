package replit220_234;
import java.util.*;

public class _221MethodsWithArrayList15 {
/*
 * search method accepts ArrayList of Strings and String find. 
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"
hint:
use contains string method to test if element has word value in it.


 */
	public static String search(ArrayList<String> r, String find) 
	  {
	    String word = "search failed";
	    for(int i = 0; i < r.size(); i++ ){
	      if(r.get(i).contains(find)){
	        word = r.get(i);
	      }
	    }
	   
	   return word;

	   
	   
	  }//end wineSeller
	  
	  public static void main(String[] args)
	  {
	    
	    ArrayList<String>  arr = new ArrayList<String>();
	    arr.add("2");
	    arr.add("6");
	    arr.add("foo bar");
	    arr.add("abc");
	    
	  
	    String find_tst = search(arr,"foo");
	    System.out.print(find_tst);//foo bar
	   
	    
	  }//end main
	}