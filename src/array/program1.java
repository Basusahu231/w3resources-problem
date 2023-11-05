package array;
import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// enter the length of array
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
		// enter the element of array
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		// enter the element which you want to find index
		System.out.println("Enter the value which you want to find index");
		int key = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if (arr[i]==key)
			{
				System.out.println(i);
			}

		}

	}
}
