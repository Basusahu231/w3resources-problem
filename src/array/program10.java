package array;
import java.util.*;
import java.util.Arrays;
public class program10 {
	// FIND THE SECOND SMALLEST ELEMENT 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Enter the length of array 
		System.out.println("Enter the length  of array ");
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		// Sorting the array using inbuilt method 
		Arrays.sort(arr);
		// Storing the second element in sec variable 
		int sec = arr[1];
		// printing the second smallest element 
		System.out.println("The second smallest element is : ");

		System.out.println(sec);

	}
}
