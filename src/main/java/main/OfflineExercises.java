package main;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String ans = new String();
		for(int i=0; i<input.length(); i++) {
		
			ans = ans + input.substring(i, i+1) + input.substring(i, i+1) + input.substring(i, i+1);
		
		}
		System.out.println(ans);
		
		return ans;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String ans2 = new String();
		int count = 0;
		for(int i=0; i<(input.length()-3); i++) {
			if(input.substring(i, i+4).equalsIgnoreCase("bert")) {
				int count2 = count;
				count++;
				if(count>=2) {
					for(int j=0; j<(input.length()-3); j++) {
						String removingOneBert = new String();
						String removingSecondBert = new String();
						if(input.substring(j, j+4).equalsIgnoreCase("bert")) {
							removingOneBert = input.substring(j+4, input.length());
							
							for(int k = 0; k<(removingOneBert.length()); k++) {
								if(input.substring(k, k+4).equalsIgnoreCase("bert")) {
									System.out.println(input.substring(k+4, input.length()));
								}
							
							}
						}
					}
				}
				else {
					ans2 = "";
				}
			
			}
		}
		System.out.println(count);
		System.out.println(ans2);
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		boolean tF;
		if((b-a) == (c-b) || (b-a)==(a-c)) {
			tF = true;
		}
		else {
			tF= false;
		}
		return tF;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		String fukThisBro = new String();
		String yoho = new String();
		int mid = (input.length()/2);
		
		if(a == 1) {
			yoho = input.substring(0, mid);
			yoho = yoho + input.substring((mid + a), (input.length()));
		
		}
		
		
		else {
			yoho = input.substring(0, (mid - 1));

			yoho = yoho + input.substring(((mid -1) + a), input.length());
					
		
		}
		System.out.println(yoho);
		
		System.out.println(fukThisBro);
		

		return yoho;
	}


	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public  static boolean endsDev(String input) {
		boolean dev = true;
		if(input.length() > 2) {
			for(int i=0; i<input.length(); i++) {
				if(input.substring((input.length()-3), input.length()).equalsIgnoreCase("dev")) {
					dev = true;
				}
				else {
					dev = false;
				}
			}
		}
		else {
			dev = false;
		}
		
		System.out.println(dev);
		return dev;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int returner = 0;
		
		for(int i=0; i< arg1.length()-3; i++) {
			if(arg1.substring(i, i+4).equalsIgnoreCase(" am ") || arg1.substring(i, i+3).equals("Am ") || arg1.substring(0, i+3).equals("am ")) {
				returner++;
			}
		}
		
		return returner;
		
	}
	
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		String jklol = new String();
		if(arg1%3 == 0 && arg1%5 == 0) {
			jklol = "fizzbuzz";
		}
		else if (arg1%3 == 0) {
			jklol = "fizz";
		}
		else if(arg1%5 == 0) {
			jklol ="buzz";
		}
		return jklol;
		
	}
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		return 0;
		
	}
	
	
}
