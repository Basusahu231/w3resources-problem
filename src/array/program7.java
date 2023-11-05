package array;
import java.util.*;
public class program7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Enter the length of array
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
		int [] arr1 = new int [arr.length];
		// Enter the element of array 
		System.out.println("Enter the element of first array");
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		//Enter the element of second array
		System.out.println("Enter the element of second array");
		for(int i =0; i<=arr1.length-1; i++)
		{
			arr1[i]=scan.nextInt();
		}
		// printing the common element present in the array  or not 
		for(int i =0; i<=arr.length-1; i++)
		{  
			if(arr[i] == arr1[i])
			{
				System.out.println("Common element is present");
				return;
			}
			else
			{
				System.out.println("Common element is not present");
			}
			return;

		}
	}
}
