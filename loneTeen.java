import java.util.Scanner;
class loneTeen
{
boolean loneTeen(int n1,int n2)
{

if((n1>=13 && n1<=19)||(n2>12&& n2<20))
{
if((n1>=13 && n1<=19)&&(n2>12&& n2<20))
return false;
else
return true;
}
else
return false;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter three numbers: ");
int n1=sc.nextInt();
int n2=sc.nextInt();
loneTeen ht= new loneTeen();
System.out.print(ht.loneTeen(n1,n2));
}
}


