package com.olenick.matrixPractice;
import java.util.ArrayList;


public class Matrix {

	
	public static void main(String[] args) {
		
		//create an array of arrays for the matrix
	    int[][] matrix = new int[101][101];
	    
	    	    	    
	    //create a list for the prime numbers
	    ArrayList<Integer> primes = new ArrayList<Integer>();
	    primes.add(2);
	    primes.add(3);
	    primes.add(5);
	    primes.add(7);
	    
	    
	    //Loop through the array. If the current row index is prime, add 1 to the column with the same index
	    //and add that number to the list of primes.
	    //If the row index is not prime, loop through the primes and add 1 for every prime factor exponent
	    //to the corresponding column
	    for(int i=4; i<101; i++) {
	    	
	    	if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
	    		matrix[i][i]++;
	    		primes.add(i);
	    	}
	    	
	    	else {
	    		int currNumber = i;
	    		int primeIndex = 0;
	    		
	    		while(currNumber != 0 && primeIndex < primes.size()) {
	    			
	    			if(currNumber % primes.get(primeIndex) == 0) {
	    				matrix[i][primes.get(primeIndex)]++;
	    				currNumber = currNumber / primes.get(primeIndex);
	    					    				
	    			}
	    			else {
	    				primeIndex++;
	    			}
	    		}
	    	}
	    }
	    
	     
	    
	    //print the matrix
	    for(int i=0; i<101; i++) {
	    	System.out.printf("%03d = ", i);
	    	for(int j=0;j<101;j++) {
	    		
	    		System.out.print(matrix[i][j] + " ");
	    		
	    	}
	    	System.out.println("");
	    }
	
	}

}
