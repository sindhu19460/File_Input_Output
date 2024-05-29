package First;

import java.util.Scanner;

public class LinearSearch {
	
	void LinearSearchMethod(int arr[],int key)
	{
		for (int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Found at the index="+i+" Value="+key);
			}
		}
		
	}
	public static void main(String args[])
	{
		LinearSearch linear = new LinearSearch();
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter the array length\n");
		n = scan.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Array element inserted\n");
		for (int i=0;i<=n-1;i++)
		{
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Key element to bew searched\n");
		
		int key = scan.nextInt();
		
		
		LinearSearch lin = new LinearSearch();
		
		lin.LinearSearchMethod(arr, key);
		
	}
	

}
