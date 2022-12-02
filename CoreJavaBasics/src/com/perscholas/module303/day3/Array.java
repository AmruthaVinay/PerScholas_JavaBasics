package com.perscholas.module303.day3;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * //Write a program that creates an array of integers with a length of 3.
		 * //Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		 */		
		int arr[] = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    	
	    }
	
		/*
		 * //Write a program that returns the middle element in an array. //Give the
		 * following values to the integer array: {13, 5, 7, 68, 2} and produce the
		 * following output: 7
		 */	    
	    int arr1[] =  {13, 5, 7, 68, 2};
		int midElement= arr1.length/2;
		for(int i=0;i<arr.length;i++)
		{
			if(i==midElement) {
			System.out.println("Middle element in array: "+arr1[i]);
			}
		}
		
		/*
		 * //Write a program that creates an array of String type and initializes it
		 * with the strings “red”, “green”, “blue” and “yellow”. //Print out the array
		 * length. Make a copy using the clone( ) method. //Use the Arrays.toString( )
		 * method on the new array to verify that the original array was copied.
		 */		
		String[] str =  new String[] {"red","green","blue","yellow"};
		System.out.println("Length of String: "+str.length);
		String[] strCopy=str.clone();
		System.out.println(Arrays.toString(strCopy));
		
		/*
		 * //Write a program that creates an integer array with 5 elements (i.e.,
		 * numbers). The numbers can be any integers. //Print out the value at the first
		 * index and the last index using length - 1 as the index. //Now try printing
		 * the value at index = length ( e.g., myArray[myArray.length ] ). //Notice the
		 * type of exception which is produced. //Now try to assign a value to the array
		 * index 5. You should get the same type of exception.
		 */		
		int arr2[]= {10,20,30,40,50};
		int length = arr2.length;
		System.out.println("Value at first index: "+arr2[0]);
		System.out.println("Value at last index: "+arr2[length-1]);
		//System.out.println("Value at last index: "+arr2[length]); 
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		//Index 5 out of bounds for length 5 at com.perschlas.module303.day3.Array.main(Array.java:57)
		//System.out.println("Value at last index: "+arr2[5]);
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 
		//at com.perschlas.module303.day3.Array.main(Array.java:60)
		
		/*
		 * //Write a program where you create an integer array with a length of 5.
		 * //Loop through the array and assign the value of the loop control variable
		 * (e.g., i) to the corresponding index in the array.
		 */		
		int arr3[] =  new int[5];
		for (int i=0;i<arr3.length;i++) {
			System.out.println("arr3["+i+"]"+" = "+i);
		}
	
		/*
		 * //Write a program where you create an integer array of 5 numbers. //Loop
		 * through the array and assign the value of the loop control variable
		 * multiplied by 2 to the corresponding index in the array.
		 */		
		int arr4[] =  new int[5];
		for (int i=0;i<arr4.length;i++) {
			System.out.println("arr4["+i+"]"+" = "+i*2);
		}
		
		/*
		 * //Write a program where you create an array of 5 elements. //Loop through the
		 * array and print the value of each element, except for the middle (index 2)
		 * element.
		 */		
		int arr5[] =  new int[5];
		for (int i=0;i<arr5.length;i++) {
			if(i!=3) {
			System.out.println("arr5["+i+"]"+" = "+i);
			}
			else {
				
			}
		}
		
		/*
		 * //Write a program that creates a String array of 5 elements and //swaps the
		 * first element with the middle element without creating a new array.
		 */		
		String[] str6 =  new String[] {"red","green","blue","yellow","black"};
		str6[2]="red";
		System.out.println(Arrays.toString(str6));
		
		/*
		 * //Write a program to sort the following int array in ascending order: {4, 2,
		 * 9, 13, 1, 0}. Print the array in ascending order, //and print the smallest
		 * and the largest element of the array. The output will look like the
		 * following:
		 */		
	    int arr7[] =  {4, 2, 9, 13, 1, 0};
	    Arrays.sort(arr7);
	    System.out.println(Arrays.toString(arr7));
	    System.out.println("Smallest: "+arr7[0]);
	    int last = (arr7.length)-1;
	    System.out.println("Largest: "+arr7[last]);
	    
		/*
		 * //Create an array that includes an integer, 3 strings, and 1 double. Print
		 * the array.
		 */	    
	    int[] a= {0,0,12};
	    String[] b= {"Ammu","Ammi","Annu"};
	    double[] c = { 1.2, 0.0, 0.0};
	    System.out.println(Arrays.toString(a));
	    System.out.println(Arrays.toString(b));
	    System.out.println(Arrays.toString(c));
		
		/*
		 * //Write some Java code that asks the user how many favorite things they have.
		 * Based on their answer, you should create a //String array of the correct
		 * size. //Then ask the user to enter the things and store them in the array you
		 * created. Finally, print out the contents of the array.
		 */		
		
		
		 int count=0; 
		 
		 Scanner scanFav = new Scanner(System.in);
		 System.out.println("Enter how many fav items do you have?"); 
		 count = scanFav.nextInt(); 
		 String[] favArr= new String[count];
		 for (int i = 0; i < count; i++) { 
	     System.out.println ("Enter you fav thing no" + i + ":");
	     favArr[i] = scanFav.next(); }
		
		 for (String fav : favArr)
		 { 
			 System.out.print (fav + "\t"); 
	      }
		 
		 scanFav.close();
	}

}
