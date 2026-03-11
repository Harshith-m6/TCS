package importantPrograms;

import java.util.Scanner;

public class ToggleBitsAndDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value");
		int n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		StringBuilder toggled = new StringBuilder();
		for(char c : bin.toCharArray())
		{
			if(c=='0')
			{
				toggled.append('1');
			}else {
				toggled.append('0');
			}
		}
		int result = Integer.parseInt(toggled.toString(),2);
		System.out.println(result);
		
	}

}
