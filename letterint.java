import java.io.*;
import java.util.*;
class A
{
	public static void main(String...aa)
	{
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		String x[]=new String[k];
		char sp[][]=new char[k][15];
		System.out.println("enter string");
		for(int i=0;i<k;i++)
		{
			x[i]=s.next();
			int l=x[i].length();
			int st=0;
			for(int j=0;j<l;j++)
			{
				char c=x[i].charAt(j);
				if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
					st++;
			}
			int num=l-st;
			int n=num;
			for(int h=0;h<l;h++)
			{
				char c=x[i].charAt(h);
				if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
					sp[i][h]=c;
				else
				{
					sp[i][15-n]=c;
					n--;
				}
			}
			while((14-num)>st)
			{
				sp[i][14-num]=' ';
				num++;
			}
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<15;j++)
			{
				System.out.print(sp[i][j]);
			}
			System.out.println();
		}
	}
}


