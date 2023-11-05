package array;
import java.util.*;
public class program8 {
	//DUPLICATE ARRAY PROBLEM PENDING
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	int [] arr1 = new int [arr.length];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j = i+1; j<=arr.length-1; j++)
		{
			if(arr[i]==arr1[j])
			{
				continue;
			}
			System.out.println(arr[i]);
		}
	}
	
}
}
