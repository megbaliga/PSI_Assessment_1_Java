 // Java program to print an array after changing the rows and columns of a given twodimensional array.

 public class probstat4 {

	public static void main (String [] args) { //Main method
	
		//initializing
		int row = 2, col = 3;
		int [][] x = {{10, 20, 30}, {40, 50, 60}};
		int [][] y = new int[col][row]; //Initializing transpose matrix
		
		//transposing
		for ( int i =0; i <row; i++) {
			for(int j = 0; j< col; j++)
				y[j][i] = x[i][j]; //Transposing the matrix
		}
		
		//Printing original array
		System.out.println("Original array:");
		for ( int i =0; i <row; i++) { //Printing the original matrix
			for(int j = 0; j< col; j++)
				System.out.print(x[i][j] + " ");
			System.out.println();
		}
		
		
		//printing
		System.out.println("After changing the rows and columns of the said array:");
		for ( int i =0; i <col; i++) { //Printing the obtained transpose matrix
			for(int j = 0; j< row; j++)
				System.out.print(y[i][j] + " ");
			System.out.println();
		}
	}
 }
		