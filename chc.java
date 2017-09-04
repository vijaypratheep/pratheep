import java.util.*;
public class chc
{
public static void main(String []args)
{
Scanner sc=new  Scanner(System.in);
char q=sc.next();
if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u'||q=='A'||q=='E'||q=='I'||q=='O'||q=='U')\
{
System.out.print("character is a vowel");
}
else if(q>='a'&&q<='z'||q>='A'&&q<='Z')
{
System.out.print("character is a consonant");
}
else
{
System.out.print("it is not a character");
}
}
}
