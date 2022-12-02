package com.perscholas.module303.day2;

import java.util.Scanner;
//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
//We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, 
//followed by each token on a new line.
// input:He is a very very good boy, isn't he?
//Output
//10
//He
//is
//a
//very
//very
//good
//boy
//isn
//t
//he

public class Hackerrank_String_Tokens {

	public static void main(String[] args) {
		int count = 0;
		String s = "";
		String[] stringarray;
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		if ((s.trim().length()) != 0) {
			stringarray = s.trim().split("[\\s@_!,'?\\t\\n\\r\\f.\\-+*/\\p{Space}\\s+]+");
			count = stringarray.length;
			System.out.println(count);
			// iterate over string array
			for (int i = 0; i < stringarray.length; i++) {
//prints the tokens  
				System.out.println(stringarray[i]);
			}
		} else {
			System.out.println(count);
		}
		scan.close();
	}

}
