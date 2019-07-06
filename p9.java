import java.util.Scanner;
class p9{
int hasTeen(int n1, int n2)
{

if(((n1<21)||(n2<21))&&((n1>9)||(n2>9)))
{
if(n1>n2)
{
return n1;
}
else
{
return n2;
}
}
else
{
n1=0;
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
p9 m=new p9();
int i=m.hasTeen(n1, n2);
System.out.print("\n"+ i);

}
}