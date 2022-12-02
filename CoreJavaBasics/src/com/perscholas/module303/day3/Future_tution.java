package com.perscholas.module303.day3;

public class Future_tution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doubleFee = 0, years = 0;
		int tution = 10000;
		double increment = 1.07;
		int temp = tution * 2;
		for (int i = years; doubleFee <= temp; years++) {
			doubleFee += (int) (tution * increment);
		}
		System.out.println("Tution fee is doubled to: " + doubleFee + " after " + years + " years ");

	}

}
