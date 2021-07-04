package com.example.fibonaccirestservice;

import java.util.ArrayList;
import java.util.Collections;

public class Fibonacci {
	private ArrayList<Integer> fibonacci; //list of fibonacci numbers
	private ArrayList<Integer> sorted_fib; //list of sorted fibonacci numbers (even, then odd numbers, both in descending order)
	
	public Fibonacci(Integer elements) {
		this.fibonacci = sequence(elements); 
		this.sorted_fib = sorted_fib(this.fibonacci);
	}
	
	public ArrayList<Integer> getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(ArrayList<Integer> fibonacci) {
		this.fibonacci = fibonacci;
	}
	
	public ArrayList<Integer> getsorted_fib() {
		return sorted_fib;
	}

	public void setsorted_fib(ArrayList<Integer> sorted_fib) {
		this.sorted_fib = sorted_fib;
	}
	
	//Obtaining the Fibonacci sequence based on a given max number of elements
	private ArrayList<Integer> sequence(Integer element) {
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		int n0 = 0;
		int n1 = 1;
		int n2 = 1;
		
		if (element == 0) return fibonacci;
		
		else if (element == 1) {
			fibonacci.add(n0);
			return fibonacci;
		}
		
		else if (element > 1) {
			fibonacci.add(n0);
			fibonacci.add(n1);
			int count = 2;
			
			while (count < element) {
				fibonacci.add(n2);
				n0 = n1;
				n1 = n2;
				n2 = n1 + n0;
				count++;
			}
			return fibonacci;
		}
		
		else return null;
	}


	//Sorting a sequence - even numbers in descending order, then odd numbers in descending order
	public ArrayList<Integer> sorted_fib(ArrayList<Integer> arr) {
		
		int length = arr.size();
		
		ArrayList<Integer> oddNumber = new ArrayList<Integer>(0);
        ArrayList<Integer> evenNumber = new ArrayList<Integer>(0);
        
        for (int i = 0; i < length; i++) {
            Integer val = arr.get(i);
            if(val % 2 == 0){
                evenNumber.add(val);
            } else {
                oddNumber.add(val);
            }
        }
        Collections.sort(evenNumber, Collections.reverseOrder());
        Collections.sort(oddNumber, Collections.reverseOrder());

        evenNumber.addAll(oddNumber);

        return evenNumber;
    }
		
		
}
