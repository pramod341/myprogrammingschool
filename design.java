import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])
{
Scanner k=new Scanner(System.in);
System.out.println("enter the size of design:");
int n,i,j,sp,o;
n=k.nextInt();
for(i=1;i<=n;i=i+2)
{
for(sp=1;sp<=n-i;sp++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.print("\n");
}
for(i=n;i>0;i=i-2)
{
for(sp=1;sp<=n-i+2;sp++)
{
System.out.print(" ");
}
for(j=i-2;j>0;j--)
{
System.out.print("* ");
}
System.out.print("\n");
}
}
}

