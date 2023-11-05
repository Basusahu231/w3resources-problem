package array;
import java.util.*;
public class program2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int[scan.nextInt()];
		int [] arr1 = new int [arr.length-1];
		for (int i =0; i<=arr.length-1; i++) 
		{
			arr[i] = scan.nextInt();	
		}
		System.out.println("Enter the element which you want to remove");
		int key = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]==key)
			{
				continue;
			}
           arr1[i]=arr[i];
//           System.out.println(arr1[i]);
		}
		for(int x : arr1)
		{
			System.out.println(x);
		}
		
	}
}
