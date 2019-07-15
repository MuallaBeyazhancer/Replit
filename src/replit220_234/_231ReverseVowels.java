package replit220_234;
import java.util.*;
public class _231ReverseVowels {
	/*
	 * Reverse a vowels of string without affecting any other characters.
Write a method reverseVowels() that will return a string with reversed vowels.
	 */
	 public String reverseVowels(String str) {
		    ArrayList<String> vowels = new ArrayList<>();
		    vowels.add("a");
		    vowels.add("e");
		    vowels.add("i");
		    vowels.add("o");
		    vowels.add("u");

		   ArrayList<String> words = new ArrayList<>();
		   for(int i = 0; i<str.length(); i++){
		     words.add(""+str.charAt(i));
		   }
		   ArrayList<String> words2 = new ArrayList<>();
		     for(int i = words.size()-1; i>=0; i--){
		       if(vowels.contains(words.get(i))){
		         words2.add(words.get(i));
		       }
		     }
		     for(int i = 0; i<words.size(); i++){
		       if(!vowels.contains(words.get(i))){
		         words2.add(i, words.get(i));
		       }
		     }
		       String result = "";
		       for(int i = 0; i < words2.size(); i++){
		         result += words2.get(i);
		       }
		     
		     return result;
		   
		  }
		  
		  
		}
