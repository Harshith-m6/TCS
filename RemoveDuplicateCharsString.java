package importantPrograms;

import java.util.HashSet;

public class RemoveDuplicateCharsString {
	public static void main(String[] args) {
		String str = "programming";
		HashSet<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		for(char c : str.toCharArray())
		{
			if(!set.contains(c))
			{
				set.add(c);
				result.append(c);
			}
		}
		System.out.println(result);
	}

}
