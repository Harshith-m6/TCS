package importantPrograms;

import java.util.Scanner;

public class FactorialWithoutMul {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(factorial(sc.nextInt()));
		}
	}
	
	public static int factorial(int n)
	{
		int fact =1;
		for(int i = 2 ; i<=n ;i++)
		{
			fact = multiply(fact,i);
		}
		return fact;
	}
	public static int multiply(int a , int b)
	{
		int result = 0;
		for(int i=0; i<b ; i++)
		{
			result+=a;
		}
		return result;
	}

}
