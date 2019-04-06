import java.util.Scanner;
public class Largest 
    {                             //sath
     public static void main(String[] args) 
     {
      int a,b,c,big;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the first number");
	a=s.nextInt();
       System.out.println("Enter the second number");
	b=s.nextInt();
       System.out.println("Enter the third number");
	c=s.nextInt(); 
       big=((a>b)&(a>c))?a:(b>c)?b:c;
       System.out.println(big);
	}
}