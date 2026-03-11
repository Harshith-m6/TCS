package importantPrograms;

import java.util.Scanner;

public class OddDatesVehicle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vehicleNums = new int[n];
		int date = sc.nextInt();
		
		for(int i=0 ; i<vehicleNums.length;i++ )
		{
			vehicleNums[i]=sc.nextInt();
		}
		
		int fine = 0;
		int x =200;
		for(int i=0 ; i<vehicleNums.length ; i++)
		{
			if(vehicleNums[i]%2!=date%2)
			{
				fine=fine+x;
			}
		}
		
		System.out.println(fine);
	}
}
