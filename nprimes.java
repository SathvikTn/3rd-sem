//package prime;
import java.util.Scanner;            //sath

class nprimes{
public static void main(String args[])
{
int i,j,c=0,a;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number for its prime series");
a=s.nextInt();
for(i=1;i<=a;i++)
{
for(j=1;j<=i;j++)
{
     if(i%j==0)
      c++;
}
if(c==2){
System.out.print(i+"\t");c=0;}
else {c=0;}
}
}
}
