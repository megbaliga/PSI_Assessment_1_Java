// Java program that accepts two double variables and test if both strictly between 0
//and 1 and false otherwise.
import java.util.Scanner; //Importing java utils library (Scanner class) to take in input from user
class probstat2 {
	public static void main (String [] args) { //Main method
		Scanner x = new Scanner(System.in);//object x instantiated from Scanner class
		System.out.println("Enter first number :");
		double a = x.nextDouble(); //Taking in first double value from user
		System.out.println("Enter second number :");
		double b = x.nextDouble(); //Taking in second double value from user
		boolean c = false; //Setting boolean value c as false initially.
		if (a>0 && a<1 && b>0 && b<1) // if a and b both are between 0 and 1, setting c as true.
			c = true; 
		System.out.println(c);
		
	}
}
