import java.io.*;
class A
{
void circle()
{
double k=3.14*4*4;
System.out.println(k);
}
void triangle()
{
double l=0.5*4*5;
System.out.println(l);
}
void rectangle()
{
int m=30*40;
System.out.println(m);
}
}
class B
{
public static void main(String s[])
{
A j =new A();
j.circle();
j.triangle();
j.rectangle();
}
}
