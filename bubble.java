import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
Scanner k=new Scanner(System.in);
System.out.println("enter the size of array :");
int n,i,t,j;
n=k.nextInt();
int h[]=new int[n];
System.out.println("enter the values of the array :");
for(i=0;i<n;i++)
{
h[i]=k.nextInt();
}
System.out.println("Array before sorting");
for(j=0;j<n;j++)
{
System.out.println(h[j]);
}
for(i=0;i<n-1;i++)
{
for(j=0;j<n-1;j++)
{
if(h[j]>h[j+1])
{
t=h[j];
h[j]=h[j+1];
h[j+1]=t;
}
}
}
System.out.println("Array after sorting");
for(j=0;j<n;j++)
{
System.out.println(h[j]);
}
}
}
