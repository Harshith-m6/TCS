package importantPrograms;
import java.util.*;
public class ConvyerBeltArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of packets");
		int n = sc.nextInt();
		int[] packets = new int[n];
		for(int i = 0 ; i< packets.length ; i++)
		{
			System.out.println("Enter the size of each pack");
			packets[i]=sc.nextInt();
			
		}
		int count =0;
		for(int i=0;i<packets.length;i++)
		{
			if(packets[i]!=0)
			{
				packets[count++]=packets[i];
			}
		}
		for(int i=count; i<n ; i++)
		{
			packets[i]=0;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(packets[i]+" ");
		}
	}

}
