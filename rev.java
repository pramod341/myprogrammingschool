import java.io.*;
class A
{
public static void main(String S[])
{
int a=123,rev=0,r=0,n;
n=a;
while(n>0)
{
r=n%10;
rev=rev*10+r;
n=n/10;
}
System.out.println(rev);
}
}
