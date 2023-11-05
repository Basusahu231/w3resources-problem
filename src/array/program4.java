package array;
import java.util.*;
public class program4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// Entering the length of array 
	System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	// Entetring the element of array
	System.out.println("Enter the element of array ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	// enter the element of array which you want to remove
	System.out.println("Enter the element which want to remove");
	int remove =scan.nextInt();
	// Element after remove is : 
	System.out.println("Element after remove is : ");
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]==remove)
		{
			continue;
		}
		System.out.println(arr[i]);
	}
} 
}
