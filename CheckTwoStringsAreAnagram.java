package importantPrograms;

import java.util.Arrays;

public class CheckTwoStringsAreAnagram {
	public static void main(String[] args) {
		String s1 = "silent";
		String s2 = "listen";
		
		char[] char1 = s1.toCharArray();
		char[] char2 = s2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(char1.equals(char2))
		{
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}

}
