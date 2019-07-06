import java.util.Scanner;
class p7{
boolean hasTeen(int n1, boolean p)
{

if((p==true)&&((n1>20)||(n1<7)))
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
System.out.println("Is parrot talking? ");
boolean p=sc.nextBoolean();
System.out.print("What is Hour? ");
int n1=sc.nextInt();
p7 m=new p7();
boolean i=m.hasTeen(n1, p);
System.out.print("\nAre you in trouble?"+ i);

}
}