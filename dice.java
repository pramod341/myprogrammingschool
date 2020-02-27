import java.io.*;
import java.util.*;
class B
{
public static void main(String s[])
{
Random o=new Random();
int d1,d2,c=0,i;
for(i=0;i<10000;i++)
{
d1=o.nextInt(6);
d2=o.nextInt(6);
if(d1==d2)
{
c++;
}
}
System.out.println("the count is "+c);
}
}
