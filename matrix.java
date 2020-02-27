import java.io.*;
import java.util.*;
class k
{
int i,j;
void add(int a[][],int b[][],int m,int n)
{
int g[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
g[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(g[i][j]);
}
}
}
void sub(int a[][],int b[][],int m,int n)
{
int g[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
g[i][j]=a[i][j]-b[i][j];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(g[i][j]);
}
}
}
void mult(int a[][],int b[][],int m,int n)
{
int g[][]=new int[m][n];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
g[i][j]=a[i][j]*b[i][j];
}
}
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(g[i][j]);
}
}
}
}
class C
{
public static void main(String...al)
{
k u=new k();
Scanner h=new Scanner(System.in);
int m,n,i,j;
System.out.println("enter the size of matrixes");
m=h.nextInt();
n=h.nextInt();
int k[][]=new int[m][n];
int l[][]=new int[m][n];
System.out.println("enter the values of 1st matrix : ");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
k[i][j]=h.nextInt();
}
}
System.out.println("enter the values of 2nd matrix : ");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
l[i][j]=h.nextInt();
}
}
u.add(k,l,m,n);
u.sub(k,l,m,n);
u.mult(k,l,m,n);
}
}


