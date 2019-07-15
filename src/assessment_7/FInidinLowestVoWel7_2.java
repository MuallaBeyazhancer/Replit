package assessment_7;

public class FInidinLowestVoWel7_2 {
	public static void main(String[] args) 
	{
		String[] arr = {"hey","yolo","hi","this is long"};
		System.out.println(minVowels(arr));
		//should print "hi"
	}
public static String minVowels(String[] words)
	{
		 String least = words[0];
	        for (int i = 0 ; i < words.length ; i++) {
	            if ((words[i].length()< least.length())) {
	                least = words[i];
	            }else if(words[i].length() == least.length()) {
	            	least = least;
	            }
	        } 
	        return least;
	    }
		
	
	public static int countVowels(String s)
	{ 
		String lowerCaseString = s.toLowerCase();
	    int vowelCount = 0;
	    for (int i = 0; i < lowerCaseString.length(); ++i){
        Character charCharacter = lowerCaseString.charAt(i);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        if(isVowel(s.charAt(i))){
            vowelCount += 1;
        }
    }
    return vowelCount;
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'a' ||
			   ch == 'e' ||
			   ch == 'i' ||
			   ch == 'o' ||
			   ch == 'u';
	}
}