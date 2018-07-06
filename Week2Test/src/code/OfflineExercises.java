package code;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {

		String[] in = input.split("");
		String output = "";
	
		for (int i = 0; i < in.length; i++) {
			output += in[i] + in[i];
		}

		return output;

	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""
	// getSandwich("xxbreadhoneybreadyy") → "honey"

	public String getSandwich(String input) {

		String[] in = input.split("bread");// print index to test
		String output = "";

		if (in.length == 3) {

			output = in[1];
		} else if (in.length == 2) {
			output = in[1];

		} else {
			output = in[1];

		}
		// for (int i = 0; i < in.length; i++) {
		// System.out.println(in[i]+"a");
		// }
		return output;

	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {

		boolean evenSpaced = false;

		if (a > b && b > c) {
			if (a - b == b - c) {
				evenSpaced = true;
			}
		} else if (a > c && c > b) {
			if (a - c == c - b) {
				evenSpaced = true;
			}
		} else if (b > a && a > c) {
			if (b - a == a - c) {
				evenSpaced = true;
			}
		} else if (b > c && c > a) {
			if (b - c == c - a) {
				evenSpaced = true;
			}
		} else if (c > a && a > b) {
			if (c - a == a - b) {
				evenSpaced = true;
			}
		} else if (c > b && b > a) {
			if (c - b == b - a) {
				evenSpaced = true;
			}
		} else {
			evenSpaced = false;
		}

		return evenSpaced;
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {

		String[] in = input.split("");
		String output = "";
		int b = a;

		for (int i = 0; i < a; i++) {

			output += in[i];
			System.out.println(output);
		}

		for (int i = 0; i < a; i++) {

			output += in[in.length - a + i];
			System.out.println(output);

		}

		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false
	// endsLy("l") → false

	public boolean endsly(String input) {
		String[] in = input.split("");
		boolean output = false;

		if (in.length > 2) {
			if (in[in.length - 1].equals("y") && in[in.length - 2].equals("l")) {
				output = true;
			}
		}

		return output;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String[] inputString = input.split("");
		String output = "";
		ArrayList<String> input2 = new ArrayList<String>();
		for (int i = 0; i < inputString.length; i++) { // forgot how to split a string into characters into an
														// arraylist, so here's the long way
			input2.add(inputString[i]);

		}

		for (int j = 0; j < input2.size() - 1; j++) {
			if (input2.get(j).equals(input2.get(j + 1))) {
				input2.remove(j + 1);
				j -= 1;
			}

		}

		for (int k = 0; k < input2.size(); k++) {
			output += input2.get(k);
			System.out.println(output);
		}
		return output;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1
	// fibonacci(3) → 2
	// fibonacci(4) → 3
	// fibonacci(5) → 5
	// fibonacci(6) → 8
	// fibonacci(25) → 75025

	public int fibonacci(int input) {
		int output =0;
		
		if(input ==0) {
			output=0;
		}
		else if(input ==1) {
			output+=input;
			
		}
		else if(input >1) {
			output=(fibonacci(input-1))+fibonacci(input-2);
		}
		else 
		{
			System.out.println("Must be a positive integer");
		}
		
		
		return output;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).

	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4
	// bunnyEars(4) → 8
	// bunnyEars(16) → 32
	int recursiveOutput=0;
	public int bunnyEars(int input) {
		//testing for negative numbers here?
		
		
		
		if (input>=1) {
			recursiveOutput=recursiveOutput+2;

			bunnyEars(input-1);
		}
		else if (input==0) {
			recursiveOutput = recursiveOutput+0;
		}
	

		return recursiveOutput;
	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.

	// superBlock("jeffbert") → 2
	// superBlock("abbCCCddBBBxx") → 3
	// superBlock("") → 0

	public int superBlock(String str) {
		
		String[] in = str.split("");
		int max=0;
		int currentMax=0;
		int j=0;
		
		for (int i = 0; i < in.length; i++) {
			if (i!=in.length-1) {
				
				while(in[j].equals(in[j+1])) {
				currentMax+=1;
				j+=1;
				if (currentMax>max)
				{
					max=currentMax;
				}
			}
				
			}
				
			}
		
		return max;

	}

}
