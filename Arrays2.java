package importantPrograms;

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args) {
		System.out.println("Enter the Decimal number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		System.out.println(bin);
		StringBuilder toggle = new StringBuilder();
		for(char c : bin.toCharArray())
		{
			if(c=='0') {
				toggle.append('1');
			}else {
				toggle.append('0');
			}
		}
		System.out.println(toggle);
		int result = Integer.parseInt(toggle.toString(), 2);
		System.out.println(result);
	}

}
