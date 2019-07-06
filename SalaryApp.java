import java.util.Scanner;
class Salary{
	protected double salary;
	Salary(double salary){
		this.salary=salary;
	}
	public double getSalary(){
		return salary;	
	}
	
}
class SalaryApp{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Welcome to Insurance Policy Portal \n ");
		System.out.println("Select your designation \n 1. System Associate 2.Programmer 3.Manager 4. Clerk");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter your salary:");
			double salary1= sc.nextDouble();
			Salary s1=new Salary(salary1);
			if((salary1>5000)||(salary1<20000)){
			System.out.println("Your Insurance scheme is Scheme C");			
			}else{
			System.out.println("Enter correct salary");
			}
		break;
		case 2:
			System.out.println("Enter your salary:");
			double salary2= sc.nextDouble();
			Salary s2=new Salary(salary2);
			if((salary2>=20000)||(salary2<40000)){
			System.out.println("Your Insurance scheme is Scheme B");			
			System.out.println("Enter correct salary");
			}else{
			System.out.println("Enter correct salary");
			}
		break;
		case 3:
			System.out.println("Enter your salary:");
			double salary3= sc.nextDouble();
			Salary s3=new Salary(salary3);
			if(salary3>=40000){
			System.out.println("Your Insurance scheme is Scheme A");			
			System.out.println("Enter correct salary");
			}else{
			System.out.println("Enter correct salary");
			}
		break;
		case 4:
			System.out.println("Enter your salary:");
			double salary4= sc.nextDouble();
			Salary s4=new Salary(salary4);
			if(salary4<5000){
			System.out.println("You don't have an Insurance Scheme");			
			System.out.println("Enter correct salary");
			}else{
			System.out.println("Enter correct salary");
			}
		break;
		default:
			System.out.println("Select a valid option");
		break;
		
		}
		}while(true);
		
	}
}