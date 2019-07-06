import java.util.Scanner;
class p11{
boolean hasTeen(int n1, boolean s)
{

if((s==true)&&((n1>60)&&(n1<100)))
{
return true;
}
if((s==false)&&((n1>60)&&(n1<90)))
{
return true;
}
else
{
return false;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Is it summer? ");
boolean p=sc.nextBoolean();
System.out.print("What is Temprature? ");
int n1=sc.nextInt();
p11 m=new p11();
boolean i=m.hasTeen(n1, p);
System.out.print("\nSquirrels will play?"+ i);

}
}