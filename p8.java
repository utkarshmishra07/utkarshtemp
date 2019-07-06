import java.util.Scanner;
class p8{
boolean hasTeen(int n2 , int n1)
{

if((n1==10)||(n2==10))
{
return true;
}
if((n1+n2)==10)
{
return true;
}
else
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n1: ");
int n1=sc.nextInt();
System.out.println("Enter value of n2: ");
int n2=sc.nextInt();
p8 m=new p8();
boolean i=m.hasTeen(n1, n2);
System.out.print("\n"+ i);

}
}