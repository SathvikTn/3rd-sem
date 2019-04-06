class one extends Thread{
 one(){
start();                            //sath
}
public void run()
{
for(int i=0;i<5;i++){
 try{
       sleep(1000);
}
catch(InterruptedException e)
{}
System.out.println("Good Morning");
}
}
}
class two extends Thread{
 two(){
start();
}
public void run()
{
for(int i=0;i<5;i++){
 try{
       sleep(2000);
}
catch(InterruptedException e)
{}
System.out.println("Hello");
}
}
}
class three extends Thread{
 three(){
start();
}
public void run()
{
for(int i=0;i<5;i++){
 try{
       sleep(3000);
}
catch(InterruptedException e)
{}
System.out.println("Welcome");
}
}
}
public class Threaddemo{
 public static void main(String args[])
{
  new one();
  new two();
 new three();
}
}