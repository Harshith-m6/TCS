package importantPrograms;

public class Arrays3 {
	public static void main(String[] args) {
		int[] arr= {9,7,4,2,3,5,5,2,3,5,1};
		int max = arr[0];
		int count=1;
		for(int i =1 ; i<arr.length ; i++)
		{
			if(arr[i]>max)
			{
				count++;
				max = arr[i];
			}
		}
		
		System.out.println(count);
	}

}
