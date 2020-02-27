import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
Scanner k=new Scanner(System.in);
int n=5,i,t,j;
int h[]=new int[n];
System.out.println("enter the values of the array :");
for(i=0;i<5;i++)
{
if(i==0)
{
int m=k.nextInt();
if(10<=m && m<=100)
{
h[i]=m;
}
else
{
System.out.println("enter the value again");
i--;
}
}
else
{
int r=k.nextInt();
if(10<r && r<100)
{
for(j=0;j<=i;j++)
{
if(r==h[j])
{
System.out.println("value is already present in array");
}
else
{
h[i]=r;
}
}
}
else
{
System.out.println("enter the value again");
i--;
}
}
}
for(j=1;j<=5-1;j++)
{
System.out.println(h[j]);
}
}
}

