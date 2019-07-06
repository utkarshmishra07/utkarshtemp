import java.util.Scanner;
class teaParty
{
int teaParty(int n1,int n2)
{
if((n1>=5 && n2>=5))
{
if(n2>=(n1*2))
return 2;
else
return 1;
}
else
return 0;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of tea and candy: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
teaParty ht= new teaParty();
System.out.print(ht.teaParty(n1,n2));
}
}


