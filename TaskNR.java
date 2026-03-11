package importantPrograms;

import java.util.Scanner;

public class TaskNR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int res=0;
		while(r>0)
		{
			res+=sumOfDig(n);
			r--;
		}
		int result=0;
		while(res>=0)
		{
			int d=res%10;
			result+=d;
			n/=10;
		}
		System.out.println(result);
		
	}
	public static int sumOfDig(int n)
	{
		int sum=0;
		while(n>0)
		{
			int d =n%10;
			sum+=d;
			n/=10;
		}
		return sum;
	}

}
