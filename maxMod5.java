import java.util.Scanner;
class maxMod5
{
int maxMod5(int n1,int n2)
{
int n3=(n1>n2)?n2:n1;
int n4=(n1>n2)?n1:n2;
if((n1==n2))
return 0;
else if(n1%5==n2%5) 
return n3;
else
return n4;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
maxMod5 ht= new maxMod5();
System.out.print(ht.maxMod5(n1,n2));
}
}


