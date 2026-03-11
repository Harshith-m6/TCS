package importantPrograms;

import java.util.Scanner;

public class DigitSum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		if(t==0)
		{
			System.out.println(0);
			return;
		}
		
		int sum = digitSum(n);
		
		int rsum = sum*t;
		
		int result = singleDig(rsum);
		System.out.println(result);
	}
	
	public static int singleDig(int n)
	{
		while(n>=10)
		{
			n=digitSum(n);
		}
		return n;
	}
	
	public static int digitSum(int n)
	{
		int sum=0;
		while(n>0)
		{
			int d = n%10;
			sum+=d;
			n/=10;
		}
		return sum;
	}
	

}
