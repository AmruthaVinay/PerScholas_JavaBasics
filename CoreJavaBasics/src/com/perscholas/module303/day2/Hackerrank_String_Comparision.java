package com.perscholas.module303.day2;



public class Hackerrank_String_Comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcometojava";
		int k=3;
	    String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
		for(int i = 0 ; i+k-1 < s.length(); i++){
            if(s.substring(i, i+k).compareTo(smallest)<0){
                smallest = s.substring(i, i+k);
            }else if(s.substring(i, i+k).compareTo(largest)>0){
                largest = s.substring(i, i+k);
            }
            
        } 
		System.out.println(smallest + "\n" + largest);
	}
	

}
