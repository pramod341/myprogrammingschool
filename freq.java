import java.io.*;
import java.util.*;
class A
{
	public static void main(String...aa)
	{
		Scanner o=new Scanner(System.in);
		System.out.println("enter string");
		String a1=o.next();
		int i,j,k=0,l,c,n=0,z=0,g=0;
		l=a1.length();
		char[] a=a1.toCharArray();
		char [] a2=new char[100];
		int [] n2=new int[100];
		for(i=0;i<l;i++)
		{
			for(j=0;j<l-1;j++)
			{
				if(a[j]>a[j+1])
				{
					char t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<l;i=i+k)
		{
			c=0;
			k=0;
			for(j=i;j<l;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					c++;
				}
			}
			n++;
a2[z]=a[i];
n2[g]=c;
z++;
g++;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
{
if(n2[j]>n2[j+1])
			{
				int t=n2[j];
				n2[j]=n2[j+1];
				n2[j+1]=t;
				char m=a2[j];
				a2[j]=a2[j+1];
				a2[j+1]=m;
			}
		}
}
	
	System.out.println(a2[n-1]);
	System.out.println(n2[n-1]);
}
}
