// Java program to print the contents of a two-dimensional Boolean array where t will
//represent true and f will represent false.
import java.util.Scanner;
public class probstat3 {
	public static void main (String [] args) { //Main method
		Scanner g = new Scanner(System.in); //Instantiating object g of Scanner class
		System.out.println("Enter the number of rows:"); //Entering number of rows in boolean matrix
		int row = g.nextInt();
		System.out.println("Enter the number of columns:"); //Entering number of columns in boolean matrix
		int col = g.nextInt();
		boolean [][] x = new boolean[row][col]; //Initilaizing boolean matrix
		System.out.println("Enter the elements of the  matrix");
		for ( int i = 0; i < row; i ++) { //Entering values of boolean matrix -- either true or false
			System.out.println("Enter the elements of row -" +(i+1));
			for (int j = 0; j<col; j ++) {
				
				x[i][j] = g.nextBoolean();
			}
		
		}
				
		char [][] k = new char[row][col]; //Initializing character matrix of same size as boolean matrix
		
		

		for ( int i = 0; i <x.length; i ++){ // Iterating through the elements of the matrix
			for( int j = 0; j < x[i].length; j++) {
				if (x[i][j]== true) //Setting character array value as t if boolean array value is true
					k[i][j] = 't';
				else 				//Setting character array value as f if boolean array value is false
					k[i][j] = 'f';
			}
		}
		System.out.println("Obtained matrix is"); //Printing the character matrix
		//System.out.println(k); Converted to unicode value, didnt give characters.
		for ( int i = 0; i < k.length; i ++) { //setting row value
			for (int j = 0; j<k[i].length; j ++) //Setting column value
				System.out.print(k[i][j] + " ");
			System.out.println();
		}
		
	
	}

}
