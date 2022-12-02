//Write a program that uses nested for loops to print a multiplication table 1 to 12
package com.perscholas.module303.day3;

public class Loops {

	public static void main(String[] args) {
	
	int[][] table = new int[12][12];
   
    for(int row = 0; row < table.length; row++)
    {
       for(int col = 0; col < table.length; col++)
       {
    	   table[row][col] = (row+1) * (col+1);
    	   
       }
 
    }
    for(int row = 0; row < table.length; row++)
    {
       for(int col = 0; col < table.length; col++)
       {
          System.out.print(table[row][col] +"\t");
       }
       System.out.print("\n");
    }
 }// end of main

}// end of class
