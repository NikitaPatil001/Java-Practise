package com.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Array_In_Groups {

	public static void main(String[] args) {
		ArrayList<Integer> arr =  new ArrayList<Integer>();
	      arr.add(1);
	      arr.add(2);
	      arr.add(3);
	      arr.add(4);
	      arr.add(5);
	      arr.add(6);
	      arr.add(7);
	      
	      int n = arr.size();
	      int k = 3;
	      reverseInGroups(arr,n,k);
	      System.out.println();

	}
	 static void reverseInGroups(ArrayList<Integer> arr, int size, int targetVal) {
		    int l, r;
		    for(int i =0; i<size; i= i+targetVal){
		        l=i;
		        if(size-1<i+targetVal-1)
		        r=size-1;
		        else
		        r=i+targetVal-1;
		        while(l<r){
		            Collections.swap(arr,l,r);
		            l++;
		            r--;
		        }
		        
		    }
		  
		    }
}
