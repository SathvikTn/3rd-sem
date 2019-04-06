package fibo;
import java.util.*;   //Sath
import java.io.*;
import java.lang.*;

class rec{
	int fib(int n) {
	if(n==1||n==2)
		return 1;
	else return (fib(n-1)+fib(n-2));
}
}
public class recfib {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
    System.out.println("Enter the nuber");
    int n = s.nextInt();
    rec ob = new rec();
    int res = 0;
    for(int i=1;i<=n;i++)
    	res = ob.fib(i);
    System.out.println(n+"th value of fib series is "+res);
} 
}