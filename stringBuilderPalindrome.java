
public class stringBuilderPalindrome {

	public static void main(String[] args) {

		String s = "aba";
		StringBuilder s1 = new StringBuilder(s);
		
		String a = s1.reverse().toString();
		if(s.equals(a)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		

	}

}
