package importantPrograms;

import java.util.Scanner;

public class MaxRow1Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int maxCount =0;
			int index =-1;
			
			for(int i=0 ; i<n;i++)
			{
				int count =0;
				for(int j =0; j<m ;j++)
				{
					int val = sc.nextInt();
					if(val==1) {
						count++;
					}
				}
				if(count>maxCount)
				{
					maxCount = count;
					index =i;
				}
			}
			if(maxCount==0)
			{
				System.out.println(-1);
			}else {
				System.out.println(index);
			}
			
		}
	}

}
