import java.io.*;
class A
{
public static void main(String S[])
{
int x=0,y=1,z,i,n=10;
for(i=0;i<n;i++)
{
System.out.println(x);
z=x+y;
x=y;
y=z;
}
}
}
