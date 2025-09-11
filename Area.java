import java.util.*;
abstract class sympol
{
abstract void area();
}
class Rectangle extends shape{
int l,b;
void area()
{
int area_r=l*b;
System.out.println("area of rectangle"+area_r);
}
}
class Square extends shape
{
int a;
void area()
{
int area_s=a*a;
System.out.println("area of square"+area_s);
}
}
class Area{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the length");
int l=sc.nextInt();
System.out.println("enter the breadth");
int b=sc.nextInt();
System.out.println("enter the a");
int a=sc.nextInt();
Rectangle r=new Rectangle();
r.l=l;
r.b=b;
r.area();
Square s=new Square();
s.a=a;
s.area();
}
}