package string;
import java.util.Scanner;  //sath
                                    
public class Soperations {
 public static void main(String args[]) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the String");
	 String S = new String(s.next());

	 //middle char
	 int n = S.length(),count=0,i;
	 System.out.println("The middle char is "+S.charAt(n/2));
	
        //palindrome or not
	 String r="";
	 for(i=n-1;i>-1;i--)
		 r=r+S.charAt(i);
	 if (S.equals(r))
		 System.out.println(S+" is a Palindrome");
	 else System.out.println(S+" is not a palindrome");

	 //no. of vowels
	 char c[] = S.toCharArray();
	 for(i=0;i<n;i++)
	 {
		 if(c[i]=='a'|c[i]=='e'|c[i]=='i'|c[i]=='o'|c[i]=='u')
			 count++;
	 }
	 System.out.println("The no. of vowels are "+count);

	 //no. of chars
	 System.out.println("The total no. of char in the string is "+n);
 }
}