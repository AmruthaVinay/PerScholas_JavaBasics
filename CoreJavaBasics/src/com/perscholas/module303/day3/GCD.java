package com.perscholas.module303.day3;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int Num1 = in.nextInt();
        int Num2 = in.nextInt();
        in.close();
		int Temp, GCD=0;  
		while(Num2 != 0)  
		{  
			
		Temp = Num2; 
		System.out.println("\n Temp =  " + Temp); 
		Num2 = Num1 % Num2;  
		System.out.println("\n Num2 =  " + Num2); 
		Num1 = Temp; 
		System.out.println("\n Num1 =  " + Num1); 
		}  
		GCD = Num1;  
		System.out.println("\n GCD =  " + GCD); 

	}

}
