package replit220_234;
import java.util.ArrayList;
public class _222_MethodsWithArrayList16 {
/*
 * Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

 */
	public static void main(String[] args)
	{
		
	}
	//create your method below
public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
		  ArrayList<Integer> newNums = new ArrayList <>();
		  for(Integer each : nums){
		    newNums.add(each);
		    newNums.add(each);
		  }
//		  for(Integer each : nums){
//		    newNums.add(each);
//		  }
		  return newNums;
		}
	}
