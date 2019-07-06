import java.util.Scanner;
class blueTicket
{
int blueTicket(int n1,int n2,int n3)
{
if(pairSum(n1,n2)==10||pairSum(n2,n3)==10||pairSum(n3,n1)==10)
{
 if(pairSum(n1,n2)+10==pairSum(n2,n3)+pairSum(n3,n1))
return 5;
else
return 10;
}
else
return 0;
}
int pairSum(int a,int b)
{
return a+b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
blueTicket ht= new blueTicket();
System.out.print(ht.blueTicket(n1,n2,n3));
}
}


