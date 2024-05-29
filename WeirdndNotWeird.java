package First;

import java.util.Scanner;

public class WeirdndNotWeird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number\n");

		int num = scan.nextInt();
		String ans = "";
		
		if (num%2!=0)
		{
			ans = "Werid";
		}
		 else {
			if(num>=2 && num<=5)
			{
				ans = "Not Werid";
			}
			else if(num>=6 && num<=20)
			{
				ans = "Werid";
			}
			else
			{
				ans = "Not Werid";
			}
			
		}
			
		System.out.println(ans);
		
		
	}

}
