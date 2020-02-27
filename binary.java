import java.io.*;
import java.util.*;
class B
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
int mid=(n-1)/2;
System.out.println("enter the search element");
int l=k.nextInt();
if(h[mid]==l)
{
System.out.println("the elemenet is found");
}
else if(h[mid]>l)
{
for(i=0;i<mid;i++)
{
if(h[i]==l)
{
System.out.println("the element is found");
}
}
}
else if(l>h[mid])
{
for(i=mid+1;i<n;i++)
{
if(h[i]==l)
{
System.out.println("the element is found");
}
}
}
else
{
System.out.println("element not found");
}
}
}

