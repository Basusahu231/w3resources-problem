package array;
import java.util.*;
public class program9 {
	// FIND THE LARGEST ELEMENT PRRSENT IN AN ARRAY 
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array ");
	for(int i = 0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	// Considering the first element as smallest
	int lar  = arr[0];
	for(int i =0; i<=arr.length-1; i++)
	{
		if(lar < arr[i])
		{
			lar =arr[i];
		}
	}
	System.out.println("The largest element is : ");
	System.out.println(lar);
}
}
