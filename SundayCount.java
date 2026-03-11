package importantPrograms;
import java.util.*;
public class SundayCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting day of the month");
		String start = sc.next();
		start = start.substring(0,3);
		start=start.toLowerCase();
		System.out.println("Enter the number of days");
		int days = sc.nextInt();
		int index =0;
		String[] week = {"mon","tue","wed","thu","fri","sat","sun"};
		for(int i =0; i<week.length ; i++)
		{
			if(week[i].equals(start))
			{
				index=i;
				break;
			}
		}
		
		int sundays =0;
		int rem = 6-index;
		if(rem<=days)
		{
			sundays=1;
			days=days-rem;
			sundays+=days/7;
			
		}
		
		System.out.println(sundays);
		
	}

}
