import java.util.Arrays;
import java.util.Scanner;

public class kthElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//take input from user for no of elements in array
		System.out.println("Enter no of elements you want in array");
		int n = scan.nextInt();
		
		//declare array
		int[] arr = new int[n];
		System.out.println("Enter elements of array ");
		
		//Initialize array
		for (int i= 0; i<n; i++) {
			arr[i] = scan.nextInt();
			
		}
		Arrays.sort(arr);
		
		System.out.println("Enter the position of element that is on smallest ");
		
		int k = scan.nextInt();
		
		System.out.println(" The element "+arr[k-1] + " is the " + k + "th smallest element in array");
		
		
		
		
	}
}
