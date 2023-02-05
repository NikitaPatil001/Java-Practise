package com.leetcode.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople {

	public static void main(String[] args) {
		
		String [] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		
		SortThePeople stp = new SortThePeople();
		
		SortThePeople.sortPeople(names,heights);

	}
	public static String[] sortPeople(String[] names, int[] heights) {
		      Map<Integer,String> map=new HashMap<Integer,String>(); 
		      for(int i =0; i<heights.length; i++){
		         map.put(heights[i],names[i]);
		         }

		         Arrays.sort(heights);

		        String [] temp =  new String[heights.length] ;
		        int index = 0;

		        for(int i = heights.length -1; i>=0; --i){
		            temp[index] = map.get(heights[i]);
		            index ++;
		        }
		        return temp; 
		        
			}
		
		
    }


