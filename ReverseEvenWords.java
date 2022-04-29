package week2.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		 
//		  Declare the input as Follow String test = "I am a software tester";

		String test="I am a software tester";
		
//		a) split  the words and have it in an array 
		String[] t = test.split(" ");
//		b) Traverse through each word (using loop)
//		  c) find the odd index within the loop (use mod operator)
//		  
//		  d)split the words and have it in an array
//		  
//		  e)print the even position words in reverse order using another loop (nested
//		  loop) f) Convert words to character array if the position is even else print
//		  the word as it is(concatenate space at the end).
//	
		StringBuilder result = new StringBuilder();
	    for( int i = 0; i < t.length; i += 1 )
	    {
	        if( i % 2 != 0 )
	        {
	            char[] word = t[i].toCharArray();
	            String reverseWord = "";
	            for( int k = word.length; k > 0; k-- )
	            {
	                reverseWord += String.valueOf( word[k-1] );
	            }
	            result.append( reverseWord ).append( " " );
	        }
	        else
	        {
	            result.append( t[i] ).append( " " );
	        }
	    }
	    System.out.println( result.toString() );
		  
	}

}
