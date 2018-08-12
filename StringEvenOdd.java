import java.util.*;	
import java.io.FileWriter;
//Check element number of interger String even or odd 
class StringEvenOdd{
	protected String ip;
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);	
		StringEvenOdd obj = new StringEvenOdd();
		
		System.out.println("Enter the input Number String");
		obj.ip = S.nextLine();
		int i = 0, len = obj.ip.length();
		
		try{
			FileWriter fe = new FileWriter("even.txt");
			FileWriter fo = new FileWriter("odd.txt");
			
			while (i < len) {
				if(Character.getNumericValue(obj.ip.charAt(i)) % 2 == 0){
					fe.write(obj.ip.charAt(i)+" even"+"\n");
				} else {
					fo.write(obj.ip.charAt(i)+" odd"+"\n");
				}
				i++;
			}
			
			fe.close();
			fo.close();
		} catch (Exception e){
			System.out.println(e);
		}
	}
}
