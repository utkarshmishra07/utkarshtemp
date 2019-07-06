import java.util.Scanner;
class Person{
	private String firstName;
	private String lastName;
	private char gender;
	private long num;

	Person(){
	}
	Person(String firstName, String lastName, char gender){
	this.firstName=firstName;
	this.lastName=lastName;
	this.gender=gender;
	}
	public String firstName(){
	return firstName;
	}
	public String lastName(){
	return lastName;
	}
	public char gender(){
	return gender;
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
	Person p1=new Person();
	Person p2=new Person("Divya", "Bharathi", 'F');
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Phone Number: ");
	long n=sc.nextLong();	
	p2.setNum(n);
	System.out.println("Person Details:\n______________\n\nFirst Name:"+p2.firstName()+"\nLast Name:"+p2.lastName()+"\nGender:" +p2.gender()+"\nAge: 20\nWeight: 85.55\nNumber: "+p2.getNum());
}	
}