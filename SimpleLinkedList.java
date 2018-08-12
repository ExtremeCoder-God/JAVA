import java.util.*;
import java.util.Scanner.*;

class SimpleLinkedList{
	public static void main(String[] args) {
		LinkedList <Integer> list  = new LinkedList<Integer>();
		boolean a = true;
		Scanner S = new Scanner(System.in);
		int temp = 0;
		while(a){
			System.out.println("\nEnter the Choice\n1:push\n2:pop\n3:display\n4:clear\n5:top\n6:size\n7:exit\n");
			int choice = S.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter the element");
					list.push(S.nextInt());
					System.out.println("Success!!");
					break;
				case 2:
					if (list.isEmpty()) {
						System.out.println("UnderFlow\n");
					}
					else{
						System.out.println("Element is pop: "+list.pop()+"\n");
					}
					break;
				case 3:
					if (list.isEmpty())
						System.out.println("UnderFlow\n");
					else
						System.out.println("Stack : "+list+"\n");
					break;
				case 4:
					if (list.isEmpty())
							System.out.println("UnderFlow\n");
					else{
						list.clear();
						System.out.println("Stack is cleared\n");
					}
					break;
				case 5:
					if (list.isEmpty())
							System.out.println("UnderFlow\n");
					else{
						System.out.println("Top of the stack : "+list.getLast()+"\n");
					}
					break;
				case 6:
					if (list.isEmpty())
							System.out.println("UnderFlow\n");
					else{
						System.out.println("Size of Stack : "+list.size()+"\n");
					}
					break;
				case 7:
					a = false;
					break;
				default:
					System.out.println("Enter the correct Choice again\n");
			}
		}
	}
}