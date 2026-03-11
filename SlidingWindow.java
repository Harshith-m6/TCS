package importantPrograms;

public class SlidingWindow {
	public static void main(String[] args) {
		//max subArray
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k=3;
		int n =arr.length;
		for(int i=0; i<n-k+1;i++)
		{
			int max =arr[i];
			for(int j =i;j<i+k;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			System.out.println(max);
		}
	}

}
