import java.util.*;

class Vowel{

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the string");
		String ip = S.nextLine();
		int len = ip.length(),i = 0;
		
		while (i<len){
			if(ip.charAt(i) == 'a' || ip.charAt(i) == 'e' || ip.charAt(i) == 'i' || ip.charAt(i) == 'o' || ip.charAt(i) == 'u' )
				System.out.println(ip.charAt(i)+" Vowel");
			else
				System.out.println(ip.charAt(i)+" Consonant");
			i++;
		}
	}
}