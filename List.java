import java.io.*;
import  java.util.*;

class arraylist
{
  public static void main(String [] args)
  {
    int n = 5;
    int i;
    ArrayList<Integer> arr = new ArrayList<Integer>(n);
    for (i=1; i<=n; i++)
        arr.add(i);
    System.out.println(arr);

    arr.remove(2);
    System.out.println(arr);

    for(i=0;i<arr.size();i++)
    {
      System.out.println(arr.get(i) + " ");
    }
    Collections.sort(arr);
    System.out.println("ArrayList in ascending order is:" + arr);
    Collections.sort(arr, Collections.reverseOrder());
    System.out.println("ArrayList in descending order is:" + arr);
    ArrayList<Integer> l = new ArrayList<Integer>(10);
    for (i=6; i<=10; i++)
    {
      l.add(i);
    }
    System.out.println("New created arraylist is: " + l);
    arr.addAll(l);
    System.out.println("Adding new arraylist: "+ arr);
    arr.addAll(2,l);
    System.out.println("Adding new arraylist at a specified position:" + arr);
    Integer b_array[] = new Integer[arr.size()];
    b_array = arr.toArray(b_array);
    System.out.println("New array b_array is: ");
    for(i=0;i<arr.size();i++)
    {
      System.out.println(b_array[i]);
    }
    System.out.println("Our Arraylist is: " + arr);

  }
}