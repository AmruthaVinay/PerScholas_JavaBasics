/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes*/
package com.perscholas.module303.day2;

import java.util.Scanner;

public class Hackerrank_String_Reverse {

	public static void main(String[] args) {

		        Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        String rev ="";
		        /* Enter your code here. Print output to STDOUT. */
		        int len = A.length()-1;
		        for(int i=len; i>=0; i--)
		        {
		            rev = rev + A.charAt(i);
		        }
		        if(A.equalsIgnoreCase(rev)){
		            System.out.println("Yes");
		        }
		        else{
		            System.out.println("No");
		        }
		        sc.close();
		    }

	}


