package First;

import java.util.Scanner;

public class LengthBreath {
	static int B,H;
	static Boolean flag = true;
	
	static {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value for Breath and Height");
		B = scan.nextInt();
		H = scan.nextInt();
	if(B<=0 || H<=0)
	{
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
	 if (B==0 && H==100) {
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	  }
}
public static void main(String[] args) {
	if(flag)
	{
		int area = B*H;
		System.out.println(area);
	}
		
}
	
}
