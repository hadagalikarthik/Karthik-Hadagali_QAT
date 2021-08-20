import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1. Create an List of Strings where you take n elements from user. 
 * Reverse the order of strings entered and print it.
 */
public class StringReverse {

	public static void main(String[] args) {
		ArrayList<String> arrL = new ArrayList<>();
		Scanner inp = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = inp.nextInt();
		for(int i=0;i<n;i++) {
			arrL.add(inp.next());
		}
		System.out.println("Reversed Strings : ");
		for(int j=n-1;j>=0;j--) {
			System.out.println(arrL.get(j));
		}

	}

}
