//Java program that accepts four integer from the user and prints equal if all four are
//equal, and not equal otherwise.
import java.util.Scanner; //Importing java utils library to take in input from user
class probstat1 { 		  //class
	public static void main (String [] args) { //Main method
		Scanner x = new Scanner(System.in); //object x instantiated from Scanner class
		System.out.println("Enter first number :");
		int a = x.nextInt();//Taking in first integer value from user
		System.out.println("Enter second number :");
		int b = x.nextInt();//Taking in second integer value from user
		System.out.println("Enter third number :");
		int c = x.nextInt();//Taking in third integer value from user
		System.out.println("Enter fourth number :");
		int d = x.nextInt();//Taking in fourth integer value from user
		if (a == b && b == c && c ==d) 
			System.out.println("The four numbers are equal!"); //If equal, printing equal
		else 
			System.out.println("The four numbers are not equal!"); //else, printing not equal
			
	}
}

		