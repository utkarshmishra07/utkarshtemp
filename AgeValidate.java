import java.util.Scanner;
class AgeValidate{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your age: ");
		int age=sc.nextInt();
		try{
			if(age<15)
			throw new AgeException("Invalid age entered");
			else{
			System.out.print("Age is: "+age);
			}
		}catch(AgeException e){
			System.out.println(e.getMessage());
		}
	}
}
class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}