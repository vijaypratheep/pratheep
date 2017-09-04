import java.util.*;
public class large
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String a[]=new String[3];
for(int i=0;i<3;i++)
  {
  a[i]=sc.nextLine();
  }
Arrays.sort(a);
 System.out.print(a[2]);
  }
  }
