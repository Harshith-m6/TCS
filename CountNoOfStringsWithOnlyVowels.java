package importantPrograms;

public class CountNoOfStringsWithOnlyVowels {
	public static void main(String[] args) {
		String str = "aeixyzou";
		int count =0;
		int len =0;
		for(char c : str.toCharArray())
		{
			if(vowel(c))
			{
				len++;
			}else {
				count+=len*(len+1)/2;
				len=0;
			}
		}
		count+=len*(len+1)/2;
		System.out.println(count);
	}
	
	public static boolean vowel(char c)
	{
		if("aeiou".indexOf(c)!=-1)
		{
			return true;
		}
		return false;
	}

}
