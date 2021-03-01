//code to convert decimal to binary and count the number of binary 0s
import java.util.*; //importing java.utils library
class probstat6 {
	static void itob(int dec) { //creating method to convert decimal to binary
		int i = 0;
		String bi = Integer.toBinaryString(dec); //tobinarystring built-in function to convert integer to a binary string
		System.out.println();
		System.out.println("The obtained binary string after conversion is:");
		System.out.println(bi); //Printing binary string
		//Converting string to a character array and iterating through it
		for(char ch : bi.toCharArray()) { // can also be done as for(char ch : "abcdef".toCharArray()) { }
			if (ch == '0') //if 0, increasing count
				i = i +1;
		}	
		System.out.println(); //Line gap
		
		System.out.println("The number of zero bits is:" +i); //Printing number of zeroes
		
	}
	public static void main (String [] args) { //main method
	
		Scanner x = new Scanner(System.in); //x object created from scanner library
		System.out.println("Enter the integer number");
		int dec = x.nextInt();  //Taking in integer value from user
		itob(dec); //Calling method to convert integer to binary - dtob
	}
}