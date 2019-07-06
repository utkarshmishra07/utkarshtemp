import java.util.Scanner;
class noTeenSum
{
int noTeenSum(int n1,int n2,int n3)
{
return fixTeen(n1)+fixTeen(n2)+fixTeen(n3);
}

int fixTeen(int n)
{
if((n>=13 && n<=19)&& (n!=15&&n!=16))
return 0;
else
return n;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter three numbers: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
noTeenSum ht= new noTeenSum();
System.out.println(ht.noTeenSum(n1,n2,n3));
}
}


