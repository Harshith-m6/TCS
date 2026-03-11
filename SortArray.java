package importantPrograms;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int c0 = 0 , c1=0, c2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0) {
				c0++;
			}else if(arr[i]==1)
			{
				c1++;
			}else {
				c2++;
			}
		}
		
		for(int i=0;i<c0;i++)
		{
			System.out.println(0+" ");
		}
		for(int i=0;i<c1;i++)
		{
			System.out.println(1+" ");
		}
		for(int i=0;i<c2;i++)
		{
			System.out.println(2+" ");
		}
		
	}

}
