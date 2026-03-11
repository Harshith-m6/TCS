package importantPrograms;

import java.util.Scanner;

public class MaxCharInSubString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pack = sc.next();
		int size = sc.nextInt();
		int maxA=0;
		for(int i=0 ; i<pack.length();i++)
		{
			int count =0;
			int end = Math.min(i+size, pack.length());
			for(int j=i ; j<end ; j++)
			{
				if(pack.charAt(j)=='a')
				{
					count++;
				}
			}
			
			if(count>maxA)
			{
				maxA=count;
			}
		}
		
		System.out.println(maxA);
		sc.close();
	}

}
