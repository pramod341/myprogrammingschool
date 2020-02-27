import java.io.*;
import java.util.*;
class A
{
public static void main(String S[])
{
Scanner l=new Scanner(System.in);
int n=5,i,j,t,y;
int a[]=new int[n];
for(i=0;i<n;i++)
{
if(i==0)
{
t=l.nextInt();
if(10<t && t<100)
{
a[i]=t;
}
else
{
System.out.println("not in range Enter the value again");
i--;
}
}
else
{
t=l.nextInt();
if(10<t && t<100)
{
for(j=0;j<i;j++)
{
if(t==a[j])
{
System.out.println("Duplicate found Enter the value again : ");
i--;
}
else
{
a[i]=t;
}
}
}
else
{
System.out.println("not in range Enter the value again : ");
i--;
}
}
}
for(y=0;y<n;y++)
{
System.out.println(a[y]);
}
}
}























