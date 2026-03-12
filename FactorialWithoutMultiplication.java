package importantPrograms;

import java.util.Scanner;

public class FactorialWithoutMultiplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T;i++)
		{
			System.out.println(fact(sc.nextInt()));
		}
	}
	
	public static int fact(int n)
	{
		int fact =1;
		for(int i=2 ; i<=n ;i++)
		{
			fact = add(fact,i);
		}
		return fact;
	}
	
	public static int add(int a , int b)
	{
		int res =0;
		for(int i=0 ; i<b ; i++)
		{
			res+=a;
		}
		return res;
	}

}
