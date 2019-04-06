
interface Vehicle     //sath
{
   void steering();
   void brakes();
   void speed();
}
class Car implements Vehicle
{
	public void steering()
	{
		System.out.println("Car ");
		System.out.println("Steering : ");
		System.out.println("   **  ");
		System.out.println(" *    * ");
		System.out.println(" *    *");
		System.out.println("   ** ");
	}
	public void brakes() {
		System.out.println(" Brakes have ABS System");
	}
	public void speed()
	{
		System.out.println(" Speed is Awesome");
	}
}
class Bus implements Vehicle
{
	public void steering()
	{
		System.out.println("Bus ");
		System.out.println("Steering : ");
		System.out.println("   *****  ");
		System.out.println(" *       * ");
		System.out.println(" *       * ");
		System.out.println(" *       * "); 
		System.out.println(" *       * ");
		System.out.println("   *****  ");
	}
	public void brakes() {
		System.out.println(" Brakes do not have ABS System");
	}
	public void speed()
	{
		System.out.println(" Speed is good");
	}
}
class Lorry implements Vehicle
{
	public void steering()
	{
		System.out.println("Lorry ");
		System.out.println("Steering : ");
		System.out.println("   **  ");
		System.out.println(" *    * ");
		System.out.println("*      *");
		System.out.println(" *    *");
		System.out.println("   ** ");
	}
	public void brakes() {
		System.out.println(" Brakes are bullshit");
	}
	public void speed()
	{
		System.out.println(" Speed is none");
	}
}
public class Vehicle_Interface {
public static void main(String args[]) {
	 Vehicle c = new Car();
	 c.steering();
	 c.brakes();
	 c.speed();
	 Vehicle b = new Bus();
	 b.steering();
	 b.brakes();
	 b.speed();
	 Vehicle l = new Lorry();
	 l.steering();
	 l.brakes();
	 l.speed();
	 
}
}
