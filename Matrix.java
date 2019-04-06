import java.util.Scanner;
public class Matrix {                       //sath
   public static void main(String args[])
     {
	int a[][]=new int[10][10],b[][]=new int[10][10],c[][]=new int[10][10],i,j,m,n,p,q,k;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the order of matrix A ");
	m=s.nextInt(); 
	n=s.nextInt();
	System.out.println("Enter the order of matrix B");
	p=s.nextInt();
	q=s.nextInt();
	if(n!=p)
	System.out.println("The matrix multiplication is not possible");
	else
	 {
		System.out.println("Enter the elements of matrix A");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=s.nextInt();
		System.out.println("Enter the elements of matrix B");
		for(i=0;i<p;i++)
		   for(j=0;j<q;j++)
			  b[i][j]=s.nextInt();
	    for(i=0;i<m;i++)
	    	for(j=0;j<q;j++)
	    	{
	    		c[i][j]=0;
	    		for(k=0;k<n;k++)
	    		c[i][j]=c[i][j]+a[i][k]*b[k][j];	
	    	}
	    System.out.println("The matrix after multiplication are");
	    for(i=0;i<m;i++)
	    	for(j=0;j<q;j++)
	          System.out.println(c[i][j]);
	    
	 }

}
}