package importantPrograms;

import java.util.Scanner;

public class CountGreaterThanPrior {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int count =0;
		int max = Integer.MIN_VALUE;
		for(int i =0 ; i<n-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				count++;
			}
		}
		System.out.println(count);
	}

}
