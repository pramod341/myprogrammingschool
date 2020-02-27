import java.io.*;
import java.util.*;
interface C
{
public int devisor(int x);
}
class Calculator implements C
{
public int devisor(int x)
{
int i,j=0;
for(i=1;i<=x;i++)
{
if(x%i==0)
{
j=j+i;
}
}
System.out.println(j);
return 0;
}
}
class B
{
public static void main(String S[])
{
Scanner o=new Scanner(System.in);
Calculator y=new Calculator();
System.out.println("Enter the value :");
int f=o.nextInt();
y.devisor(f);
}
}
