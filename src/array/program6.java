package array;
import java.util.*;
public class program6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the length of array
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
		// enter the element of array
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		// Printing the original array 
		System.out.println("Original array is : ");
		for(int x: arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		for(int i =0; i<=arr.length-1;  i++)	
		{
			//  position where i am inserting the value  
			if(i==2)
			{
				arr[i]=43;
			}
		}
		// After entering the element  at specific position is 
		System.out.println("Modified array is : ");
		for(int x: arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
