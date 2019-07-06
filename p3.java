import java.util.Scanner;
class p3{
boolean hasTeen(boolean c1, boolean c2)
{

if((c1==false)&&(c2==false))
return true;
if((c1==true)&&(c2==false))
return false;
if((c1==false)&&(c2==true))
return true;
else
return true;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Is it a weekday? true/false");
boolean c1=sc.nextBoolean();
System.out.println("Are you on vacation? true/false");
boolean c2=sc.nextBoolean();

p3 m=new p3();
boolean i=m.hasTeen(c1, c2);
System.out.println("You sleep? "+i);

}
}