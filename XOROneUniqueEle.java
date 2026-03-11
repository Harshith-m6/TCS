package importantPrograms;

public class XOROneUniqueEle {
	public static void main(String[] args) {
		int[] arr= {1,5,1,2,5,2,3,3,4};
		int result =0;
		for(int i=0;i<arr.length;i++)
		{
			result=result^arr[i];
		}
		
		System.out.println("Unique ele "+result);
	}

}
