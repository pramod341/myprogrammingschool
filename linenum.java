import java.io.*;
import java.util.*;
class B
{
public static void main(String bb[])throws IOException
{
FileReader o=new FileReader("kill.txt");
int c,i=2;
System.out.print(1+".");
while((c=o.read())!=-1)
{
if(c=='\n')
{
System.out.println();
System.out.print(i+".");
i++;
}
else
{
System.out.print((char)c);
}
}
o.close();
}
}
