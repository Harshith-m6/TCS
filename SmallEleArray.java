package importantPrograms;

public class SmallEleArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int min =Integer.MAX_VALUE;
		for(int ele : arr)
		{
			if(ele<min)
			{
				min=ele;
			}
		}
		System.out.println(min);
	}

}
