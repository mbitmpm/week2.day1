package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {

		// Build a logic to find the given string is palindrome or not

//		 * a) Declare A String value as"madam"

		String strPalindrome = "mAdAM";

//			* b) Declare another String rev value as ""

		String strReverse = "";

//			 * c) Iterate over the String in reverse order
		for (int i = ((strPalindrome.length()) - 1); i >= 0; --i) {

			// * d) Add the char into rev
			strReverse = strReverse + strPalindrome.charAt(i);

		}

//		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		if (strPalindrome.toLowerCase().equals(strReverse.toLowerCase())) {
			System.out.println(strPalindrome.toLowerCase() + " is a Palindrome");
		}

		else {
			System.out.println(strPalindrome.toLowerCase() + " is not a Palindrome");
		}

	}

}
