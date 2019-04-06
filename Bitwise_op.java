//package bitwise;
import java.util.*;                      //Sath
public class Bitwise_op {
public static void main(String args[]) {
	int c=0,a,b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a and b");
	a = s.nextInt();
	b = s.nextInt();
	System.out.println("Bitwise operators are");
	System.out.println("1.Bitwise And");
    c = a&b;
    System.out.println("a&b is "+c);
    System.out.println("2.Bitwise OR");
    c = a|b;
    System.out.println("a|b is "+c);
    System.out.println("3.Bitwise Compliment");
    c = ~a; 
    System.out.println("~a is "+c);
    System.out.println("4.Bitwise XOR");
    c = a^b;
    System.out.println("a^b is "+c);
    System.out.println("5.Leftshift");
     c = a<<2;
    System.out.println("a<<2 is "+c);
    System.out.println("6.Rightshift");
    c = a>>2;
    System.out.println("a>>2 is "+c);
}	
}
