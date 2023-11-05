package array;
import java.util.*;
public class program5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	int [] arr1 = new int [arr.length];
	// Entering the element of array 
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	// Printing the original array is : 
	System.out.println("Original array is : ");
	for(int x : arr)
	{
		System.out.println(x);
	}
	// taking jth variable for reversing an array
	int j=arr.length-1;
	for(int i =0; i<=arr.length-1; i++)
	{
		arr1[j]=arr[i];
		j--;
	}
	// displaying the reverse element in second array 
	System.out.println("Reverse array is : ");
	for(int i =0; i<=arr1.length-1; i++)
	{
		System.out.println(arr1[i]);
	}
}
}
