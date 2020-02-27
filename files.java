import java.io.*;
import java.util.*;
class A
{
public static void main(String s[])throws IOException
{
int c,i=0,j,g;
Scanner u=new Scanner(System.in);
FileReader o=new FileReader("abc.txt");
i=50;
System.out.println("enter the number of files");
int k=u.nextInt();
int e=i/k;
int h;
for(j=1;j<=k;j++)
{
for(g=0;g<=e;g++)
{
FileWriter y=new FileWriter("abc"+j+".txt");
while((h=o.read())!=-1)
{
y.write(h);
}
y.close();
}
}
o.close();
}
}
