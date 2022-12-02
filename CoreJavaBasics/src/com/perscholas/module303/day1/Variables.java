package com.perscholas.module303.day1;

public class Variables {

	public static void main(String[] args) {
		
		//1st assignment
		int a=4 ,b= 5,c=0;
		c = a + b;
		System.out.println("Additin of 2 numbers: "+c);
		
		//2nd assignment
		double e=4.5, f=6.5, g=0;
		g= e+f;
		System.out.println("Additin of 2 double: "+g);
		
		//3rd assignment
		//If int and double are added the result will be double
		double i=6.5, j=0;
		int h=4; 
		j= h+i;
		System.out.println("Addition of an int and double: "+j);
		
		//4th Assignment
		//Dividing the 2 integer variable
		int k=24, l=2, m=0;
		m=k/l;
		System.out.println("Dividing 2 integers: "+m);
		// Now if we divide double by int, like below
		//double n=6.0;
	    //m=n/l;
		// We will get type miss match error(Cannot convert double to int 
		
		//5th Assignment
		//dividing 2 double
		double n=81.81, o=9.9, p=0.0;
		p=n/o;
		System.out.println("Dividing 2 double: "+p);
		System.out.println("Casting result double to int: "+(int)p);
		
		//6th Program
		int x=5,y=6;
		double q=0.0;
		q=y/x;
		System.out.println("Value to Q is: "+q);
		q=(double)y;
		System.out.println("Casting y to double: "+q);
		
		//7th Program
		final int r = 64;
		int s=r+6;
		System.out.println("Adding constant to int: "+s);
		
		//8th program
		//create 3 variables that represent products at a cafe. 
		//The products are coffee, cappuccino, green tea. 
		//Assign prices to each product. 
		//Create 2 more variables called subtotal and totalSale and complete an “order”
		int coffee=15, cappuccino=20, green_tea=10;
		int subtotal=0;
		double totalSale = 0.0;
		subtotal = (3*coffee)+(4*cappuccino)+(2*green_tea);
		System.out.println("Subtotal of Order: "+"$"+subtotal);
		final double SALES_TAX= 7%100;
		System.out.println("SALES_TAX: "+"$"+SALES_TAX);
		totalSale = SALES_TAX + subtotal;
		System.out.println("TotalSale: "+"$"+totalSale);
		
		
		
	}

}
