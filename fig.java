import java.io.*;
import java.util.*;
class Figure
{
	int l,b;
	Figure(int x,int y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		System.out.println("area");
	}
}
class Triangle extends Figure
{
	Triangle(int bs,int h)
	{
		super(bs,h);
		System.out.println("area of tri is:");
	}
	void area()
	{
		System.out.println(0.5*l*b);
	}
}
class Rectangle extends Figure
{
	Rectangle(int l,int b)
	{
		super(l,b);
		System.out.println("area of rectangle is:");
	}
	void area()
	{
		System.out.println(l*b);
	}
}
class A
{
	public static void main(String...aaa)
	{
		Rectangle o=new Rectangle(2,3);
		Triangle ob=new Triangle(4,5);
		o.area();
		ob.area();
	}
}


