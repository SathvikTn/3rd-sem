//package abstracta;

import java.util.*;      //sath

abstract class Solid{
	double r;          //radius r
	public abstract void readradius();
	public abstract void surfacearea();
	public abstract void volume();
	Scanner s = new Scanner(System.in);
    public double basearea(double r)
    {
    	double p;
    	p=Math.PI*r*r;
    	return(p);
    }
}
class Cylinder extends Solid
{
    double h;         //height h
    public Cylinder(double h)
    { this.h=h; }
	public void readradius() {
		System.out.println("Enter the radius of cylinder");
	    r = s.nextDouble();	
	}

	public void surfacearea() {
		double barea;
		double totalarea;
		barea = basearea(r);
		totalarea = 2*Math.PI*r*h + 2*barea;
		System.out.println("Surface area of cylinder : "+totalarea);
	}

	public void volume() {
		System.out.println("Volume of cylinder : "+h*(basearea(r)));
	}
}
class Cone extends Solid
{
    double h;    //height h
	public Cone(double h)
	{ this.h = h;    }
	public void readradius() {
		System.out.println("Enter the radius of cone:");
		r = s.nextDouble();
	}

	public void surfacearea() {   
	    double slantheight = Math.sqrt(r*r+h*h);
	    double area = (Math.PI*r)*(r+slantheight);
		System.out.println("Surface area of cone : "+area);
	}

	public void volume() {
      double volume = (1.0/3)*(basearea(r))*h;
  	System.out.println("Volume of cone : "+volume);
	}	
}
class Sphere extends Solid
{
	public void readradius()
	{
		System.out.println("Enter the radius of Sphere:");
		r = s.nextDouble();
	}
	public void surfacearea()
	{
		System.out.println("Surface area of Sphere : "+4*basearea(r));
	}
	public void volume()
	{
		double volume = (4.0/3)*(basearea(r)*r);
		System.out.println("Volume of cone:"+volume);
	}
}

public class Mysolids {
	public static void main(String[] args) {
    	Solid s = new Cylinder(7);
    	s.readradius();
    	s.surfacearea();
    	s.volume();
    	s = new Cone(7);
    	s.readradius();
    	s.surfacearea();
    	s.volume();
    	s = new Sphere();
    	s.readradius();
    	s.surfacearea();
    	s.volume();
	}
}
