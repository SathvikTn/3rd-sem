import java.io.*;   //Sath

public class File {
public static void main(String args[]) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    FileOutputStream a = new FileOutputStream(args[0]);
    FileInputStream b = new FileInputStream(args[0]);
    char c;
    int i;
System.out.println("Enter the contents of file...q to exit");
    do {
    	c = (char)br.read();
      if(c!='q')
    	a.write(c);
    }while(c!='q');
   a.close();
    System.out.println("\nContents of file are");
    do {
    i = b.read();
    if(i!=-1)
    	System.out.println((char)i);
    }while(i!=-1);
b.close();	 
}
}