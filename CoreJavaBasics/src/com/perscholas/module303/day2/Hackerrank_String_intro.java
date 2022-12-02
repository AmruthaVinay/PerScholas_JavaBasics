/*The elements of a String are called characters. The number of characters in a String is called the length, 
and it can be retrieved with the String.length() method.
Given two strings of lowercase English letters,  and , perform the following operations:
Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java*/

package com.perscholas.module303.day2;

import java.util.Scanner;

public class Hackerrank_String_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int sum = (A.length() + B.length());
		System.out.println(sum);
		if ((A.compareToIgnoreCase(B)) < 0) {
			System.out.println("No");
		} else if ((A.compareToIgnoreCase(B)) == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));
		sc.close();
	}
}
