import java.util.*;       //Sath
  struct emp
  {
	int empno,basic;
	char empname;
   }e[10];
public class employee {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
    int empno[]=new int [10];
	int basic[]=new int [10],pt=100,cca=250;
   String empname; 
   float gross,deduct,net,da,hra,pf,it;
   System.out.println("Enter the number of employees");
   int n = s.nextInt();
   for(int i=0;i<n;i++) {
   System.out.println("Enter the employee number and name");
   empno[i]=s.nextInt();
   empname = s.next(); 
   System.out.println("Enter the value of basic");
   basic[i]=s.nextInt();
   da = (40/100)*basic[i];
   hra = (20/100)*basic[i];
   pf = (10/100)*basic[i];
   gross = basic[i]+da+hra+cca;
   it=(10/100)*gross;
   deduct = pf+pt+it;
   net = gross-deduct;   
   System.out.println("Emp name\tEmpno\tGross\tNet");
   System.out.println(empname+"\t"+empno+"\t"+gross+"\t"+net);  
   
   }
   }
}
}

