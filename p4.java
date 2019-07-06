import java.util.Scanner;
class p4{
boolean hasTeen(boolean c1, boolean c2)
{

if((c1==true)&&(c2==true))
return true;
if((c1==true)&&(c2==false))
return false;
if((c1==false)&&(c2==true))
return false;
else
return true;

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Is monkey 1 smiiling? true/false");
boolean c1=sc.nextBoolean();
System.out.println("Is moneky 2 smiling? true/false");
boolean c2=sc.nextBoolean();

p4 m=new p4();
boolean i=m.hasTeen(c1, c2);
System.out.println("You are in trouble? "+i);

}
}