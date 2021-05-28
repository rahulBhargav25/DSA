import java.util.*;
import java.io.*;
public class SortArrOfZeroOneTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The size of array");
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random()*3);
			System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		
		String stringArr = Arrays.toString(arr);
		
		System.out.println("sorted array" + stringArr);
	}
}
