import java.util.Scanner;
public class Arithmetic 
      {
	public static void main(String[] args)        //sath
	{
		int a,b,add,sub,mul,div,mod,i;
		
		Scanner q=new Scanner(System.in);
		System.out.println("1.add"
				+ "2.sub"
				+ "3.mul"
				+ "4.div"
				+ "5.mod");
		System.out.println("Enter a and b");
		a=q.nextInt();
		b=q.nextInt();
		add=(a+b);
		sub=(a-b);
		mul=(a*b);
		div=(a/b);
		mod=(a%b);             //displays remainder
		System.out.println("Enter your Choice");
		i=q.nextInt();
		if(i==1)
			System.out.println("a+b = "+add);
            
		else if(i==3)
		        System.out.println("a*b = "+mul);

		else if(i==2)
	                System.out.println("a-b = "+sub);

		else if(i==4)
			System.out.println("a/b = "+div);

		else 
                        System.out.println("a%b = "+mod);
		
	}

}