import java.util.Scanner;
class Quadratic {
public static void main(String args[])            //sath
{ int a,b,c;
double root1,root2,d;
Scanner q = new Scanner(System.in);
System.out.println("Enter the value of a");
a=q.nextInt();
System.out.println("Enter the value of b");
b=q.nextInt();
System.out.println("Enter the value of c");
c=q.nextInt();
d=b*b-4*a*c;
System.out.println("For the given Quadratic equation");
if(d==0)
{
System.out.println("The roots are real and equal");
root1=(-b)/(2*a);
root2=root1;
System.out.println("root1="+root1+" and root2="+root2);
}
else if(d>0)
{
	System.out.println("Roots are real and distinct");
	root1=(-b+Math.sqrt(d))/(2*a);
	root2=(-b-Math.sqrt(d))/(2*a);
	System.out.println("root1="+root1+" and root2="+root2);
}
else if(d<0)
{
	System.out.println("Roots are imaginary");
}
}
}