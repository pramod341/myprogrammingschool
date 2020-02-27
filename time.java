import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
Scanner l=new Scanner(System.in);
GregorianCalendar o=new GregorianCalendar();
int h,m,h1,m1,i,n=10;
h=o.get(Calendar.HOUR);
m=o.get(Calendar.MINUTE);
System.out.println("Enter the time in hours and minutes :");
h1=l.nextInt();
m1=l.nextInt();
for(i=0;i<n;i++)
{
if(h==h1 && m==m1)
{
System.out.println("The times are equal");
break;
}
else
{
System.out.println("Enter the time again");
h1=l.nextInt();
m1=l.nextInt();
i--;
}
}
}
}


