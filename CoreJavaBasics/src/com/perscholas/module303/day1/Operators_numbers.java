package com.perscholas.module303.day1;



public class Operators_numbers {

	public static void main(String[] args) {
		//1st Program
		int arr[] = { 1, 8, 33, 78, 787, 33987 };
		//String x = "";
		for (int y : arr) {
			String x = "";
			int decimal = y;
			for(int i = arr.length-1; decimal > 0; i++) {
				int a = decimal % 2;
				x = a + x;
				decimal = decimal / 2;
			}
			System.out.println("Binary value of integer is "+y+" is "+x);
		}
	
        
     //2nd Program
       // int decimal = 0;  
       // int p = 0;  
        //int binary[] = {0010, 1001, 0011 0100, 0111 0010, 0010 0001 1111, 0010 1100 0110 0111};
       // while(binary[])
         //int n=0;
         //int temp = 0010%10;  
         //decimal += temp*Math.pow(2, n);  
         //int binary = 0010/10;  
        // n++;  
           
        //3rd Program
        int y=2;
        System.out.println("binary string version of the number 2 is: "+Integer.toBinaryString(y) );
        y=y<<1;
        System.out.println("After applying left shift by 1 the value of 2 is: "+y);
        int arry[]= {9,17,88};
        for(int i=0;i<=2;i++) {
        	System.out.println("binary string version of the number "+arry[i]+" is: "+Integer.toBinaryString(arry[i]) 
        	+" Applying left shift by 1 for "+arry[i]+" is: "+(arry[i] << 1));
        }
        
        //4th program
        int a=150;
        System.out.println("Binary string version of the number 150 is: "+Integer.toBinaryString(a) );
        a = a>>2;
        System.out.println("After applying right shift by 2 the value of 150 is: "+y);
        int arra[]= {225,1555,32456};
        for(int i=0;i<=2;i++) {
        System.out.println("binary string version of the number "+arra[i]+" is: "+Integer.toBinaryString(arry[i]) 
        	+" Applying right shift by 2 for "+arra[i]+" is: "+(arra[i] >> 2));}
        
        //5th Program
        int f=7,g=17,h;
        h =(f & g);
       System.out.println("bitwise binary & operation for 7 and 17 is:"+h);
       System.out.println("binary string version of the number "+h+" is: "+Integer.toBinaryString(h));   
       h=(f | g);
       System.out.println("bitwise binary | operation for 7 and 17 is:"+h);
       System.out.println("binary string version of the number "+h+" is: "+Integer.toBinaryString(h));   
        
       
       //6th program
        int b=5;
        System.out.println("Printing the value of b before using postfix "+b);
        b++;
        System.out.println("Printing the value of b after using postfix "+b);
        
        //7th program
        int c=9;
        System.out.println("Vaue of c before increment "+c);
        c=c+1;
        System.out.println("Incrementing c for first time "+c);
        c++;
        System.out.println("Incrementing c for Second time "+c);
        ++c;
        System.out.println("Incrementing c for third time "+c);
        
        //8th program
        int d=5,e=8,sum;
        //sum=(++d)+e;
        //System.out.println("Value of sum when pre increment "+sum);
        sum=(d++)+e; 
        System.out.println("Value of sum when post increment "+sum);
        
	}

}
