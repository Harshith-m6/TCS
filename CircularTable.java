package importantPrograms;

import java.util.Scanner;

public class CircularTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long fact = factorial(n-1);
		long result = 2*fact;
		
		System.out.println(result);
		sc.close();
	}
	public static long factorial(int n)
	{
		long fact=1;
		for(int i=1; i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
