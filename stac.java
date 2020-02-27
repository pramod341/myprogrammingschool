import java.io.*;
import java.util.*;

class B
{
int top=-1;
Scanner q=new Scanner(System.in);
void push(int a[],int n)
{
if(top==n-1)
{
System.out.println("the push is not possible");
}
else
{
System.out.println("enter the value");
a[++top]=q.nextInt();
}
}
void pop(int a[],int n)
{
if(top==-1)
{
System.out.println("popping is not possible");
}
else
{
System.out.println(a[top]);
top=top-1;
}
}
void display(int a[],int n)
{
int i;
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
}
class A
{
public static void main(String s[])
{
B r=new B(); 
Scanner k=new Scanner(System.in);
System.out.println("enter the size of array :");
int n,i,t,j,f=0;
n=k.nextInt();
int a[]=new int[n];
System.out.println("1.push 2.pop 3.display");
do
{
t=k.nextInt();
switch(t)
{
case 1:
r.push(a,n);
break;
case 2: 
r.pop(a,n);
break;
case 3:
r.display(a,n);
break;
default: 
System.out.println("the choice is not available");
break;
} 
}
while(t!=4);
}
}

