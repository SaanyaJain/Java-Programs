//5
import java.util.*;
abstract class figure
{
int a,b;
Scanner sc=new Scanner(System.in);
abstract void area();
abstract void perimeter();
}
class square extends figure
{
void area()
{
System.out.println("Enter side for square: ");
a=sc.nextInt();
int ar=a*a;
System.out.println("\nThe area of square is: "+ar);
}
void perimeter()
{
int pr=4*a;
System.out.println("\nThe perimeter of square is: "+pr);
}
}
class rectangle extends figure
{
void area()
{
System.out.println("Enter length and breadth for rectangle: ");
a=sc.nextInt();
b=sc.nextInt();
int ar=a*b;
System.out.println("\nThe area of rectangle is: "+ar);
}
void perimeter()
{
int pr=2*(a+b);
System.out.println("\nThe perimeter of rectangle is: "+pr);
}
}

class abstrcls
{
public static void main(String args[])
{
square s=new square();
s.area();
s.perimeter();
rectangle r =new rectangle();
r.area();
r.perimeter();
}
}


