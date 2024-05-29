package First;

import java.util.Scanner;

public class StringLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String \n");
		String A  = scan.next();
		String B = scan.next();
		
		int lenAndBString = A.length()+B.length();
		System.out.println(lenAndBString);
		
		if(A.compareTo(B)>0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		System.out.println(A.substring(1,0).toUpperCase()+A.substring(1,A.length())+
				" "+B.substring(1,0).toUpperCase()+B.substring(1,B.length()));
	
	}

}
