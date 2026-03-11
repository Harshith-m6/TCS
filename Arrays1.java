package importantPrograms;

import java.util.Arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int[] arr = {1,0,2,0,3,0,4,0,5};
		int j=0;
		int n =arr.length;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[j]=arr[i];
				j++;
			}
		}
		while(j<n)
		{
			arr[j]=0;
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
