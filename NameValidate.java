import java.util.Scanner;
class Validate{
	private String fname;
	private String lname;
	String fName(String fname)throws EmptyException{
	if(fname.trim().equals("")){
	throw new EmptyException("First Name cannot be blank");
	}
    	else
        	this.fname = fname;
	return fname;
}
	String lName(String lname)throws EmptyException{
	if(lname.trim().equals("")){
	throw new EmptyException("Last Name cannot be blank");
	}
    	else
        	this.lname = lname;
	return lname;
}

}




class EmptyException extends Exception{
	EmptyException(String message){
		super(message);	
	}
}
public class NameValidate{
	public static void main(String args[])throws EmptyException{
		String fname;
		String lname;
		Scanner sc = new Scanner(System.in);
		try{
		System.out.println("Enter Your first name:");
		Validate s1=new Validate();
		System.out.println("First name: "+s1.fName(sc.nextLine()));
		}catch(EmptyException e){
		System.out.println(e.getMessage());
		}
		
		try{System.out.println("Enter Your last name:");
		Validate s2=new Validate();
		System.out.println("Last name: "+s2.lName(sc.nextLine()));
		}catch (EmptyException e) {
		System.out.println(e.getMessage());
		}
	}
}