import java.util.Scanner;
class p2{
boolean hasTeen(int num1,int num2,int num3)
{

if((num1>12)||(num2>12)||(num3>12))
{
if((num1<20)||(num2<20)||(num3<20))
{
return true;
}
else
return false;
}
else
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int num1=sc.nextInt();
System.out.println("enter second number");
int num2=sc.nextInt();

System.out.println("enter third number");
int num3=sc.nextInt();
p2 m1=new p2();
boolean i=m1.hasTeen(num1, num2, num3);
System.out.println("The number has teen in it?\n "+i);

}
}