import java.util.Scanner;
class p6{
int hasTeen(int n , int p)
{

if((n<=21))
{
p=21-n;
return p;
}
else
{
p=n-21;
p=p*2;
return p;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n: ");
int n=sc.nextInt();
int p=0;
p6 m=new p6();
int i=m.hasTeen(n, p);
System.out.print("\n"+ i);

}
}