import java.util.*;
public class alpha
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
char s=sc.next();
if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
{
System.out.print("it is an alphabet");
}
else
{
System.out.print("it is not an alphabet");
}
}
}
