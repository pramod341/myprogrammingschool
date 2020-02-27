import java.io.*;
import java.util.*;
class C
{
public static void main(String...rrf)throws IOException
{
FileReader o=new FileReader("kill.txt");
int c,v=0,z=0,d=0,w=1,sp=0,q=0;
while((c=o.read())!=-1)
{
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
v++;
}
else if(65<c&&c>=92||97<c&&c>=122)
{
z++;
}
else if(48<=c||c>=57)
{
d++;
}
else if(c==' ')
{
w++;
}
else if(c=='\n')
{
q++;
}
else
{
sp++;
}
}
System.out.println("vowels"+v);
System.out.println("consonants"+z);
System.out.println("digits"+d);
System.out.println("words"+w);
System.out.println("special symbols"+sp);
System.out.println("no of lines"+q);
}
}





