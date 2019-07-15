package replit220_234;

public class _232CountLetters {
	/*
	 *input: countLetters("aaabbcccc");
      output: "3a2b4c" 
      Because, there are 3 a's, 2 b's and 4 c's
	 * Write a method countLetters that can count letters in a given string and return a new string in the given format:
	 */
	public static String countLetters(String str){
	    
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                    if (str.charAt(j) == '#') {
                        count = 0;
                    }
                }
            }
            if (count > 0) {
                result += count + "" + str.charAt(j);
                str = str.replaceAll("" + str.charAt(j), "#");
            }
        }
        return result;
    }
}

