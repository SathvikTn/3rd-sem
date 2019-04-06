//package fibo;
import java.util.Scanner;         //Sath
public class fiboseries {       // Fib number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2 /* first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 */ 
public static void main(String args[]) { 
	System.out.println("Enter number upto which Fibonacci series to print: "); 
	int n = new Scanner(System.in).nextInt(); 
	System.out.println(n+"th value of fib series is ");  
	System.out.print(fibonacci(n)); 
	}

public static int fibonacci(int n){ 
		if(n == 1 || n == 2){ 
			return 1;
			}
		int fib1=1, fib2=1, fib=1; 
		for(int i= 3; i<= n; i++){   
				fib = fib1 + fib2;
				fib1 = fib2; 
				fib2 = fib;
				}  	 
		 return fib; 
	 }
	}
	
		

