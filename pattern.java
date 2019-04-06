import java.util.Scanner;
abstract class Figure
{
double dim1;
double dim2;
Figure(double a,double b)
{
dim1=a;
dim2=b;
}
abstract double area();
}
class rectangle extends Figure{
rectangle(double a,double b)
{
super(a,b);}
double area(){
System.out.println("inside area the rectangle");
return dim1*dim2;}
}
}
class triangle extends Figure
{
triangle(double a,double b)
{
super(a,b);}
double area();
{
System.out.println("inside the area for triangle");
return dim1*dim2/2;
}
}
class abstract area
{
public static void main(String agrs[])
{
rectangle r=new rectangle(9,5);
triangle t=new triangle(10,8);
Figure figref;
figref=r;
System.out.println("area is "+figref.area());
figref=t;
System.out.println("area is"+figref.area());
}
}

