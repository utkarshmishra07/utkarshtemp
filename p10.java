import java.util.Scanner;
class p10{
int hasTeen(int n1, int n2)
{

if(((n1<20)||(n2<20))&&((n1>12)||(n2>12)))
{
n1=19;
return n1;
}
else
{
n1=n1+n2;
return n1;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int n1=sc.nextInt();
System.out.print("\nEnter second number: ");
int n2=sc.nextInt();
p10 m=new p10();
int i=m.hasTeen(n1, n2);
System.out.print("\n"+ i);

}
}