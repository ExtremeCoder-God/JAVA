import java.util.*;
import java.io.*;

public class SimpleArray{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the size of ArrayList:");
		int n = S.nextInt();
		ArrayList <Integer> arr = new ArrayList <Integer> (n);
		System.out.println("Enter the Elements of ArrayList:");
		for (int i=0; i<n; i++) {
			arr.add(S.nextInt());
		}
		System.out.println("Given ArrayList:\n"+arr);
		arr.remove(4);
		System.out.println("After deleting 4 from ArrayList:\n"+arr);
		arr.add(4,4);
		System.out.println("After inserting 4 to ArrayList:\n"+arr);
		Collections.sort(arr);
	    System.out.println("ArrayList in ascending order is:" + arr);
	    Collections.sort(arr, Collections.reverseOrder());
	    System.out.println("ArrayList in descending order is:" + arr);
	    ArrayList<Integer> l = new ArrayList<Integer>(10);
	    for (int i=6; i<=10; i++)
	    {
	      l.add(i);
	    }
	    System.out.println("New created arraylist is: " + l);
	    arr.addAll(l);
	    System.out.println("Adding new arraylist: "+ arr);
	}
}