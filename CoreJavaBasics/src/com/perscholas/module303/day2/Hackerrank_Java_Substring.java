/*
Sample Input

Helloworld
3 7
Sample Output

lowo*/
package com.perscholas.module303.day2;

import java.util.Scanner;


public class Hackerrank_Java_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
        in.close();
	}

}
