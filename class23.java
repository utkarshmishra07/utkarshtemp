class Person{
	private String firstName;
	private String lastName;
	private char gender;
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
}
class PersonMain{ 
public static void main(String args[]){
	Person p1=new Person();
	Person p2=new Person("Divya", "Bharathi", 'F');	
	System.out.println("Person Details:\n______________\n\nFirst Name:"+p2.firstName()+"\nLast Name:"+p2.lastName()+"\nGender:" +p2.gender()+"\nAge: 20\nWeight: 85.55");
}	
}