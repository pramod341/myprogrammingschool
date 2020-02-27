import java.io.*;
import java.util.*;
class M
{
public static void main(String...aa)
{
Scanner j=new Scanner(System.in);
System.out.println("enter the number of names");
int n=j.nextInt();
String o[]=new String[n];
System.out.println("enter the names");
for(int i=0;i<n;i++)
{
o[i]=j.next();
}
char c;
for(int q=0;q<n;q++)
{
int k=o[q].length();
c=o[q].charAt(k-1);
System.out.println(c);
}
}
}
