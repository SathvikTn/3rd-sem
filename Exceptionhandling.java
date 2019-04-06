//package Exdemo; 
 
public class Exceptionhandling {           //sath
  public static void main(String args[]) {
	  int a[] = new int[2];
	  try {
		  for(int i=0;i<=a.length;i++) {     //a.length is 2 and when i = 2,shows exception
		  a[i]=10;                            //since i shd have only 0 and 1 caz of length 2
		  System.out.println(a[i]);
	      }
	  }
	  catch(ArrayIndexOutOfBoundsException e){
		  e.printStackTrace();
	  }
  }
} 
