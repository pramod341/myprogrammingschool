import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
	Scanner P=new Scanner(System.in);
int i,j,l,k,m=0,t=0;
String a;
char q[]=new char[100];
System.out.println("enter string");
a=P.next();
l=a.length();
k=0;
for(i=0;i<25;i=i+l)
{
for(j=0;j<l;j++)
{
q[k]=a.charAt(j);
k++;
}
}
for(i=0;i<25;i++)
{
	System.out.print(q[i]);
	if(q[i]=='b')
	{
        t++;
	}
}
System.out.println(t);
}
}
