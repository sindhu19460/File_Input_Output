package First;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		int n = scan.nextInt();
		
		String s = Integer.toString(n);
		System.out.println(s);
		if(n==Integer.parseInt(s))
		{
			System.out.println("Good Job");
		}
		else {
			System.out.println("Wrong Answer");
		}
	}

}
