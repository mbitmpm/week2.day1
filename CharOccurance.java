package week2.day1.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

		 Character searchChar = 'e';
		    Integer count = 0;
		    for (Integer i = 0; i < str.length(); i++) 
		    {
		      if (str.charAt(i) == searchChar)
		      {
		        count++;
		      }
		    }
		    System.out.println("Total number of occurence of character " + searchChar + " is: " + count);
		  }

	

	}


