import java.io.*;

import java.util.*;
class A
{
void per(char a[],int k)
{
if(k==a.length)
{
for(int i=0;i<a.length;i++)
System.out.print(a[i]);
System.out.println();
}
else
{
for(int i=k;i<a.length;i++)
{
char t=a[k];
a[k]=a[i];
a[i]=t;
this.per(a,k+1);
t=a[k];
a[k]=a[i];
a[i]=t;
}}}}
class B
{
public static void main(String aaa[])
{
A p=new A();
Scanner  o=new Scanner(System.in);
System.out.println("Enter the string");
String s=o.next();
char[] c=new char[s.length()];
for(int i=0;i<s.length();i++)
c[i]=s.charAt(i);
System.out.println("Permutations");
p.per(c,0);
}
}