package array;
import java.util.*;
public class program11 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i] +arr[i+1] == 40)
		{
			System.out.println("pair");
		}
		else
		{
			System.out.println("Not pair");
		}
	}
}
}
