import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
Scanner o=new Scanner(System.in);
System.out.println("enter the range of numbers :");
int k=o.nextInt();
int h,w=0;
System.out.println("enter the number of pairs :");
h=o.nextInt();
int a[]=new int[k];
int i,j,e=0,t,count;
for(i=1;i<=k;i++)
{
count=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==2)
{
a[e]=i;
e++;
}
}
for(int g=0;g<e;g++)
{
if(h>w)
{
if(a[g+1]-a[g]==2)
{
System.out.println(a[g]+","+a[g+1]);
w++;
}
}
}
}
}
