package importantPrograms;

import java.util.Scanner;

public class NumberToWords {
	
	static String[] ones =  {"", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"};
	static String[] tens = {"", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy",
            "eighty", "ninety"};
	static String[] teens = {"ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen"};
	
	public static void convert(int n)
	{
		if(n==0)
		{
			System.out.println("Zero");
			return;
		}
		
		String result ="";
		int thousand= n/1000;
		int hundred = (n%1000)/100;
		int ten = (n%100)/10;
		int one = n%10;
		
		if(thousand>0)
		{
			result+=ones[thousand]+"thousand ";
		}
		
		if(hundred>0)
		{
			result+=ones[hundred]+"hundred ";
		}
		
		int teen = n%100;
		
		if(teen>=10&&teen<=19)
		{
			result+=teens[teen-10];
		}else {
			if(ten>1)
			{
				result+=tens[ten]+" ";
			}
			
			if(one>0)
			{
				result+=ones[one];
			}
		}
		
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		
		for(int i=0; i<L ; i++)
		{
			convert(sc.nextInt());
		}
	}

}
