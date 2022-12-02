package com.perscholas.module303.day2;

import java.util.Scanner;

public class Control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Write a program that declares 1 integer variable x, and then assigns 7 to it. 
		//Write an if statement to print out “Less than 10” if x is less than 10. Change x to equal 15, 
		//and notice the result (console should not display anything).
		
		int x=7;
		//int x=15;
		if(x<10) {
			System.out.println("Less than 10");	
		}
		
		//2. Write a program that declares 1 integer variable y, and then assigns 7 to it.
		//Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. 
		//Change x to 15 and notice the result.
		int y=15;
		//int y=7;
		if(y<10) {
			System.out.println("Less than 10");	
		}
		else {
			System.out.println("Greater than 10");
		}
		 
		//3. Write a program that declares 1 integer variable z, and then assigns 15 to it. 
		//Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
		//“Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal 
		//to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
		int z=50;
		if(z<10) {
			System.out.println("z is less than 10");	
		}
		else if(z>10 && z<20) {
			System.out.println("z is between 10 and 20");
		}
		else if(z>=20) {
			System.out.println("z is greater than or equal to 20");
		}
		 
		//4. Write a program that declares 1 integer variable a, and then assigns 15 to it. 
		//Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and 
		//prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
		int a=15;
		if((a<10) || (a>20)) {
			System.out.println("Out of range");	
		}
		else if(a>=10 && a<=20) {
			System.out.println("In range");
		}
		
		//5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
		//A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: <60
		//Use the Scanner class to accept a number score from the user to determine the letter grade. 
		//Print out “Score out of range” if the score is less than 0 or greater than 100.
		
		int grade =0;
		System.out.println("Please enter your score: ");
		Scanner scan = new Scanner(System.in);
		grade = scan.nextInt();
		if(grade<=100 && grade>=90) {
			System.out.println("Grade: A");
		}
		else if(grade<=89 && grade>=80) {
			System.out.println("Grade: B");
		}
		else if(grade<=79 && grade>=70) {
			System.out.println("Grade: C");
		}
		else if(grade<=69 && grade>=60) {
			System.out.println("Grade: D");
		}
		else if(grade<=60 && grade>=0) {
			System.out.println("Grade: F");
		}
		else if(grade<0 || grade>100) {
			System.out.println("Score out of range");
		}
		 
		//6. Write a program that accepts an integer between 1 and 7 from the user. 
		//Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is 
		//less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
		int weekDay =0;
		System.out.println("Please enter a number to know the days: ");
		Scanner scanWeek = new Scanner(System.in);
		weekDay = scanWeek.nextInt();
		if(weekDay>7 || weekDay<=0) {
			System.out.println("out of range");
		}
		switch(weekDay) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:	
			System.out.println("Sunday");
			break;
		}
		
		 
		//7. Create a program that lets the users input their filing status and income. 
		//Display how much tax the user would have to pay according to status and income.
		//Single, Married Filing Jointly, Married
		String status ="";
		double income=0;
		double taxable=0;
		Scanner scanIT = new Scanner(System.in);
		System.out.println("Enter the filing status: "
				+ " S for Single " +
				" M for Married "+
				" J for Married Filing Jointly ");
		status = scanIT.nextLine();
		System.out.println("Enter you total Income");
		income = scanIT.nextInt();
		//System.out.println(taxable);
		switch(status.toLowerCase()) {
		case "s":
			if(income>=0 && income<=8350) {
				System.out.println("Income income>0 || income<=8350 ");	
				taxable= ((income*10)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
			else if(income>=8351 && income<=33950) {
				System.out.println("income>8351 || income<=33950 ");	
				taxable= ((income*15)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>=33951 && income<=82250) {
	        	System.out.println("income>33951 || income<=82250");	
				taxable= ((income*25)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>=82251 && income<=171550) {
	        	System.out.println("income>82251 || income<=171550");	
				taxable= ((income*28)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>=171551 && income<=372950) {
	        	System.out.println("income>171551 || income<=372950");	
				taxable= ((income*33)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>=372951) {
	        	System.out.println("income>372951");	
				taxable= ((income*35)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
		case "j":
			if(income>0 && income<=16700) {
				System.out.println("income>0 || income<=16700");	
				taxable= ((income*10)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
			else if(income>16701 && income<=67900) {
				System.out.println("income>16701 || income<=67900");	
				taxable= ((income*15)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>67901 && income<=137050) {
	        	System.out.println("income>67901 || income<=137050");	
				taxable= ((income*25)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>137051 && income<=208850) {
	        	System.out.println("income>137051 && income<=208850");	
				taxable= ((income*28)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>208851 && income<=372950) {
	        	System.out.println(income>208851 || income<=372950);	
				taxable= ((income*33)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>372951) {
	        	System.out.println("income>372951 ");	
				taxable= ((income*35)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
		case "m":
			if(income>0 && income<=8350) {
				System.out.println("Income income>0 || income<=8350 ");	
				taxable= ((income*10)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
			else if(income>8351 && income<=33950) {
				System.out.println("income>8351 || income<=33950");	
				taxable= ((income*15)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>33951 && income<=68525) {
	        	System.out.println("income>33951 || income<=68525 ");	
				taxable= ((income*25)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>68526 && income<=104425) {
	        	System.out.println("income>68526 || income<=104425");	
				taxable= ((income*28)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>104426 && income<=186475) {
	        	System.out.println("income>104426 || income<=186475");	
				taxable= ((income*33)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
	        else if(income>186476) {
	        	System.out.println("income>186476");	
				taxable= ((income*35)/100);
				System.out.println("Total tax to be paid: " +taxable);	
				break;
			}
		}
		
		/*
		 * if(status.equalsIgnoreCase("s")) { System.out.println("status: " +status+
		 * " income: "+income );
		 * 
		 * } else if(status.equalsIgnoreCase("m")) { System.out.println("status: "
		 * +status+ " income: "+income ); } else if(status.equalsIgnoreCase("j")) {
		 * System.out.println("status: " +status+ " income: "+income ); }
		 */
		scan.close();
		scanWeek.close();
		scanIT.close(); 

		       
		    }        
		   




		    }        
		   
		   







