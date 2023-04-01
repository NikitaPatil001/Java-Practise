package com.day3;

public class FamilyPhotoAlbum {

	    public static int totalParents(int input1, int input2, int[] input3) {
	        int[] childCounts = new int[input1];
	        
	        
	        for (int i = 0; i < input1; i++) {
	            if (input3[i] != -1) {
	                childCounts[input3[i]]++;
	            }
	        }
	        int count = 0;
	        for (int i = 0; i < input1; i++) {
	            if (childCounts[i] >= input2) {
	                count++;
	            }
	        }
	        
	        return count;
	    }
	    
	    public static void main(String[] args) {
	        int n = 1;
	        int x = 0;
	        int[] parents = {-1};
	        int count = totalParents(n, x, parents);
	        System.out.println(count); // Output: 1
	    }
	}

