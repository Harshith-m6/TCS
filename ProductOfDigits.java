package importantPrograms;
import java.util.*;
public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod =1;
		while(n>0)
		{
			int d = n%10;
			prod*=d;
			n/=10;
		}
		
		System.out.println(prod);
	}

}
