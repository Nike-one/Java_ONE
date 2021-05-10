import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		char a1[] = a.toLowerCase().toCharArray();
		Arrays.sort(a1);
		String b = in.nextLine();
		char b1[] = b.toLowerCase().toCharArray();
		Arrays.sort(b1);
		
		boolean ch = Arrays.equals(a1, b1);
		
		if(a1.length!=b1.length) {
			System.out.println("Not Anagram");
		}else {
		if(ch) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		}
		
	}

}
