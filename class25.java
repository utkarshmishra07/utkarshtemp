import java.util.Scanner;
enum Gen
{M,F}
class Person{
	private String firstName;
	private String lastName;
	private char gender;
	private long num;

	Person(){
	}
	Person(String firstName, String lastName){
	this.firstName=firstName;
	this.lastName=lastName;

	}
	public String firstName(){
	return firstName;
	}
	public String lastName(){
	return lastName;
	}

	public long getNum(){

	return num;
	}
	public void setNum(long num){
	this.num=num;
	}

}

class PersonMain{ 
public static void main(String args[]){
	Gen ge;
	ge=Gen.F;
	Person p1=new Person();
	Person p2=new Person("Divya", "Bharathi");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Phone Number: ");
	long n=sc.nextLong();	
	p2.setNum(n);
	System.out.println("Person Details:\n______________\n\nFirst Name:"+p2.firstName()+"\nLast Name:"+p2.lastName()+"\nGender:" +ge+"\nAge: 20\nWeight: 85.55\nNumber: "+p2.getNum());
}	
}