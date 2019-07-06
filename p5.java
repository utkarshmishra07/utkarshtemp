import java.util.Scanner;
class p5{
int hasTeen(int n1, int n2, int n)
{

if(n1==n2)
{
n=n1+n2;
n=2*n;
return n;
}
else
{
n=n1+n2;
return n;
}

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter first number: ");
int n1=sc.nextInt();
System.out.print("\nEnter second number: ");
int n2=sc.nextInt();
int n=0;
p5 m=new p5();
int i=m.hasTeen(n1, n2, n);
System.out.print("\n"+ i);

}
}