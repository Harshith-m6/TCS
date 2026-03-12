package importantPrograms;

import java.util.HashMap;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "aabbcdde";
		HashMap<Character , Integer> freq = new HashMap<>();
		for(char c : str.toCharArray())
		{
			freq.put(c, freq.getOrDefault(freq, 0)+1);
		}
		
		for(char c : str.toCharArray())
		{
			if(freq.get(c)==1)
			{
				System.out.println(c);
				break;
			}
		}
	}

}
