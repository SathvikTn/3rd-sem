//package fibonaci;

import java.util.Scanner;

public class fibonaci {                        //sath

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, a = 1, b = 1, c = 0, t;
		System.out.println("enter the value of t");
		t = input.nextInt();
		System.out.print(a);
		System.out.print(" " + b);
		for (i = 0; i < t - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
		System.out.println("\n"+t + "th value of series is " + c);
	}

}
