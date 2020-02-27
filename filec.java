import java.io.*;
import java.util.*;
class B
{
public static void main(String bb[])throws IOException
{
FileReader o=new FileReader("abc.txt");
FileWriter l=new FileWriter("hello.txt");
int c;
while((c=o.read())!=-1)
{
l.write(c);
}
o.close();
l.close();
}
}
