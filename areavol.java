//6
import java.util.*;
abstract class shape
{
abstract void calc_area();
abstract void calc_volume();
}
class sphere extends shape
{
double r;
sphere(double r)
{
this.r=r;
}
void calc_area()
{
double a=4*3.14*r*r;
System.out.println("\nThe area of sphere is: "+a);
}
void calc_volume()
{
double b=4/3*3.14*r*r*r;
System.out.println("\nThe volume of sphere is: "+b);
}
}
class cone extends shape
{
double r,l,h;
cone(double r,double l,double h)
{
this.r=r;
this.l=l;
this.h=h;
}
void calc_area()
{
double c=(3.14*r*r)+(3.14*r*l);
System.out.println("\nThe area of cone is: "+c);
}
void calc_volume()
{
double d=(1*3.14*r*r*h)/3;
System.out.println("\nThe volume of cone is: "+d);
}
}
class cylinder extends shape
{
double r,h;
cylinder(double r,double h)
{
this.r=r;
this.h=h;
}
void calc_area()
{
double e=(2*3.14*r*h)+(2*3.14*r*r);
System.out.println("\nThe area of cylinder is: "+e);
}
void calc_volume()
{
double f=4/3*3.14*r*r*r;
System.out.println("\nThe volume of cylinder is: "+f);
}
}
class box extends shape
{
double l,b,h;
box(double l,double b,double h)
{
this.l=l;
this.b=b;
this.h=h;
}
void calc_area()
{
double g=(2*l*b)+(2*l*h)+(2*b*h);
System.out.println("\nThe area of box is: "+g);
}
void calc_volume()
{
double v=l*b*h;
System.out.println("\nThe volume of box is: "+v);
}
}
class areavol
{
public static void main(String args[])
{
sphere s=new sphere(5.2);
s.calc_area();
s.calc_volume();

cylinder m=new cylinder(4.3,6.7);
m.calc_area();
m.calc_volume();

cone x=new cone(5.2,6.5,2.4);
x.calc_area();
x.calc_volume();

box y=new box(5.2,3.3,5.5);
y.calc_area();
y.calc_volume();
}
}

