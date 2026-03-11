package importantPrograms;
import java.util.*;
public class SundayCount1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the start day");
		String start = sc.nextLine();
		System.out.println("Enter the number of days");
		int days = sc.nextInt();
		start=start.substring(0,3);
		start=start.toLowerCase();
		int index =0;
		String[] week = {"mon","tue","wed","thu","fri","sat","sun"};
		for(int i=0;i<week.length;i++)
		{
			if(start==week[i])
			{
				index = i;
				break;
			}
		}
		
		int sundays=0;
		int rem = week.length-index;
		
		if(rem<=week.length)
		{
			sundays=1;
			days=days-rem;
			sundays+=days/7;
		}
		
		System.out.println(sundays);
		
	}

}
